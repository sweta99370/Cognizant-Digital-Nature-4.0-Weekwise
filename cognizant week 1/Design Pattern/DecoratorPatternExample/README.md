# DecoratorPatternExample

## Project Overview

This project demonstrates the **Decorator Design Pattern** by building a flexible notification system. The system can dynamically extend its capabilities by adding multiple notification channels such as Email, SMS, and Slack without modifying the core logic.

## Design Objective

The main goal is to allow dynamic and flexible addition of new behaviors (notification channels) to existing objects at runtime. This avoids the complexity and rigidity of subclassing for every possible combination of notification types.

## Implementation Overview

### Component Interface

A common interface `Notifier` defines the `send()` method, which all types of notifiers (core or decorated) must implement.

### Concrete Component

The `EmailNotifier` is the base implementation of the `Notifier` interface. It provides the default behavior for sending notifications via email.

### Decorator Structure

- An abstract class `NotifierDecorator` implements `Notifier` and maintains a reference to another `Notifier` object.
- Concrete decorators like `SMSNotifierDecorator` and `SlackNotifierDecorator` extend the base decorator and override the `send()` method to add extra functionality before or after calling the wrapped notifier.

### Runtime Behavior

Decorators are applied in layers. Each decorator adds its specific functionality while passing the original call down the chain. This enables dynamic composition of behaviors without modifying existing classes.

## Project Structure
DecoratorPatternExample/
└── src/
├── Notifier.java
├── EmailNotifier.java
├── NotifierDecorator.java
├── SMSNotifierDecorator.java
├── SlackNotifierDecorator.java
└── DecoratorTest.java


## Key Concepts Demonstrated

- Decorator Design Pattern
- Open/Closed Principle (OCP)
- Runtime behavior composition
- Reusability and flexibility

## Use Cases

This pattern is suitable for:
- Notification systems needing extensibility (Email, SMS, Slack, WhatsApp, etc.)
- GUI tools with runtime styling (borders, scrollbars)
- Input/output stream management in Java

Text-Based Flowchart: Working of the Decorator Pattern

[Client: DecoratorTest]
        |
        v
Creates base Notifier object:
[EmailNotifier implements Notifier]
        |
        v
Wraps with:
[SMSNotifierDecorator extends NotifierDecorator]
        |
        v
Wraps with:
[SlackNotifierDecorator extends NotifierDecorator]
        |
        v
Calls send("System update at 9 PM.")
        |
        v
SlackNotifierDecorator.send()
        |
        v
→ Calls super.send() (SMSNotifierDecorator.send())
        |
        v
→ Calls super.send() (EmailNotifier.send())
        |
        v
EmailNotifier outputs: "Sending Email: System update at 9 PM."
        |
        v
SMSNotifierDecorator outputs: "Sending SMS: System update at 9 PM."
        |
        v
SlackNotifierDecorator outputs: "Sending Slack message: System update at 9 PM."

