<dependency>
  <groupId>org.evosuite</groupId>
  <artifactId>evosuite-standalone-runtime</artifactId>
  <version>1.0.6</version>

  <exclusions>
    <exclusion>
      <groupId>org.slf4j</groupId>
      <artifactId>*</artifactId>
    </exclusion>
  </exclusions>
</dependency>
ho dovuto cambiare un pochino LoggerOutput per accomodare l'interfaccia che slf4j.event.LoggingEvent utilizza, questo per potere usare i test generati da evosuite nel test cycle di meaven


java -jar ./../tools/evosuite-1.0.6.jar -class org.apache.bookkeeper.bookie.LedgerEntryPage  -projectCP ./../bookkeeper-common/target/classes/:target/classes/