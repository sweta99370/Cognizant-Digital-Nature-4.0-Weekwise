# MVCPatternExample

## Project Overview

This project demonstrates the **Model-View-Controller (MVC)** architectural pattern through a basic Student Record Management System in Java. The MVC pattern separates application logic into three interconnected components to enable efficient code organization and maintainability.

## Design Objective

The objective of this project is to create a simple, extensible student information system in which:
- The **Model** holds the student data.
- The **View** is responsible for rendering the data.
- The **Controller** mediates between the model and the view.

## Implementation Overview

### 1. Model

The `Student` class represents the data model. It includes attributes such as `name`, `id`, and `grade`, along with appropriate getters and setters.

### 2. View

The `StudentView` class is responsible for presenting the data. It includes a method `displayStudentDetails()` which prints the student information in a user-friendly format.

### 3. Controller

The `StudentController` class manages the data flow between the model and the view. It allows modification of model attributes and calls the view to display the updated information.

### 4. Test Class

The `MVCPatternTest` class creates instances of the model, view, and controller. It demonstrates how to:
- Initialize a student record.
- Display it via the view.
- Update model attributes via the controller.
- Reflect updates using the view again.

## Project Structure

MVCPatternExample/
└── src/
├── Student.java
├── StudentView.java
├── StudentController.java
└── MVCPatternTest.java


## Key Concepts Demonstrated

- MVC Architectural Pattern
- Separation of Concerns
- Decoupling of logic and presentation
- Reusability and maintainability

## Use Cases

This pattern is widely used in:
- Web applications
- GUI-based applications
- Frameworks like Spring MVC, Django (Python), and ASP.NET MVC

Working of the MVC Pattern

[Client/Main: MVCPatternTest]
        |
        v
Creates Student object (Model)
        |
        v
Creates StudentView object (View)
        |
        v
Creates StudentController with:
        └── model = Student
        └── view = StudentView
        |
        v
controller.updateView()
        └── Calls view.displayStudentDetails()
              └── Displays: Name, ID, Grade
        |
        v
controller.setStudentName("Bob")
controller.setStudentGrade("A+")
        |
        v
controller.updateView()
        └── Calls view.displayStudentDetails()
              └── Displays: Updated Name, ID, Grade
