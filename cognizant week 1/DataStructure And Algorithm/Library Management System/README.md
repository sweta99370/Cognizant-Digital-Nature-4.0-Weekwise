# Library Management System

## Overview

The **Library Management System** is a Java-based application designed to manage book records efficiently and provide two search mechanisms: **Linear Search** and **Binary Search**. This system demonstrates the comparative use of search algorithms in practical applications, especially in the context of static data structures like arrays.

---

## Features

- Add books to a library with a unique ID, title, and author name.
- Search for books by title using:
  - **Linear Search** – for unsorted collections.
  - **Binary Search** – for sorted collections.
- Display all available books in the system.

---

## Technologies Used

- Java
- Arrays
- Search Algorithms (Linear and Binary)

---

## File Structure

- `Book.java`  
  Contains the `Book` class representing individual book entries with attributes: `bookId`, `title`, and `author`.

- `Library.java`  
  Implements core functionalities such as:
  - Adding new books
  - Displaying all books
  - Linear and Binary search methods

- `Main.java`  
  Entry point of the application. It demonstrates how the system operates through a basic console interface.

---
## FlowChart
Start
  |
  v
[Initialize Library with fixed size]
  |
  v
[Add Books (with ID, Title, Author)]
  |
  v
[Display All Books]
  |
  v
[Search Options]
  |
  +--> [Linear Search] --> [Loop through array]
  |         |        
  |         +--> Match? --> Yes --> Display Book
  |                         No  --> Book not found
  |
  +--> [Binary Search]
            |
     [Sort books array]
            |
     [Binary Search logic]
            |
     Match? --> Yes --> Display Book
                No  --> Book not found
  |
  v
End


## Getting Started

### Prerequisites

Ensure you have Java Development Kit (JDK) installed. You can check this by running:

```bash
java -version
