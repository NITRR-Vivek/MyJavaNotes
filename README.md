# **Java Notes and Code Repository**

Welcome to the **Java Notes and Code Repository**! 🚀  
This repository is a complete guide to mastering Java, covering everything from the basics to advanced topics, including the latest features up to **Java 21**.

---

## **📜 Table of Contents**

1. [Introduction to Java](#introduction-to-java)
2. [Getting Started](#getting-started)
3. [Core Java Concepts](#core-java-concepts)
   - [Data Types and Variables](#data-types-and-variables)
   - [Control Flow Statements](#control-flow-statements)
   - [Arrays](#arrays)
   - [Object-Oriented Programming (OOP)](#object-oriented-programming-oop)
4. [Collections Framework](#collections-framework)
5. [Exception Handling](#exception-handling)
6. [File Handling](#file-handling)
7. [Multithreading and Concurrency](#multithreading-and-concurrency)
8. [Java 8+ Features](#java-8-features)
   - [Lambda Expressions](#lambda-expressions)
   - [Stream API](#stream-api)
   - [Optional Class](#optional-class)
9. [Java 9 to Java 20 Features](#java-9-to-java-20-features)
   - [Modules (Project Jigsaw)](#modules-project-jigsaw)
   - [Enhanced Stream API](#enhanced-stream-api)
   - [Pattern Matching for `switch`](#pattern-matching-for-switch)
   - [Records](#records)
   - [Sealed Classes](#sealed-classes)
10. [Java 21 Features](#java-21-features)
    - [Virtual Threads](#virtual-threads)
    - [Scoped Values](#scoped-values)
    - [Sequenced Collections](#sequenced-collections)
    - [String Templates](#string-templates)
11. [Java Networking](#java-networking)
12. [Advanced Topics](#advanced-topics)
13. [Design Patterns](#design-patterns)
14. [Unit Testing with JUnit](#unit-testing-with-junit)
15. [Building Applications](#building-applications)
    - [Maven](#maven)
    - [Gradle](#gradle)
16. [Resources](#resources)

---

## **Introduction to Java**
Java is a versatile, platform-independent, object-oriented programming language widely used for building robust, high-performance applications.

---

## **Getting Started**
- **Installation**: [Install Java](https://www.oracle.com/java/technologies/javase-downloads.html) and set up the environment.
- **First Program**: Write and run your first "Hello, World!" program.

---

## **Core Java Concepts**
Learn the foundational concepts, including:
- Data Types
- Control Flow
- Arrays
- OOP (Classes, Objects, Inheritance, Polymorphism, etc.)

---

## **Collections Framework**
Dive into Java's powerful data structures like `List`, `Set`, `Map`, and `Queue`. Learn about immutability, iterators, and thread-safe collections.

---

## **Exception Handling**
Master techniques to handle runtime errors effectively using `try-catch`, `finally`, and custom exceptions.

---

## **File Handling**
Work with files using the `File` class, `BufferedReader`, `NIO` (Java 7+), and the latest `Path` API.

---

## **Multithreading and Concurrency**
Topics include:
- Thread Lifecycle
- Synchronization
- Executors
- Fork/Join Framework
- Virtual Threads (Java 21)

---

## **Java 8+ Features**

### **Lambda Expressions**
Simplify functional programming using lambdas.

### **Stream API**
Perform powerful and concise data processing.

### **Optional Class**
Handle nullable values safely.

---

## **Java 9 to Java 20 Features**

### **Modules (Project Jigsaw)**
Modularize large-scale applications.

### **Enhanced Stream API**
Methods like `takeWhile`, `dropWhile`, and `iterate`.

### **Pattern Matching for `switch`**
Make `switch` statements more expressive and powerful.

### **Records**
Simplify immutable data classes.

### **Sealed Classes**
Restrict inheritance hierarchies for better control.

---

## **Java 21 Features**

### **Virtual Threads**
Virtual Threads, introduced in Project Loom, make it easier to write high-throughput, lightweight concurrent applications.
```java
try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
    executor.submit(() -> System.out.println("Hello from Virtual Thread!"));
}
```

### **Scoped Values**
Scoped Values allow thread-local-like storage for values, improving performance and reducing complexity.
```java
ScopedValue<String> SCOPED = ScopedValue.newInstance();
ScopedValue.where(SCOPED, "Hello").run(() -> System.out.println(SCOPED.get()));
```

### **Sequenced Collections**
`SequencedCollection`, `SequencedSet`, and `SequencedMap` provide a consistent way to handle ordered collections.
```java
SequencedSet<String> set = SequencedSet.of("a", "b", "c");
System.out.println(set.reversed()); // Access in reverse order
```

### **String Templates**
String Templates simplify complex string formatting and interpolation.
```java
String name = "Alice";
int age = 25;
String result = STR."Name: \{name}, Age: \{age}";
System.out.println(result); // Output: Name: Alice, Age: 25
```

---

## **Java Networking**
Explore `Socket`, `ServerSocket`, and the modern `HttpClient` API.

---

## **Advanced Topics**
- **Generics**
- **Annotations**
- **Reflection API**
- **JVM Internals**

---

## **Design Patterns**
Implement common design patterns like Singleton, Factory, Builder, Observer, and more.

---

## **Unit Testing with JUnit**
Write effective test cases using JUnit 5, including assertions and parameterized tests.

---

## **Building Applications**

### **Maven**
Dependency management and build automation.

### **Gradle**
Efficient and modern build tool.

---

## **Resources**
- [Official Java Documentation](https://docs.oracle.com/en/java/)
- [Java Tutorials by Oracle](https://docs.oracle.com/javase/tutorial/)
- [GeeksforGeeks Java Guide](https://www.geeksforgeeks.org/java/)
- [Java 21 Release Notes](https://openjdk.org/projects/jdk/21/)

---

### **Contributions**
Feel free to fork this repository, add your notes or code snippets, and make a pull request! 😊

---

Happy Coding! 🎉

---