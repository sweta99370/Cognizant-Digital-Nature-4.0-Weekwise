Exercise 2: E-commerce Platform Search Function
*************************************************************************************************************

1. Objective
---------------
->The purpose of this exercise is to design and implement an efficient search system for an e-commerce platform. The system allows users to search 
  for products by attributes such as product name and category. This functionality is critical for enhancing the customer experience by minimizing search time.

2. Understanding Key Concepts
------------------------------
2.1 Big O Notation
->Big O notation is used to describe the performance (time or space complexity) of algorithms in terms of input size.
->It helps evaluate the scalability and efficiency of algorithms, especially important for large-scale applications like e-commerce platforms.

2.2 Search Case Scenarios
--------------------------
Search Method	Best Case	Average Case	Worst Case
-------------   ---------   ------------    ----------
Linear Search	O(1)	O(n)	O(n)
Binary Search	O(1)	O(log n)	O(log n)



->Best Case: The target element is found in the first step.

->Average Case: The element is located midway through the data.

->Worst Case: The element is not found or is at the end of the dataset.

3. System Setup
----------------
3.1 Product Entity Design
->Each product in the system has the following attributes:
->productId – Unique identifier for the product
->productName – Name of the product
->category – Category to which the product belongs

3.2 Data Storage
-----------------
->Products are stored in an array structure.
Two approaches are considered:
1)Unsorted array for linear search
2)Sorted array for binary search

4. Implementation Approach
----------------------------
4.1 Linear Search
->Iteratively compares each product’s name with the search term.
->Works on unsorted data.
->Simple but not efficient for large datasets.

4.2 Binary Search
->Requires sorted data based on productName.
->Divides the array into halves and compares the middle element with the target.
->Highly efficient for large, sorted datasets.

5. Functional Flow
-------------------
5.1 Workflow Description
->The user enters a product name to search.
->The system checks whether the product list is sorted.
->If sorted, binary search is used.
->If not sorted, linear search is applied.
->The result (product found or not found) is displayed.

5.2 Flowchart: Product Search Process

______________________________________________________________________________________________________________________-
                +------------------------+
                |   Start Application   |
                +-----------+------------+
                            |
                            v
                 +----------+-----------+
                 |   Input Product Name |
                 +----------+-----------+
                            |
                            v
              +-------------+--------------+
              | Is Product List Sorted?   |
              +------+--------+-----------+
                     |        |
                 Yes |        | No
                     v        v
        +------------+--+  +-------------------+
        | Use Binary   |  | Use Linear Search |
        | Search       |  +-------------------+
        +------+-------+
               |
               v
      +--------+--------+
      | Product Found?  |
      +----+-------+----+
           |       |
         Yes       No
           |       |
           v       v
+----------+--+ +---+-----------------+
| Show Product | | Show "Not Found"  |
+--------------+ +-------------------+
           |
           v
+----------+----------+
| Return to Main Menu |
+---------------------+


6. Analysis
------------------
6.1 Performance Comparison
Criteria                	Linear Search	              Binary Search
--------                    --------------                ---------------
Data Requirement	       Works on any data	      Requires sorted data
Time Complexity	                 O(n)	                     O(log n)
Implementation	                Simple	                     Moderate
Performance (Large Data)	     Poor	                     Excellent
Best Use Case	           Small or unsorted          datasetLarge, sorted dataset

6.2 Use Case Consideration
----------------------
->Use Linear Search when:
->The dataset is small.
->Data changes frequently (sorting not practical).
->Use Binary Search when:
->Dataset is large and relatively static.
->Sorting the data improves search efficiency.

7. Recommendations for Real-World Application
---------------------------------------------
->For a real e-commerce platform with thousands to millions of products, consider:
->HashMaps for constant-time product ID lookup.
->Tries for efficient prefix-based search (auto-suggestions).
->Inverted Indexes for full-text search capabilities.
->Search Engines like Elasticsearch for advanced filtering, fuzzy search, and performance at scale.

8. Conclusion
-------------
Efficient search functionality is vital for user experience in an e-commerce environment. By understanding the use cases and limitations of linear and binary search, appropriate algorithms can be selected based on dataset characteristics and performance goals.

Binary Search is the preferred choice for large, sorted data, while Linear Search remains a simple fallback for small or unsorted datasets.