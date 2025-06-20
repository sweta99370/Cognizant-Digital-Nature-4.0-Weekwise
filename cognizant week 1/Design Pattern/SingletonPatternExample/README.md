# SingletonPatternExample

## Project Overview

This project demonstrates the Singleton Design Pattern in Java by implementing a thread-safe logging utility class. The goal is to ensure that only one instance of the `Logger` class exists throughout the application's lifecycle, promoting consistent logging behavior across components.

## Implementation Details

- **Singleton Class**: The `Logger` class is implemented using the Singleton design pattern with thread-safe lazy initialization.
- **Thread Safety**: Synchronization is used to ensure that only one instance of the `Logger` is created, even in multi-threaded environments.
- **Encapsulation**: The constructor is private to restrict object creation from outside the class.
- **Global Access Point**: A public static method provides access to the singleton instance.

## Project Objectives

- Enforce a single instance of the Logger class throughout the application.
- Provide a globally accessible, centralized logging utility.
- Ensure thread-safe creation of the singleton instance.
- Demonstrate the use of Singleton pattern in a real-world scenario.

## Testing and Validation

A separate test class is included to verify the following:

- Multiple calls to get the Logger instance return the same object.
- Logging messages through different references to the logger are consistent.
- Singleton behavior is maintained throughout the runtime of the application.

## Project Structure

SingletonPatternExample/
├── Logger.java // Singleton class implementation
└── LoggerTest.java // Test class to validate singleton behavior

##Flowchart
[Start]
   |
   v
[Open VS Code]
   |
   v
[Install Java Extension Pack]
   |
   v
[Create Project: SingletonPatternExample]
   |
   v
[Create Logger.java in src/]
   |
   v
[Write Singleton class with thread-safe getInstance()]
   |
   v
[Create LoggerTest.java in src/]
   |
   v
[In LoggerTest: Call Logger.getInstance()] --> (First Call)
   |
   v
[Check if instance == null?]
   |-- Yes --> [Synchronize + Create new Logger] --> [Print "Logger initialized."]
   |-- No --> [Return existing instance]
   |
   v
[logger1 logs first message]
   |
   v
[Call Logger.getInstance()] --> (Second Call)
   |
   v
[instance != null] --> [Return same Logger]
   |
   v
[logger2 logs second message]
   |
   v
[Check logger1 == logger2?]
   |-- Yes --> [Print: Singleton works]
   |-- No  --> [Print: Singleton failed]
   |
   v
[End]

## Key Concepts Demonstrated

- Singleton Design Pattern
- Object-Oriented Programming
- Thread Safety in Java
- Lazy Initialization
- Instance Control

## Use Cases

The Singleton pattern is suitable for scenarios where:

- A class must have only one instance accessible globally.
- Shared resources like loggers, configuration managers, or connection pools are required.
- Application-wide consistency and controlled access to an object are essential.
