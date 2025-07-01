# BuilderPatternExample

## Project Overview

This project demonstrates the Builder Design Pattern in Java through the construction of customizable `Computer` objects with optional components. The Builder Pattern is used to simplify the process of creating complex objects by providing a step-by-step configuration interface.

## Design Objective

The primary objective of this implementation is to construct complex objects (in this case, a `Computer`) in a controlled manner, avoiding telescoping constructors and ensuring code readability and maintainability.

## Implementation Overview

### Product Class

The `Computer` class represents the product to be constructed. It includes attributes such as CPU, RAM, storage, and GPU. The constructor of this class is private and only accessible through the Builder class.

### Builder Class

A static nested class named `Builder` is used to construct instances of the `Computer` class. It provides setter-like methods (e.g., `setCPU`, `setRAM`) that return the builder instance, enabling method chaining. Once configuration is complete, the `build()` method returns the final `Computer` object.

### Test and Demonstration

A test class (`BuilderTest`) demonstrates the creation of different configurations of the `Computer` object using the builder. This includes a basic PC and a gaming PC, each created using different builder sequences.

## Project Structure

BuilderPatternExample/
└── src/
├── Computer.java
└── BuilderTest.java


## Key Concepts Demonstrated

- Builder Design Pattern
- Encapsulation of complex construction logic
- Method chaining and fluent interface
- Immutability through final object creation

## Use Cases

The Builder Pattern is suitable for:
- Constructing objects with many optional parameters
- Avoiding multiple overloaded constructors
- Maintaining clarity when constructing complex structures like reports, GUI components, or hardware configurations



Text-Based Flowchart: Working of the Builder Pattern


[Client: BuilderTest]
        |
        v
Calls new Computer.Builder()
        |
        v
Uses method chaining to set attributes:
    ├── setCPU("Intel i5")
    ├── setRAM("8GB")
    ├── setStorage("512GB SSD")
    └── build()
        |
        v
[Inside build() method of Builder]
        |
        v
Creates new Computer object using private constructor
        |
        v
Computer constructor assigns:
    ├── this.cpu = builder.cpu
    ├── this.ram = builder.ram
    ├── this.storage = builder.storage
    └── this.gpu = builder.gpu (if provided)
        |
        v
Returns fully configured Computer object
        |
        v
Client calls showConfig() to display configuration
