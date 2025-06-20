# StrategyPatternExample

## Project Overview

This project demonstrates the **Strategy Design Pattern** through a payment system that allows dynamic selection of different payment methods (e.g., Credit Card, PayPal) at runtime. The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable without altering the clients that use them.

## Design Objective

The goal is to implement a flexible payment system where the payment method can be changed at runtime without modifying the context code. This encourages decoupling and adherence to the Open/Closed Principle.

## Implementation Overview

### Strategy Interface

An interface `PaymentStrategy` is defined with a method `pay(amount)` which all payment strategies must implement. This interface ensures a consistent method signature across different payment types.

### Concrete Strategies

Two concrete implementations are provided:
- `CreditCardPayment`: Implements credit card payment logic
- `PayPalPayment`: Implements PayPal payment logic

Each strategy defines how the payment is processed for the respective method.

### Context Class

The `PaymentContext` class holds a reference to a `PaymentStrategy` object. It delegates the payment process to the currently assigned strategy using the `makePayment()` method. The strategy can be changed at any time via the `setPaymentStrategy()` method.

### Test and Demonstration

A test class (`StrategyPatternTest`) illustrates how to switch between payment methods at runtime using the context class. This class shows multiple payments processed using different strategies.

## Project Structure

StrategyPatternExample/
└── src/
├── PaymentStrategy.java
├── CreditCardPayment.java
├── PayPalPayment.java
├── PaymentContext.java
└── StrategyPatternTest.java


## Key Concepts Demonstrated

- Strategy Design Pattern
- Runtime algorithm selection
- Decoupling behavior from context
- Open/Closed Principle (OCP)

## Use Cases

This pattern is well-suited for:
- Payment gateways supporting multiple methods
- Compression algorithms (ZIP, RAR, etc.)
- Sorting algorithms
- File parsers or data formatters


Working of the Strategy Pattern

[Client: StrategyPatternTest]
        |
        v
Creates PaymentContext instance
        |
        v
Creates two payment strategies:
    ├── CreditCardPayment("...5432")
    └── PayPalPayment("user@example.com")
        |
        v
Sets PaymentStrategy to CreditCardPayment
        |
        v
Calls makePayment(1200.50)
        |
        v
[PaymentContext delegates to CreditCardPayment.pay()]
        |
        v
Output: Payment processed via Credit Card

--- Strategy switch ---

Sets PaymentStrategy to PayPalPayment
        |
        v
Calls makePayment(850.00)
        |
        v
[PaymentContext delegates to PayPalPayment.pay()]
        |
        v
Output: Payment processed via PayPal
