# Deep Skilling Stage: Design Patterns and Data Structures
#week-1

This repository contains implementation exercises from the Digital Nurture 4.0 – Deep Skilling Stage program. It includes solved examples for Design Patterns and Data Structures & Algorithms in Java.

---

## Contents

### 1. Design Patterns
Location: `design patterns.docx`

This document contains hands-on exercises covering the most common design patterns in object-oriented software development.

#### Covered Patterns:
- Singleton Pattern: Ensures a class has only one instance.
- Factory Method Pattern: Creates objects without specifying the exact class.
- Builder Pattern: Constructs complex objects step by step.
- Adapter Pattern: Integrates incompatible interfaces.
- Decorator Pattern: Adds responsibilities dynamically.
- Proxy Pattern: Controls access to another object.
- Observer Pattern: Allows observer objects to receive updates.
- Strategy Pattern: Selects algorithm behavior at runtime.
- Command Pattern: Encapsulates requests as objects.
- MVC Pattern: Separates model, view, and controller logic.
- Dependency Injection: Decouples class dependencies.

Each pattern includes:
- Scenario and explanation
- Implementation steps
- Java code files
- Sample output

---

### 2. Data Structures & Algorithms
Location: `Data Structure And Algorithm.docx`

This document includes practical problems demonstrating the application of data structures and algorithms to real-world systems.

#### Covered Problems:
- Inventory Management System using HashMap
- E-commerce Search Function using Linear & Binary Search
- Sorting Customer Orders using Bubble Sort & Quick Sort
- Employee Management using Arrays
- Task Management System using Singly Linked List
- Library Management System using Linear & Binary Search
- Financial Forecasting using Recursive Algorithm

Each problem includes:
- Scenario and analysis
- Design decisions
- Java implementation files
- Time & space complexity analysis
- Sample output

---

## Technologies
- Language: Java
- Tools: VS Code / IntelliJ / Eclipse
- Concepts: OOP, Data Structures, Algorithms, Design Patterns

---

## How to Run
1. Clone or download the project.
2. Open in your favorite Java IDE.
3. Compile and run individual main classes from each pattern or problem.
4. Observe the output for each case.

---

## License
This educational content is part of the Deep Skilling Initiative and is intended for learning and development purposes only.

## Week 2: Git Operations, Java Unit Testing, and PL/SQL Programming


This repository contains all implementation tasks completed during **Week 2** of the Cognizant Deep Skilling Stage program. The week focused on three core areas:

- Hands-on version control with **Git** and **GitHub**
- Writing and executing **Java unit tests** using **JUnit** and **Mockito**
- Developing and testing **PL/SQL programs** using an online SQL editor

All Java exercises were performed using **Eclipse IDE**, and PL/SQL exercises were executed using an **online PL/SQL editor**.

---

## Contents

### 1. Git & GitHub Workflow

This section includes hands-on experience with essential and advanced Git operations. All commands were executed via terminal or PowerShell, and supporting screenshots are included.

#### Tasks Performed:
- Initializing and configuring Git repositories
- Linking local projects to GitHub using remotes
- Cloning repositories
- Adding and committing folders to existing repositories
- Resolving Git issues such as:
  - Remote rejected push due to outdated refs (`fetch first`)
  - Submodule errors
  - Removal of unwanted `.git` folders
- Executing Git configuration and cleanup commands
- Organizing nested projects under a single GitHub repository

#### Sample Commands Used:
git init
git remote add origin <repo-url>
git add .
git commit -m "Initial commit"
git push -u origin main
git pull --rebase
git config -f .git/config --remove-section submodule.<submodule-name>
Remove-Item -Recurse -Force <path-to-.git>


---

### 2. Java Unit Testing with JUnit & Mockito

This section includes test-driven development tasks using **JUnit 5**, **Mockito**, and **SLF4J**, executed within Maven projects in Eclipse.

#### Concepts Covered:
- Maven project structure (`pom.xml`, `src/main/java`, `src/test/java`)
- JUnit 5 annotations: `@Test`, `@Before`, `@After`
- Exception testing using `assertThrows`
- Timeout and performance testing
- Parameterized tests for multiple inputs
- Arrange-Act-Assert (AAA) pattern
- Mocking dependencies using Mockito
- Integrating SLF4J logging in test classes
- Using JUnit 4 in legacy test scenarios

#### Sample Exercises Performed:
- `EvenCheckerTest`: Parameterized test to verify even numbers
- `ExceptionThrowerTest`: Validates expected exceptions
- `PerformanceTesterTest`: Ensures methods run within time limits
- `ServiceTest`: Uses Mockito to test service logic with mocked objects
- `LoggerDemoTest`: Tests logging output with SLF4J

All tests were run using the Eclipse JUnit runner, and outputs were validated via console logs and assertions.

---

### 3. PL/SQL Programming

This section includes all PL/SQL programs executed and tested using an online SQL editor.

