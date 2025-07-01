# Financial Forecasting System

## Project Description

The Financial Forecasting System is a Java-based tool that calculates the **Future Value (FV)** of an investment based on the given **principal amount**, **annual growth rate**, and **investment duration (in years)**. The system implements both **recursive** and **iterative** methods to demonstrate two approaches to the same problem—one for educational understanding and the other for performance optimization.

---

## Technologies Used

- Java
- Recursion
- Iteration
- Console-based Input and Output

---

## Files

- `FinanceForecast.java`  
  This file contains:
  - A recursive function to calculate the future value.
  - An optimized iterative version.
  - Input and output logic for user interaction.

---

## Features

- Accepts input for principal, interest rate, and number of years.
- Calculates the future value of an investment:
  - Using recursion.
  - Using iteration for better performance.
- Prints the result in a well-formatted manner.

---

##FlowChart

Start
  |
  v
[Input: Principal, Rate, Years]
  |
  v
[Call futureValue(principal, rate, years)]
  |
  v
[Years == 0?] 
   |
  Yes --> [Return Principal]
   |
  No
   |
  v
[Recursive Call: futureValue(principal, rate, years - 1)]
  |
  v
[Multiply result by (1 + rate)]
  |
  v
[Return Calculated Future Value]
  |
  v
[Print Future Value]
  |
  v
End



## How to Run

1. Open your terminal or command prompt.
2. Navigate to the directory containing `FinanceForecast.java`.
3. Compile the Java file:

   ```bash
   javac FinanceForecast.java
