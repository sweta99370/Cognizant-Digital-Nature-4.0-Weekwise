# Exercise 4: Employee Management System

---

## 1. Objective

The objective of this exercise is to design a basic **Employee Management System** that stores and manages employee records efficiently using **arrays**. The system should support the following core operations:

- Adding new employees  
- Searching employees by ID  
- Traversing (displaying) all employee records  
- Deleting employee records by ID  

---

## 2. Understanding Key Concepts

### 2.1 Array Representation in Memory

Arrays are stored in a contiguous memory block, allowing each element to be accessed using the formula:


This enables **O(1) random access**, making read operations efficient.

### 2.2 Advantages of Arrays

- Direct, index-based access to elements  
- Simple and easy to implement  
- Ideal for **static-size** datasets  

---

## 3. System Setup

### 3.1 Employee Entity Design

Each employee record includes the following fields:

- `employeeId`: Unique identifier  
- `name`: Full name of the employee  
- `position`: Job title or designation  
- `salary`: Current salary amount  

### 3.2 Data Storage

A **fixed-size array** is used to store employee records, supporting these operations:

- Add an employee  
- Search an employee by ID  
- Traverse (display) all employees  
- Delete an employee by ID  

---

## 4. Functional Flow

### 4.1 Workflow Description

1. Initialize the system with a fixed-size array.  
2. Add employee records to the array.  
3. Display all employee records.  
4. Search for an employee by their ID.  
5. Delete a record by ID and shift the elements accordingly.  
6. End the application or repeat operations in a loop.

---

### 4.2 Flowchart 

+-------------------------+
| Start Application       |
+------------+------------+
             |
             v
+------------+------------+
| Initialize Employee Array|
+------------+------------+
             |
             v
+------------+------------+
| Add Employee Record     |
+------------+------------+
             |
             v
+------------+------------+
| Traverse All Employees  |
+------------+------------+
             |
             v
+------------+------------+
| Search by Employee ID   |
+------------+------------+
             |
             v
+------------+------------+
| Delete by Employee ID   |
+------------+------------+
             |
             v
+------------+------------+
| End Application         |
+-------------------------+

## 5. Analysis

### 5.1 Time Complexity of Operations

| Operation | Time Complexity | Description                        |
|-----------|------------------|------------------------------------|
| Add       | O(1)             | Insert at the next available index |
| Search    | O(n)             | Linear scan using employee ID      |
| Traverse  | O(n)             | Print all records                  |
| Delete    | O(n)             | Search + shift elements            |

---

## 6. Use Case Considerations

### 6.1 Limitations of Arrays

- **Fixed Size**: Cannot resize once initialized  
- **Costly Modifications**: Insertions/deletions require shifting  
- **Wasted Space**: May lead to unused memory if overestimated

### 6.2 When to Use Arrays

- Dataset size is fixed and known  
- Random access is required  
- Updates to the dataset are infrequent

---

## 7. Conclusion

The Employee Management System using arrays offers a simple and efficient structure for handling a **fixed number of employee records**.

###  Benefits:

- Fast random access  
- Easy implementation  
- Efficient for small datasets

### Considerations:

For larger or dynamic systems, consider using more flexible data structures like:

- **ArrayLists**  
- **LinkedLists**  
- **HashMaps**

to improve scalability and maintainability.



