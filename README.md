# Dummy Java Project

This is a simple Java project created to demonstrate a Jenkins pipeline for building and testing a Java application using Maven.

## Project Structure

```
dummy-java-project
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── App.java
│   │   └── resources
│   │       └── application.properties
│   ├── test
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── AppTest.java
│   │   └── resources
├── pom.xml
└── README.md
```

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Apache Maven 3.6 or higher

## Building the Project

To build the project, navigate to the project directory and run the following command:

```
mvn clean package
```

This command will compile the source code, run the tests, and package the application into a JAR file located in the `target` directory.

## Running the Application

After building the project, you can run the application using the following command:

```
java -jar target/dummy-java-project-1.0-SNAPSHOT.jar
```

## Running Tests

To run the tests, you can use the following Maven command:

```
mvn test
```

This will execute the unit tests defined in the `AppTest.java` file.

## Jenkins Pipeline

This project is set up to be integrated with Jenkins for continuous integration and deployment. You can create a Jenkins pipeline that triggers on code commits, builds the project, runs tests, and deploys the JAR file.

## License

This project is licensed under the MIT License - see the LICENSE file for details.