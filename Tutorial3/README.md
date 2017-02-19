# Passing command line args
```
mvn clean compile package
mvn exec:java -Dexec.mainClass="com.ayon.app.App" -Dexec.args="something here"
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
