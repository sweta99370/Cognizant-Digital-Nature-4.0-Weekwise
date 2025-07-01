# Exercise 3: Sorting Customer Orders

---

## 1. Objective

The aim of this exercise is to implement sorting algorithms to organize customer orders by their **total price**. Sorting high-value orders at the top allows for prioritizing processing, improving logistics, and enhancing customer service in an e-commerce platform.

---

## 2. Understanding Sorting Algorithms

### 2.1 Bubble Sort
- Simple, comparison-based algorithm.
- Repeatedly swaps adjacent elements if they are in the wrong order.
- Best for **small datasets**.

**Time Complexity:**
- Best Case: O(n)
- Average Case: O(n²)
- Worst Case: O(n²)

---

### 2.2 Insertion Sort
- Builds the sorted array one element at a time.
- Efficient for **small or nearly sorted** datasets.

**Time Complexity:**
- Best Case: O(n)
- Average/Worst Case: O(n²)

---

### 2.3 Quick Sort
- Divide-and-conquer algorithm.
- Selects a pivot and partitions the array around it, recursively sorting partitions.
- Efficient for **large datasets**.

**Time Complexity:**
- Best/Average Case: O(n log n)
- Worst Case: O(n²) (e.g., poorly chosen pivots)

---

### 2.4 Merge Sort
- Recursively splits and merges the array.
- Consistent performance at the cost of additional memory.

**Time Complexity:**
- All Cases: O(n log n)  
**Space Complexity:** O(n)

---

## 3. System Setup

### 3.1 Class: `Order`

Models a customer order with the following attributes:

- `orderId`: Unique identifier for the order.
- `customerName`: Name of the customer.
- `totalPrice`: Total order price.

---

## 4. Implementation Details

The solution consists of **three Java files**:

### 4.1 `Order.java`
- Defines the `Order` class.
- Includes constructor and `toString()` for formatted output.

### 4.2 `SortUtil.java`
Implements sorting algorithms and a utility method to print orders.

**Key Methods:**
- `bubbleSort(Order[] orders)` → Sorts orders by totalPrice using Bubble Sort.
- `quickSort(Order[] orders, int low, int high)` → Sorts orders using Quick Sort.
- `printOrders(Order[] orders)` → Displays order information in the console.

### 4.3 `Main.java`
Handles:
- Creating sample `Order` data.
- Sorting using both Bubble Sort and Quick Sort.
- Printing results before and after sorting.

---

## 5. Functional Flow

### Workflow Diagram: Order Sorting Process

+----------------------------+
| Start Application |
+------------+--------------+
|
v
+------------+--------------+
| Create Array of Orders |
+------------+--------------+
|
v
+------------+--------------+
| Print Original Orders |
+------------+--------------+
|
v
+------------+--------------+
| Apply Bubble Sort |
+------------+--------------+
|
v
+------------+--------------+
| Print Bubble-Sorted List |
+------------+--------------+
|
v
+------------+--------------+
| Reset to Original Orders |
+------------+--------------+
|
v
+------------+--------------+
| Apply Quick Sort |
+------------+--------------+
|
v
+------------+--------------+
| Print Quick-Sorted List |
+------------+--------------+
|
v
+------------+--------------+
| End Program |
+---------------------------+




---

## 6. Analysis and Comparison

### 6.1 Performance Comparison

| Algorithm     | Best Case | Average Case | Worst Case | Space Complexity |
|---------------|-----------|--------------|------------|------------------|
| Bubble Sort   | O(n)      | O(n²)         | O(n²)      | O(1)             |
| Quick Sort    | O(n log n)| O(n log n)    | O(n²)*     | O(log n)         |

> *Worst case in Quick Sort occurs with unbalanced partitions (e.g., sorted input without random pivot). This can be mitigated using random or median-of-three pivot selection.*

### 6.2 Why Quick Sort is Preferred

- Efficient for **large datasets** due to O(n log n) average time.
- Performs well in practice with optimized pivot strategies.
- Bubble Sort is best used for educational purposes or small, temporary datasets.

---

## 7. Running the Program in VS Code

### Setup Steps:
1. Create a `src/` directory with the following files:
   - `Order.java`
   - `SortUtil.java`
   - `Main.java`

2. In VS Code:
   - Open `Main.java`
   - Run the program using:
     - Right-click → “Run Java Program”
     - Or press `Ctrl + F5` (Run Without Debugging)

3. View the sorted results in the terminal.

---

## 8. Conclusion

This exercise demonstrates the importance of selecting the right sorting algorithm for performance optimization. While **Bubble Sort** offers simplicity and clarity, **Quick Sort** excels in speed and scalability, making it the preferred choice for production systems.

Selecting the appropriate algorithm helps streamline real-world operations like sorting customer orders, prioritizing shipping, and boosting system efficiency in e-commerce applications.

---
