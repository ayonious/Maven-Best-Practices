Extending Tutorial4. Now setting one property through command line.

```
<properties>
    <junit.version>4.12</junit.version>
    <hamcrest.version>1.3</hamcrest.version>
    <!-- This is the part will be set through command line
    <guava.version>19.0</guava.version>
    -->
  </properties>
```

## tree
```
.
├── README.md
├── pom.xml
└── src
    ├── main
    │   └── java
    │       └── com
    │           └── ayon
    │               └── app
    │                   └── App.java
    └── test
        └── java
            └── com
                └── ayon
                    └── app
                        └── AppTest.java
```


Run:
```
mvn clean compile -Dguava.version="19.0"
mvn exec:java -Dexec.mainClass="com.ayon.app.App" -Dguava.version="19.0"
```