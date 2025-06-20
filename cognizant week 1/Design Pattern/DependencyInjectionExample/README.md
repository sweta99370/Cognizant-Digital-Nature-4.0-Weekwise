# DependencyInjectionExample

## Overview

This project demonstrates the **Dependency Injection (DI)** design pattern using a simple Customer Management System in Java. The goal is to decouple the service logic from the data access logic by injecting dependencies instead of hardcoding them.

## Design Objective

To build a loosely coupled architecture where the `CustomerService` class depends on the `CustomerRepository` interface and receives its implementation (`CustomerRepositoryImpl`) through constructor injection.

## Benefits of Dependency Injection

- Promotes loose coupling between classes.
- Makes the system more modular and testable.
- Supports inversion of control (IoC), reducing direct object construction.

## Components

### 1. Repository Interface

- `CustomerRepository` defines the contract for data access operations.
- Method: `findCustomerById(int id)`

### 2. Concrete Repository

- `CustomerRepositoryImpl` provides a mock implementation of data retrieval.
- Simulates a database call returning customer details.

### 3. Service Class

- `CustomerService` depends on `CustomerRepository` for fetching customer data.
- Uses **constructor injection** to receive the repository instance.

### 4. Main Class

- Demonstrates the DI principle by:
  - Creating a repository object
  - Injecting it into the service class
  - Using the service to retrieve and display customer information

## Project Structure

DependencyInjectionExample/
└── src/
├── CustomerRepository.java
├── CustomerRepositoryImpl.java
├── CustomerService.java
└── DependencyInjectionTest.java


## How It Works

- `CustomerRepositoryImpl` is created in the main class.
- The instance is injected into `CustomerService` using constructor injection.
- `CustomerService` uses the repository instance to fetch and display customer data.

## Example Output

Retrieved: Customer{id=101, name='Alice'}

Working of Constructor-Based Dependency Injection

[Main Class: DependencyInjectionTest]
        |
        v
Creates CustomerRepositoryImpl instance
        |
        v
Injects it into CustomerService via constructor
        |
        v
CustomerService.displayCustomer(101)
        |
        v
Delegates call to CustomerRepositoryImpl.findCustomerById(101)
        |
        v
Returns mock data: "Customer{id=101, name='Alice'}"
        |
        v
Service displays: Retrieved: Customer{id=101, name='Alice'}
