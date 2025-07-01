# ObserverPatternExample

## Project Overview

This project demonstrates the **Observer Design Pattern** in the context of a stock market monitoring application. The Observer Pattern enables a one-to-many dependency between objects, where changes to one object (the subject) are automatically communicated to multiple dependent objects (observers).

## Design Objective

The objective is to notify registered clients (such as mobile and web applications) whenever the stock price changes. This eliminates the need for manual polling and promotes a reactive system architecture.

## Implementation Overview

### Subject Interface

An interface `Stock` is defined with methods to:
- `registerObserver()`: Add observers to the list
- `removeObserver()`: Remove observers from the list
- `notifyObservers()`: Inform all observers of state changes

### Concrete Subject

The class `StockMarket` implements the `Stock` interface. It maintains a list of registered observers and a stock price value. Whenever the price changes, it notifies all registered observers using the `update()` method.

### Observer Interface

The `Observer` interface defines a method `update()` which is called by the subject whenever a state change occurs.

### Concrete Observers

Two concrete implementations of the `Observer` interface are provided:
- `MobileApp`: Represents mobile-based clients
- `WebApp`: Represents web-based clients

Each observer prints the updated stock price upon receiving a notification.

### Test and Demonstration

A test class (`ObserverTest`) simulates the registration of observers and stock price changes, demonstrating how updates are automatically pushed to all subscribed clients.

## Project Structure

ObserverPatternExample/
└── src/
├── Stock.java
├── StockMarket.java
├── Observer.java
├── MobileApp.java
├── WebApp.java
└── ObserverTest.java


## Key Concepts Demonstrated

- Observer Design Pattern
- Loose coupling between components
- Publish-subscribe event handling
- Real-time client update mechanism

## Use Cases

The Observer Pattern is applicable in:
- Stock market monitoring systems
- GUI event listeners
- Notification systems
- Distributed systems requiring state propagation


Working of the Observer Pattern


[Client: ObserverTest]
        |
        v
Creates StockMarket instance
        |
        v
Registers observers:
    ├── MobileApp("MobileApp1")
    └── WebApp("WebApp1")
        |
        v
Sets stock price to 100.50
        |
        v
[StockMarket calls notifyObservers()]
        |
        v
notifyObservers() iterates over registered observers
        |
        ├── MobileApp.update(100.50)
        └── WebApp.update(100.50)
              |
              v
Observers display updated stock price
        |
        v
Sets stock price to 105.75
        |
        ├── notifyObservers()
        ├── MobileApp.update(105.75)
        └── WebApp.update(105.75)
        |
        v
Removes WebApp from observers
        |
        v
Sets stock price to 110.00
        |
        ├── notifyObservers()
        └── MobileApp.update(110.00)