#### Concepts Covered:
- Creating and modifying tables
- Inserting multiple records into tables
- Writing and invoking stored procedures and functions
- Using `IF...ELSE` for conditional logic
- Handling exceptions with `WHEN OTHERS`
- Implementing cursors and loops for record iteration
- Understanding and resolving errors like `ORA-12541`

PL/SQL scripts were executed in an online environment. Output was validated using `SELECT` queries and `DBMS_OUTPUT.PUT_LINE`.

---

## Technologies Used

- **Languages**: Java, PL/SQL  
- **Tools**: Eclipse IDE (for Java), Online SQL Editor (for PL/SQL)  
- **Libraries**: JUnit 5, JUnit 4, Mockito, SLF4J  
- **Version Control**: Git, GitHub, GitBash  
- **Database Tools**: Online PL/SQL editor (or Oracle SQL Developer)

---

## How to Run

### Java Testing:
1. Open the Maven project in Eclipse.
2. Navigate to `src/test/java`.
3. Right-click the test class → Run As → JUnit Test.
4. Observe test results and logs in the console.

### PL/SQL Programming:
1. Open the `.sql` scripts in an online PL/SQL editor or Oracle SQL Developer.
2. Execute the scripts.
3. Use `SELECT` and `DBMS_OUTPUT` to verify outputs.

---

## Folder Structure

Cognizant-Week2/
│
├── Git-Exercises/
│ ├── screenshots/
│ └── commands-used.txt
│
├── Java-Testing/
│ ├── pom.xml
│ ├── src/
│ │ ├── main/java/
│ │ └── test/java/
│ └── test-cases/
│ ├── EvenCheckerTest.java
│ ├── ExceptionThrowerTest.java
│ ├── PerformanceTesterTest.java
│ ├── ServiceTest.java
│ └── LoggerDemoTest.java
│
├── PLSQL/
│ ├── create_tables.sql
│ ├── procedures.sql
│ └── exception_handling.sql


## Week 3: Spring Boot, Spring Data JPA, and SQL Server Integration

This week focuses on building backend applications using **Spring Boot** and **Spring Data JPA**, integrated with a **SQL Server database**. All development and testing were done using **Visual Studio Code** and **Microsoft SQL Server Management Studio (SSMS)**.

---

## Contents

### 1. Spring Boot Project Setup

This section covers the creation and configuration of a Spring Boot project using [Spring Initializr](https://start.spring.io/), including:

- **Group**: `com.cognizant`
- **Artifact**: `orm-learn`
- **Description**: `Demo project for Spring Data JPA and Hibernate`
- **Dependencies**:
  - Spring Data JPA
  - Spring Boot DevTools
  - SQL Server Driver (added manually if not listed)

#### Steps:
- Generated the project as a Maven project.
- Imported the project into VS Code.
- Configured `application.properties` to connect to the local SQL Server instance (`SQLEXPRESS01`).
- Verified the Java SDK path and Maven environment.

---

### 2. SQL Server Schema and Table Creation

This section includes SQL scripts used to create the database schema and required tables using SSMS.

sql```
CREATE DATABASE ormlearn;
GO

USE ormlearn;

CREATE TABLE country (
    code VARCHAR(2) PRIMARY KEY,
    name VARCHAR(50)
);

INSERT INTO country VALUES ('IN', 'India'), ('US', 'United States of America');


---
3. Entity and Repository Creation
Country.java (com.cognizant.ormlearn.model)
Annotated with @Entity, @Table, @Id, and @Column

Fields: code, name

CountryRepository.java (com.cognizant.ormlearn.repository)
Extends JpaRepository<Country, String>

Annotated with @Repository

4. Service Layer Implementation
CountryService.java (com.cognizant.ormlearn.service)
Annotated with @Service

Method: getAllCountries()

Uses @Transactional for transaction management

5. Application Testing
OrmLearnApplication.java
Loads Spring context

Retrieves CountryService bean

Invokes testGetAllCountries() to fetch data

Uses SLF4J logger for flow tracking

Technologies Used
Languages: Java, SQL

Frameworks: Spring Boot, Spring Data JPA

Database: Microsoft SQL Server

Tools: Visual Studio Code, SSMS

Build Tool: Maven

Logging: SLF4J

How to Run
Start SQL Server and ensure ormlearn database is running.

Open the project in VS Code.

Configure JDK path if needed.

Run the application using:
mvn spring-boot:run
Cognizant-Week3/
│
├── src/
│   ├── main/java/com/cognizant/ormlearn/
│   │   ├── OrmLearnApplication.java
│   │   ├── model/Country.java
│   │   ├── repository/CountryRepository.java
│   │   └── service/CountryService.java
│   └── resources/
│       └── application.properties
│
├── pom.xml
├── mvnw, mvnw.cmd
└── README.md


## License

This repository is part of Cognizant’s Deep Skilling Initiative and is intended solely for training and educational purposes.

