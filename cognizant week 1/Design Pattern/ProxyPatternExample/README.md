# ProxyPatternExample

## Project Overview

This project demonstrates the **Proxy Design Pattern** using an image viewer application that loads images from a remote server. The proxy acts as a substitute for the real image loading class, enabling **lazy initialization** and **caching** to improve performance and resource management.

## Design Objective

The objective is to minimize the cost of loading images by delaying their initialization until they are actually needed. The proxy ensures that each image is loaded only once, even if it is requested multiple times, reducing server overhead.

## Implementation Overview

### Subject Interface

An interface `Image` defines the method `display()`, which is common to both the real image and the proxy class.

### Real Subject

The `RealImage` class simulates the loading of an image from a remote server. It implements the `Image` interface and performs actual image loading and display.

### Proxy Class

The `ProxyImage` class also implements `Image`. It holds a reference to a `RealImage` instance and performs lazy initialization. When `display()` is called, it checks if the `RealImage` has been instantiated; if not, it creates and caches it.

### Testing and Demonstration

The test class `ProxyTest` creates multiple proxy objects and demonstrates the behavior of loading and displaying images. It shows how repeated accesses use the cached object instead of reloading the image.

## Project Structure

ProxyPatternExample/
└── src/
├── Image.java
├── RealImage.java
├── ProxyImage.java
└── ProxyTest.java


## Key Concepts Demonstrated

- Proxy Design Pattern
- Lazy Initialization
- Caching and resource management
- Separation of interface and implementation

## Use Cases

The Proxy Pattern is useful in:
- Virtual proxies (on-demand resource loading)
- Protection proxies (access control)
- Remote proxies (representing an object in a different address space)


Working of the Proxy Pattern


[Client: ProxyTest]
        |
        v
Creates new ProxyImage("cat.png")
        |
        v
Calls display() on ProxyImage
        |
        v
[ProxyImage checks if RealImage is null]
        |
        ├── If null:
        │     └── Instantiate RealImage("cat.png")
        │           └── Load image from remote server
        └── Else:
              └── Use cached RealImage
        |
        v
Call display() on RealImage
        |
        v
Output: "Displaying image: cat.png"

----- Second display call -----

Client calls display() again on ProxyImage
        |
        v
[RealImage is already cached]
        |
        v
Call display() on cached RealImage
        |
        v
Output: "Displaying image: cat.png"

----- New image proxy -----

Client creates ProxyImage("dog.png")
        |
        v
Call display() on ProxyImage
        |
        └── Load RealImage("dog.png") and display
