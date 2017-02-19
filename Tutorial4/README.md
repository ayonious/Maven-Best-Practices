Take a look at the property section in the `pom.xml` file. This puts all the variables in one section of the `pom.xml` file

```
<properties>
    <junit.version>4.12</junit.version>
    <hamcrest.version>1.3</hamcrest.version>
    <guava.version>19.0</guava.version>
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
mvn clean compile
mvn exec:java -Dexec.mainClass="com.ayon.app.App"
```