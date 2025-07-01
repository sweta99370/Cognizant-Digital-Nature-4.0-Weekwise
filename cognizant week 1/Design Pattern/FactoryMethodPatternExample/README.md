# FactoryMethodPatternExample

## Project Overview

This project demonstrates the Factory Method Design Pattern by simulating a Document Management System. The goal is to create different types of documents—Word, PDF, and Excel—using a unified and extensible object creation mechanism.

## Design Objective

To achieve flexibility and scalability in object creation, this project adopts the Factory Method Pattern. Instead of instantiating document classes directly, the creation responsibility is delegated to factory classes. This encapsulates the instantiation logic and promotes loose coupling.

## Implementation Overview

### Document Abstraction

An interface defines a standard contract for all document types. This allows consistent behavior while supporting multiple concrete document implementations.

### Concrete Document Types

Three document types are implemented:
- Word Document
- PDF Document
- Excel Document

Each type conforms to the document interface and provides its specific implementation logic.

### Factory Abstraction

An abstract factory class declares the factory method responsible for creating document objects. This serves as the base for all concrete factories.

### Concrete Factories

Each document type has a dedicated factory class that overrides the factory method to return an instance of its corresponding document type.

### Test and Verification

A test class demonstrates the usage of factory classes to generate and interact with different document types without modifying existing creation logic. This confirms the extensibility and correctness of the Factory Method implementation.

## Project Structure

FactoryMethodPatternExample/
└── src/
├── Document.java
├── WordDocument.java
├── PdfDocument.java
├── ExcelDocument.java
├── DocumentFactory.java
├── WordFactory.java
├── PdfFactory.java
├── ExcelFactory.java
└── FactoryTest.java


## Key Concepts Demonstrated

- Factory Method Design Pattern
- Interface-based abstraction
- Loose coupling and object creation decoupling
- Open/Closed Principle of SOLID design

## Use Cases

This pattern is ideal for systems where:
- The exact types of objects to be created are determined at runtime.
- The system needs to be open for extension but closed for modification.
- Object creation logic should be encapsulated and reusable.

## flowchart
FactoryTest
│
├── Demonstrates usage of different factories to create and open documents
│
└── Document (Interface)
     └── Defines contract for all document types
          │
          ├── WordFactory (extends DocumentFactory)
          │    └── Creates WordDocument
          │         └── Implements document behavior for Word files
          │
          ├── PdfFactory (extends DocumentFactory)
          │    └── Creates PdfDocument
          │         └── Implements document behavior for PDF files
          │
          └── ExcelFactory (extends DocumentFactory)
               └── Creates ExcelDocument
                    └── Implements document behavior for Excel files

DocumentFactory (Abstract Class)
└── Declares factory method createDocument()
