# Configurazione e Utilizzo di Clover Maven Plugin

## Esempio di configurazione del plugin

```xml
<plugin>
    <groupId>org.openclover</groupId>
    <artifactId>clover-maven-plugin</artifactId>
    <version>4.5.2</version> <!-- verifica se esiste una versione più recente -->
    <configuration>
        <formats>
            <format>html</format>
            <format>xml</format>
        </formats>
        <!-- Opzionale: puoi impostare cloverDatabase su target/clover/clover.db -->
    </configuration>
    <executions>
        <execution>
            <id>instrument</id>
            <phase>process-test-classes</phase>
            <goals>
                <goal>instrument</goal>
            </goals>
        </execution>
        <execution>
            <id>aggregate</id>
            <phase>verify</phase>
            <goals>
                <goal>aggregate</goal>
            </goals>
        </execution>
        <execution>
            <id>clover-report</id>
            <phase>verify</phase>
            <goals>
                <goal>clover</goal>
            </goals>
        </execution>
    </executions>
</plugin>
```

---

## Come generare i report di Clover

Per eseguire i test e generare i report di copertura Clover solo per alcune classi di test specifiche, usa il comando:

```sh
mvn clean clover:setup test \
    -Dtest=LedgerEntryPageCostumTest,RegressionTest,LedgerEntryPage_ESTest \
    clover:aggregate clover:clover
```

- Questo comando strumenta il codice, esegue solo i test specificati e genera i report Clover sia in formato HTML che XML.

---

## Come generare le statistiche con lo script Python

Per generare un file di statistiche utilizzando lo script Python personalizzato, esegui:

```sh
python3 <project root>/tests/my-stuff/extract-metrics.py \
    target/site/clover/clover.xml \
    <ClasseDaValutare.java> <AltraClasse.java> ... output.txt
```

- Sostituisci `<ClasseDaValutare.java>`, `<AltraClasse.java>`, ecc. con i nomi delle classi Java che vuoi valutare.
- I risultati verranno scritti nel file `output.txt`.