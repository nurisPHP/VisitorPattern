# Assignment #6 — Visitor Design Pattern

## Project Overview

This project demonstrates the Visitor Design Pattern in Java using a shape hierarchy.

The application contains three shapes: Circle, Square, and Triangle. It uses two visitors to perform different operations without modifying the shape classes.

## Technologies

- Java 17
- IntelliJ IDEA
- Gradle
- Visitor Design Pattern

## Project Structure

```text
src/main/java/
├── element/
│   ├── Shape.java
│   ├── Circle.java
│   ├── Square.java
│   └── Triangle.java
├── visitor/
│   ├── ShapeVisitor.java
│   ├── AreaCalculatorVisitor.java
│   └── ExportVisitor.java
└── app/
    └── Main.java
```

## Visitor Pattern Components

**Element Interface:** `Shape` declares the `accept()` method.

**Concrete Elements:** `Circle`, `Square`, and `Triangle` implement the Shape interface.

**Visitor Interface:** `ShapeVisitor` declares visit methods for each shape.

**Concrete Visitors:**
- `AreaCalculatorVisitor` calculates the area of each shape.
- `ExportVisitor` displays information about each shape.

## How It Works

The Visitor Pattern uses double dispatch.

First, a shape accepts a visitor using `accept()`. Then, the shape calls the appropriate `visit()` method using `visitor.visit(this)`.

This allows new operations to be added without changing existing shape classes.

## Sample Output

```text
=== AREA CALCULATION ===
Circle area: 78.54
Square area: 16.00
Triangle area: 9.00
Total area: 103.54

=== SHAPE EXPORT ===
Circle [radius=5.0]
Square [side=4.0]
Triangle [base=6.0, height=3.0]
```

## How to Run

1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3. Make sure Java 17 is configured.
4. Run `app.Main`.

## Clean Code

The project demonstrates five Clean Code principles:

1. Meaningful Names
2. No Duplication
3. Single Responsibility
4. Expressive Code and Double Dispatch
5. Extensibility

## Conclusion

The Visitor Pattern separates operations from object structures. This makes the application easier to extend, understand, and maintain.
