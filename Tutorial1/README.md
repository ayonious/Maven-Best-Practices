# Simplest maven project

See the pom.xml file to see what line is doing what. This is the min pom.xml file that should be present for any maven repo

## Simple commands to try with maven

### Create jar file for maven:
```
mvn package
```

### Run maven project:
```
mvn exec:java -Dexec.mainClass="com.ayon.app.App"
```

### Compile project:
```
mvn compile
```

## Remove target folder and jar files
```
mvn clean
```

Project structure:
```
.
├── README.md
├── pom.xml
└── src
    └── main
        └── java
            └── com
                └── ayon
                    └── app
                        └── App.java
```
