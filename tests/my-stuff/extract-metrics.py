import sys
import xml.etree.ElementTree as ET

def calculate_coverage_metrics(covered, total):
   
    if total == 0:
        return 0.0
    return (covered / total) * 100


def extractMetricsFromMetricTag(metric):
    if metric is not None:
        covered_statements = int(metric.get('coveredstatements', 0))
        statements = int(metric.get('statements', 0))
        covered_conditionals = int(metric.get('coveredconditionals', 0))
        conditionals = int(metric.get('conditionals', 0))
        covered_elements = int(metric.get('coveredelements', 0))
        elements = int(metric.get('elements', 0))
        return {
                                'statement_copertura': calculate_coverage_metrics(covered_statements, statements),
                                'branch_decision_copertura': calculate_coverage_metrics(covered_conditionals, conditionals),
                                'elements_copertura': calculate_coverage_metrics(covered_elements, elements),
                                'raw_data': {
                                    'coveredstatements': covered_statements,
                                    'statements': statements,
                                    'coveredconditionals': covered_conditionals,
                                    'conditionals': conditionals,
                                    'coveredelements': covered_elements,
                                    'elements': elements
                                }
        }

from typing import List
from enum import Enum, auto
class ParserState(Enum):
    IDLE = auto()
    FUNCTION = auto()
    DONE = auto()

class SimpleParser:
 
    def __init__(self, lines: List[ET.Element]):
        self.lines = lines
        self.state = ParserState.IDLE 
        self.parsingFunction = None
        self.instructionStack = []
        self.parsedFunctions = []

    def generateFunction(self, line: ET.Element):
        #<line complexity="1" visibility="public" signature="LedgerEntryPage(int,int)" num="58" count="4" type="method"/>
        if line.get("type") == None or line.get("type")!="method":
            return None
        self.instructionStack = []
        function = {
            'signature':line.get("signature"),
            'complexity':line.get("complexity"),
            'count':int(line.get("count")),
            'visibility': line.get("visibility"),
            'lines': 0,
            'blocks': 0,
            'condition': 0,
            'visitedLines': 0,
            'visitedBlocks': 0,
            'visitedCondition': 0
        }

        return function
    
    def parseLine(self, line: ET.Element):
        if self.parsingFunction is None:
            return None
        
        if line.get("type") == "stmt":
            return {
                'type': 'stmt',
                'count':int(line.get("count", 0))
            }
        elif line.get("type") == "cond":
            return{
                'type': 'cond',
                'truecount': int(line.get("truecount", 0)),
                'falsecount': int(line.get("falsecount", 0)),
            }
        else:
            return None



    
    def set_state(self, new_state):
        if not isinstance(new_state, ParserState):
            raise ValueError("Invalid state")
        self.state = new_state
    
    def parse(self):
        if len(self.lines)==0: 
            return None
        for line in self.lines:
            if self.state==ParserState.IDLE:
                function = self.generateFunction(line)
                if function is None:
                    print("Classe malformata, non contiene funzioni.")
                    return None
                self.parsingFunction = function
                self.set_state(ParserState.FUNCTION)
                continue
            if self.state==ParserState.FUNCTION:
                dummy=self.generateFunction(line)
                if dummy is not None:
                    self.parsedFunctions.append(self.parsingFunction)
                    self.parsingFunction=dummy
                    continue
                decodeLine=self.parseLine(line)
                if decodeLine is not None:
                    if decodeLine['type'] == 'stmt':
                        self.parsingFunction['lines'] += 1
                        self.parsingFunction['visitedLines'] += 1 if decodeLine['count']!= 0 else 0
                    elif decodeLine['type'] == 'cond':
                        self.parsingFunction['condition'] += 2
                        self.parsingFunction['visitedCondition'] += 1 if decodeLine['truecount']!= 0 else 0
                        self.parsingFunction['visitedCondition'] += 1 if decodeLine['falsecount']!= 0 else   0
        if self.state == ParserState.FUNCTION and self.parsingFunction is not None:
            self.parsedFunctions.append(self.parsingFunction)
            self.set_state(ParserState.DONE)

        return self.parsedFunctions

