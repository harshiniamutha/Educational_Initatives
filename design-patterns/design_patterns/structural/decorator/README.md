# Decorator

    - "Add new behavior to objects dynamically by wrapping them with decorator objects."

Code Flow Explanation:

What This Example Does:
This example demonstrates how to use the Decorator pattern to build custom coffee orders. Starting with a simple coffee, you can add milk, sugar, and whipped cream dynamically, with each addition increasing the cost and updating the description.

Step-by-Step Code Flow:

1. Coffee Interface (Coffee.java)
   - Purpose: The component interface that defines the contract
   - Contains: getCost() and getDescription() methods
   - Represents: The base functionality that all coffees must have

2. SimpleCoffee Class (SimpleCoffee.java)
   - Purpose: The concrete component that implements the base functionality
   - Contains: Basic coffee cost ($2.0) and description
   - Represents: The simplest form of coffee without any additions

3. CoffeeDecorator Abstract Class (CoffeeDecorator.java)
   - Purpose: The abstract decorator that implements the Coffee interface
   - Contains: Protected reference to a Coffee object
   - Delegates: Calls to the wrapped Coffee object by default

4. Concrete Decorator Classes (MilkDecorator.java, SugarDecorator.java, WhipDecorator.java)
   - Purpose: Add specific behaviors to the wrapped Coffee object
   - Each Decorator: Adds its own cost and description
   - Chain Together: Multiple decorators can be applied to one coffee

5. Main Program (Main.java)
   - Demonstrates: Various coffee combinations using decorators
   - Shows: How decorators can be chained and ordered
   - Creates: Different coffee orders with different costs and descriptions


How to Execute the Code:
1. Navigate to the decorator folder in terminal:
   cd structural/decorator

2. Compile all Java files:
   javac *.java

3. Run the main program:
   java Main

Expected Output:
=== Decorator Pattern Demo ===

1. Simple Coffee:
Cost: $2.0
Description: Simple Coffee

2. Coffee with Milk:
Cost: $2.5
Description: Simple Coffee, Milk

3. Coffee with Milk and Sugar:
Cost: $2.7
Description: Simple Coffee, Milk, Sugar

4. Coffee with All Toppings:
Cost: $3.4
Description: Simple Coffee, Milk, Sugar, Whip

5. Different Decorator Order:
Order 1 (Sugar + Whip):
Cost: $2.9
Description: Simple Coffee, Sugar, Whip

Order 2 (Whip + Sugar):
Cost: $2.9
Description: Simple Coffee, Whip, Sugar

6. Building Coffee Step by Step:
Base: Simple Coffee - $2.0
Add Milk: Simple Coffee, Milk - $2.5
Add Sugar: Simple Coffee, Milk, Sugar - $2.7
Add Whip: Simple Coffee, Milk, Sugar, Whip - $3.4

Key Takeaways:
1. Dynamic Behavior: Add behaviors at runtime without changing existing code
2. Composition Over Inheritance: Use composition to add functionality
3. Chainable Decorators: Multiple decorators can be applied in sequence
4. Open/Closed Principle: Open for extension, closed for modification
5. Single Responsibility: Each decorator adds one specific behavior


