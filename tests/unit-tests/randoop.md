# Come generare ed eseguire test con Randoop su LedgerEntryPage

## 1. Generazione dei test con Randoop

Per generare i test automatici per la classe `LedgerEntryPage`:

```sh
java -classpath ./../tools/randoop-all-4.3.2.jar:target/classes:$(cat cp.txt) \
  randoop.main.Main gentests \
  --testclass=org.apache.bookkeeper.bookie.LedgerEntryPage \
  --time-limit=60 \
  --junit-output-dir=tests-randoop
```

---

## 2. Copia dei test generati nella cartella dei test

Copia i file `.java` generati da Randoop nella directory dei test del progetto:

```sh
cp tests-randoop/*.java src/test/java/org/apache/bookkeeper/randoop/
```

---

## 3. Compilazione ed esecuzione dei test generati

Per compilare ed eseguire i test generati da Randoop:

```sh
mvn -f pom.xml -e -X -Dtest=RegressionTest