def processCode(lines: List[ET.Element]):
    parser=SimpleParser(lines)
    return parser.parse()

def print_pretty(methods):
    if not methods:
        print("No methods to display.")
        return
    print(f"{'Signature':60} {'Complexity':>10} {'Count':>6} {'VisitedLines':>15} {'VisitedCondition':>20}")
    print("-" * 125)
    for m in methods:
        if m is None:
            continue
        print(f"{m['signature']:60} "
              f"{m['complexity']:>10} "
              f"{m['count']:>6} "
              f"{m['visitedLines']:>3}/{m['lines']:<10} "
              f"{m['visitedCondition']:>3}/{m['condition']:<10}")



def processClass(target_file_name,file_element):
    name_attribute = file_element.get('name')
    if name_attribute not in target_file_name:
        return None
    file_info = {
        'nome_file': name_attribute,
        'percorso_file': file_element.get('path'),
        'metriche_generali': {},
        'functions': [],
        'metricheCalcolate':None
    }
    # Estrai metriche generali del file
    file_metrics_element = file_element.find('metrics')
    if file_metrics_element is not None:
        try:
            file_info['metriche_generali'] = extractMetricsFromMetricTag(file_metrics_element)
        except ValueError:
            print(f"Attenzione: Impossibile convertire metriche numeriche per il file '{target_file_name}'.")
    parsedFunctions=processCode(file_element.findall('line'))
    #print_pretty(parsedFunctions)
    file_info['functions'] = parsedFunctions
    totalConditionals = 0
    totalViditedConditionals = 0
    totalLines = 0
    totalVisitedLines = 0
    functionsNumber = len(file_info['functions'])
    visitedFucntions = 0
    meanPerecentVisitedLines = 0
    meanCount = 0
    meanPerecentVisitedConditionals = 0

    for function in file_info['functions']:
        lines= function['lines']
        visitedLines = function['visitedLines']
        condition = function['condition']
        visitedCondition = function['visitedCondition']
        count = function['count']
        if count > 0:
            meanCount += count
            visitedFucntions += 1
        totalLines += lines
        totalVisitedLines += visitedLines
        totalConditionals += condition
        totalViditedConditionals += visitedCondition
        meanPerecentVisitedLines += (visitedLines / lines) if lines > 0 else 0
        meanPerecentVisitedConditionals += (visitedCondition / condition) if condition > 0 else 0
    meanPerecentVisitedConditionals/= functionsNumber if functionsNumber > 0 else 0
    meanPerecentVisitedLines/= functionsNumber if functionsNumber > 0 else 0
    meanCount /= functionsNumber if functionsNumber > 0 else 0
    file_info['metriche_calcolate'] = {
        'meanPerecentVisitedLines': meanPerecentVisitedLines * 100,
        'meanPerecentVisitedConditionals': meanPerecentVisitedConditionals * 100,
        'totalLines': totalLines,
        'totalVisitedLines': totalVisitedLines,
        'percentageVisitedLines' : calculate_coverage_metrics(totalVisitedLines, totalLines),
        'percentageVisitedConditionals': calculate_coverage_metrics(totalViditedConditionals, totalConditionals),
        'totalConditionals': totalConditionals,
        'totalVisitedConditionals': totalViditedConditionals,
        'functionsNumber': functionsNumber,
        'visitedFucntions': visitedFucntions,
        'meanCount': meanCount
    }
    return file_info
    
        
    return file_info
    extracted_data.append(file_info)




def extract_file_content(xml_file_path, file_names_to_extract):
    extracted_data = []
    try:
        tree = ET.parse(xml_file_path)
        root = tree.getroot()
        for file_element in root.findall('.//file'):
            
                file_info=processClass(file_names_to_extract,file_element)
                if file_info is None: # Se il file non è stato trovato nell'XML
                    continue
                extracted_data.append(file_info)

    
        
        return extracted_data

    except FileNotFoundError:
        print(f"Errore: File XML non trovato: '{xml_file_path}'")
    except ET.ParseError:
        print(f"Errore: Impossibile parsare XML '{xml_file_path}'.")
    except Exception as e:
        print(f"Errore inatteso: {e}")
    return []

