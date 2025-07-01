 Inventory Management System                      
*************************************************************************************************************************************


Project Overview
-----------------

->The Inventory Management System is a simple Java-based application designed to manage and track products in a warehouse environment. It allows   
  users to perform basic operations like adding, updating, deleting, and displaying products. The system is implemented using core Java and appropriate data structures to ensure fast and efficient inventory operations.

Objective
---------
->The objective of this project is to demonstrate the practical use of data structures and algorithms in managing large inventories efficiently. 
 It focuses on real-time manipulation of data (products) and ensures that operations such as insertion, search, update, and deletion are optimized.

Concept
--------
->Inventory management involves tracking a large number of products. Efficient handling of this data is essential to reduce response time and 
  optimize system performance.

Key challenges include:
----------------------

->Fast retrieval and update of product information

->Maintaining consistency in data

->Scalability as inventory grows

->To address these, a suitable data structure is used — a HashMap, which offers average-case constant time complexity for most operations using 
  productId as the key.
->Data Structure Used
HashMap (productId → Product object)

Operation	                           Time Complexity (Average)
Add Product	                                   O(1)
Update Product	                               O(1)
Delete Product	                               O(1)
Display All                                    O(n)

Functional Modules
->Add Product: Insert a new product into the inventory using its unique ID.

->Update Product: Modify the details of an existing product.

->Delete Product: Remove a product from the inventory by ID.

->Display All Products: List all products with their details.

flowchart->
-----------
________________________________________________________________________________________________________________


                    +------------------------+
                    |  Start Application     |
                    +-----------+------------+
                                |
                                v
                   +------------+------------+
                   |    Display Main Menu    |
                   +------------+------------+
                                |
         +-----------+----------+----------+-----------+
         |           |                     |           |
         v           v                     v           v
   +-----+-----+ +---+-----------+   +------+-----+ +---+----+
   | Add Product | | Update Product |   | Delete     | | Exit |
   +-----+-----+ +---+-----------+   |   Product  | +--------+
         |           |             +------+-----+
         |           |                    |
         v           v                    v
  +------+-----+ +---+----------+   +-----+-------+
  | Insert into| | Find by ID & |   | Remove from|
  | HashMap    | | update fields|   | HashMap    |
  +------------+ +--------------+   +-------------+
         |
         v
 +-------+--------+
 | Display All    |
 | Products (O(n))|
 +----------------+
         |
         v
 +-------+--------+
 | Loop to Menu   |
 +----------------+

Limitations:
------------

1)No persistent storage: Data is lost once the program exits.

2)No GUI: The system runs on a command-line interface.

3)Product ID collisions are not handled beyond overwriting.

Possible Enhancements:
---------------------
1)Integrate with a relational database for persistence.

2)Implement a GUI using JavaFX or Swing.

3)Add filtering and sorting features.

4)Enable import/export of data from CSV or JSON files.