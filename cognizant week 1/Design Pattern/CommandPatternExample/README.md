# CommandPatternExample

## Project Overview

This project demonstrates the **Command Design Pattern** through a simple home automation system. The Command Pattern encapsulates a request as an object, thereby allowing for parameterization of clients with different requests, queuing of requests, and logging of operations.

## Design Objective

The goal is to allow actions such as turning devices on or off to be executed in a decoupled way. By separating the sender (invoker) from the receiver (device), the system becomes extensible and flexible for adding more commands and devices in the future.

## Implementation Overview

### Command Interface

The `Command` interface defines a single method `execute()` which encapsulates a command to be performed.

### Receiver Class

The `Light` class contains actual business logic:
- `turnOn()`
- `turnOff()`

These methods represent actions that can be triggered through command objects.

### Concrete Command Classes

Two concrete implementations of `Command` are defined:
- `LightOnCommand`: Invokes `Light.turnOn()`
- `LightOffCommand`: Invokes `Light.turnOff()`

Each command holds a reference to a `Light` object and delegates execution to it.

### Invoker Class

The `RemoteControl` class acts as the invoker. It holds a reference to a command and has a method `pressButton()` which calls `execute()` on the command.

### Test and Demonstration

The test class (`CommandPatternTest`) creates light devices and associates them with command objects. These command objects are then triggered through a remote control interface.

## Project Structure

CommandPatternExample/
└── src/
├── Command.java
├── Light.java
├── LightOnCommand.java
├── LightOffCommand.java
├── RemoteControl.java
└── CommandPatternTest.java


## Key Concepts Demonstrated

- Command Design Pattern
- Decoupling of invoker and receiver
- Flexible command assignment
- Encapsulation of requests

## Use Cases

The Command Pattern is widely used in:
- Remote controls
- Transaction or undo systems
- Macro recording
- Task scheduling


Working of the Command Pattern


[Client: CommandPatternTest]
        |
        v
Creates Light object (Receiver)
        |
        v
Creates Command objects:
    ├── LightOnCommand(light)
    └── LightOffCommand(light)
        |
        v
Creates RemoteControl (Invoker)
        |
        v
--- Executing Turn ON ---
        |
        v
remote.setCommand(LightOnCommand)
        |
        v
remote.pressButton()
        |
        v
[RemoteControl calls execute()]
        |
        v
[LightOnCommand calls light.turnOn()]
        |
        v
Output: "The light is ON"

--- Executing Turn OFF ---
        |
        v
remote.setCommand(LightOffCommand)
        |
        v
remote.pressButton()
        |
        v
[RemoteControl calls execute()]
        |
        v
[LightOffCommand calls light.turnOff()]
        |
        v
Output: "The light is OFF"
