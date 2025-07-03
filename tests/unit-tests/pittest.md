## Configurazione PIT nel `pom.xml` di `bookkeeper-server`

## 1. Modifiche al `pom.xml`

Aggiungi il plugin PIT nella sezione `<plugins>`:

```xml
<plugin>
  <groupId>org.pitest</groupId>
  <artifactId>pitest-maven</artifactId>
  <version>1.15.2</version>
  <configuration>
    <testPlugin>junit5</testPlugin>
  </configuration>
</plugin>
```

Aggiungi la dipendenza PIT JUnit5 nella sezione `<dependencies>`:

```xml
<dependency>
  <groupId>org.pitest</groupId>
  <artifactId>pitest-junit5-plugin</artifactId>
  <version>1.2.1</version> <!-- verifica se esiste una versione più recente -->
</dependency>
```

---

# Come eseguire i test di mutazione con PIT su LedgerEntryPage

## 1. Compilazione ed esecuzione dei test unitari

Per compilare ed eseguire il test personalizzato( se non gia compilato):

```sh
mvn -f pom.xml -e -X -Dtest=LedgerEntryPageCostumTest test
```

---

## 2. Esecuzione dei test di mutazione con PIT

Per eseguire PIT sui test della classe `LedgerEntryPage`:

```sh
mvn org.pitest:pitest-maven:mutationCoverage \
    -DtargetClasses=org.apache.bookkeeper.bookie.LedgerEntryPage \
    -DtargetTests=org.apache.bookkeeper.bookie.LedgerEntryPageCostumTest \
    -DtestPlugin=junit5 -X
```