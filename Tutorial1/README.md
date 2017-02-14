# Simplest maven project

See the pom.xml file to see what line is doing what

## Simple commands to try with maven

### Create jar file for maven:
```
mvn package
```

### Run maven project:
```
mvn exec:java -Dexec.mainClass="com.ayon.app.App"
```

### Run all unit tests:
```
mvn test
```

### Few other maven commands:
```
mvn compile
mvn clean
```



Project structure:
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