# AdapterPatternExample

## Project Overview

This project demonstrates the Adapter Design Pattern in Java by simulating a payment processing system that integrates with multiple third-party payment gateways. Each gateway uses a different interface, and the Adapter Pattern enables the system to work with all of them through a common interface.

## Design Objective

The objective is to allow the system to interact with external payment gateways like PayPal and Stripe using a unified internal interface, without modifying the existing gateway implementations. This promotes compatibility, flexibility, and reusability.

## Implementation Overview

### Target Interface

A common interface, `PaymentProcessor`, defines the expected behavior for processing payments. It abstracts the payment process from the specific implementation of any external payment gateway.

### Adaptee Classes

Third-party classes (`PayPalGateway`, `StripeGateway`) represent the existing external systems with their own method names and logic.

### Adapter Classes

Adapter classes implement the `PaymentProcessor` interface and internally invoke the appropriate methods of their corresponding third-party classes. This allows the core application to remain decoupled from external dependencies.

### Test and Demonstration

A test class creates instances of each adapter and invokes the common `processPayment()` method, demonstrating seamless interaction with multiple gateways using a unified interface.

## Project Structure

AdapterPatternExample/
└── src/
├── PaymentProcessor.java
├── PayPalGateway.java
├── StripeGateway.java
├── PayPalAdapter.java
├── StripeAdapter.java
└── AdapterPatternTest.java


## Key Concepts Demonstrated

- Adapter Design Pattern
- Interface abstraction
- Integration of incompatible APIs
- Decoupling client code from third-party libraries

## Use Cases

The Adapter Pattern is ideal for:
- Integrating legacy or third-party systems into new applications.
- Providing a consistent interface to clients while supporting multiple incompatible interfaces.
- Promoting code maintainability when integrating external APIs.

##FLOWCHART
[Client: AdapterPatternTest]
         |
         v
[Wants to process a payment using PaymentProcessor interface]
         |
         v
[Instantiates an Adapter class]
         |    \
         |     \
         v      v
[PayPalAdapter]  [StripeAdapter]
     |                |
     v                v
[Holds reference]   [Holds reference]
[to PayPalGateway]  [to StripeGateway]
     |                |
     v                v
Calls processPayment() on Adapter
     |                |
     v                v
Adapter converts processPayment(amount)
     |                |
     v                v
→ Calls adaptee-specific method:
     |                |
     |          ┌─────┴────────┐
     |          |              |
     v          v              v
makePayment(amount)    sendPayment(amount)
   (PayPalGateway)        (StripeGateway)
         |                     |
         v                     v
Prints "Paid ₹X using PayPal" / "Paid ₹X using Stripe"
