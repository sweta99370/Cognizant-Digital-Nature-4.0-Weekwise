# Exercise 6: Library Management System

---

## 1. Objective

The purpose of this exercise is to implement a simple **Library Management System** that allows users to search for books by title using search algorithms. The project demonstrates both **linear** and **binary search** techniques and evaluates their efficiency in different scenarios.

---

## 2. Search Algorithms Overview

### Linear Search

- Sequentially checks each book title until a match is found.  
- Suitable for **unsorted datasets**.  
- Simple to implement but **less efficient** for large datasets.

**Time Complexity:**

- Best Case: O(1)  
- Average/Worst Case: O(n)

---

### Binary Search

- Requires the dataset to be **sorted** by title.  
- Divides the search interval in half with each iteration.  
- More **efficient** than linear search for large, sorted datasets.

**Time Complexity:**

- Best Case: O(1)  
- Average/Worst Case: O(log n)

---

## 3. System Design

### Book Entity

Each book in the library contains:

- `bookId`: A unique identifier for the book  
- `title`: Title of the book  
- `author`: Author's name

### Core Operations

- **Add Book**: Insert a new book into the library system.  
- **Linear Search**: Find a book by title using a sequential search approach.  
- **Binary Search**: Search for a book by title in a sorted collection.  
- **Display All Books**: Show a list of all books currently in the system.

---

## 4. Functional Description

- The system allows initialization of a library with a fixed number of books.  
- Books can be added with their ID, title, and author.  
- Users can search for a book by title using either:
  - **Linear search**: applicable for unsorted data  
  - **Binary search**: performed after sorting the book list  
- The system returns the matching book if found, or a "not found" message otherwise.  
- All books can be listed for review and verification.

---
##6. Flowchart
Start
  |
  v
[Initialize TaskManager]
  |
  v
[Add Tasks]
  |
  v
-----------------------------
|                           |
v                           v
[Traverse All Tasks]     [Search Task by ID]
  |                           |
  v                           v
[Display Tasks]         [Found?]----No---->[Print "Not Found"]
  |                           |
  |                           Yes
  |                           |
  v                           v
[Continue]               [Display Task]
  |
  v
[Delete Task by ID]
  |
  v
[Task in Head?]---Yes--->[Head = Head.next]-->[Print "Deleted"]
  |
  No
  |
  v
[Traverse to find Task]
  |
  v
[Found?]---No--->[Print "Task Not Found"]
  |
  Yes
  |
  v
[Adjust Links to Remove Node]
  |
  v
[Print "Task Deleted"]
  |
  v
[Traverse All Tasks Again]
  |
  v
[Display Remaining Tasks]
  |
  v
End


## 5. Analysis

| Operation        | Linear Search | Binary Search   |
|------------------|----------------|------------------|
| Time Complexity  | O(n)           | O(log n)         |
| Requires Sorting | No             | Yes              |
| Best Case        | O(1)           | O(1)             |
| When to Use      | Unsorted or small datasets | Large and sorted datasets |

---

## 6. Conclusion

The **Library Management System** illustrates how different search algorithms can impact **performance and accuracy** based on data size and structure. While **linear search** is flexible and works on unsorted data, **binary search** is significantly faster but requires a **sorted collection**.

This project provides a **foundational understanding of search operations** in real-world applications.