def print_summary(stats):
    if not stats:
        print("No statistics to display.")
        return

    print("====== Coverage Summary ======")
    print(f"Functions Total:           {stats.get('functionsNumber', 0)}")
    print(f"Functions Visited:         {stats.get('visitedFucntions', 0)}")
    print(f"Mean visits per function:                {stats.get('meanCount', 0):.2f}")
    print(f"Total Lines:               {stats.get('totalLines', 0)}")
    print(f"Visited Lines:             {stats.get('totalVisitedLines', 0)}")
    print(f"Mean % Visited Lines:      {stats.get('meanPerecentVisitedLines', 0):.2f}%")
    print(f"Total Conditionals:        {stats.get('totalConditionals', 0)}")
    print(f"Visited Conditionals:      {stats.get('totalVisitedConditionals', 0)}")
    print(f"Mean % Visited Conditionals: {stats.get('meanPerecentVisitedConditionals', 0):.2f}%")
    print("==============================")



def write_report(results, output_path=None):
    import sys
    out = open(output_path, "w") if output_path else sys.stdout

    for file_data in results:
        print(f"\n--- Riepilogo Copertura per il File: {file_data['nome_file']} ---", file=out)
        if file_data is not None:
            stats = file_data.get('metriche_calcolate', {})
            print("====== Coverage Summary ======", file=out)
            print(f"Functions Total:                {stats.get('functionsNumber', 0)}", file=out)
            print(f"Functions Visited:              {stats.get('visitedFucntions', 0)}", file=out)
            print(f"Mean visits per function:       {stats.get('meanCount', 0):.2f}", file=out)
            print(f"Total Lines:                    {stats.get('totalLines', 0)}", file=out)
            print(f"Visited Lines:                  {stats.get('totalVisitedLines', 0)}", file=out)
            print(f"% Visited Lines:           {stats.get('percentageVisitedLines', 0):.2f}%", file=out)            
            print(f"Mean % Visited Lines:           {stats.get('meanPerecentVisitedLines', 0):.2f}%", file=out)
            print(f"Total Conditionals:             {stats.get('totalConditionals', 0)}", file=out)
            print(f"Visited Conditionals:           {stats.get('totalVisitedConditionals', 0)}", file=out)
            print(f"% Visited Conditionals:    {stats.get('percentageVisitedConditionals', 0):.2f}%", file=out)
            print(f"Mean % Visited Conditionals:    {stats.get('meanPerecentVisitedConditionals', 0):.2f}%", file=out)
            print("=" * 40, file=out)
            print(f"{'Signature':60} {'Complexity':>10} {'Count':>6} {'VisitedLines':>15} {'VisitedCondition':>20}", file=out)
            print("-" * 125, file=out)
            for m in file_data['functions']:
                if m is None:
                    continue
                print(f"{m['signature']:60} "
                      f"{m['complexity']:>10} "
                      f"{m['count']:>6} "
                      f"{m['visitedLines']:>3}/{m['lines']:<10} "
                      f"{m['visitedCondition']:>3}/{m['condition']:<10}", file=out)
        else:
            print("\n  Nessuna classe trovata con metriche di copertura.", file=out)
    if output_path:
        out.close()
if __name__ == "__main__":
    if len(sys.argv) < 3:
        print("Uso: python script_name.py <file_xml> <nome_file1> [nome_file2 ...] [output_file]")
        print("Esempio: python script_name.py mio_dati.xml LedgerEntryPage.java AltroFile.txt output.txt")
        sys.exit(1)

    xml_file = sys.argv[1]
    files_to_find = sys.argv[2:-1] if len(sys.argv) > 3 and sys.argv[-1].endswith('.txt') else sys.argv[2:]
    output_file = sys.argv[-1] if len(sys.argv) > 3 and sys.argv[-1].endswith('.txt') else None

    results = extract_file_content(xml_file, files_to_find)

    if results:
        write_report(results, output_file)