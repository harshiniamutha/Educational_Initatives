# Builder



Build an object step by step, and get the final product at the end.

Code Flow Explanation:

This example demonstrates building different types of computers using the Builder pattern. Instead of having multiple constructors for different computer configurations, we use a single ComputerBuilder that can create computers with any combination of specifications.

Step-by-Step Code Flow:

1. Computer Class (Computer.java)
   - Purpose: The final product that gets built
   - Contains: All computer components (CPU, RAM, Storage, Graphics Card, Motherboard)
   - Constructor: Takes all parameters at once
   - Methods: Getters and toString for displaying the computer

2. ComputerBuilder Class (ComputerBuilder.java)
   - Purpose: The builder that constructs Computer objects step by step
   - Contains: Same fields as Computer, but they can be set individually
   - Key Methods:
     - setCpu(), setRam(), setStorage(), etc. - Each returns this for method chaining
     - build() - Creates and returns the final Computer object with default values for unspecified parts

3. Main Program (Main.java)
   - Demonstrates: Four different ways to build computers
   - Shows: How flexible the Builder pattern is



How to Execute the Code:
1. Navigate to the builder folder in terminal:
   cd creational/builder

2. Compile all Java files:
   javac *.java

3. Run the main program:
   java Main

Expected Output:
=== Builder Pattern Demo ===

1. Building a Basic Computer:
Computer{CPU='Intel i3', RAM='8GB', Storage='256GB SSD', Graphics Card='Integrated Graphics', Motherboard='Standard Motherboard'}

2. Building a Gaming Computer:
Computer{CPU='Intel i7', RAM='16GB', Storage='1TB NVMe SSD', Graphics Card='RTX 3080', Motherboard='ASUS ROG Z690'}

3. Building a Computer with Partial Configuration:
Computer{CPU='AMD Ryzen 5', RAM='8GB', Storage='512GB SSD', Graphics Card='Integrated Graphics', Motherboard='Standard Motherboard'}

4. Building a Computer with Default Configuration:
Computer{CPU='Default CPU', RAM='8GB', Storage='256GB SSD', Graphics Card='Integrated Graphics', Motherboard='Standard Motherboard'}

Key Takeaways:
1. Method Chaining: Each setter returns this, allowing you to chain methods
2. Default Values: Unspecified parameters get sensible defaults
3. Flexibility: Can create objects with any combination of parameters
4. Readability: Code is self-documenting and easy to understand

5. Maintainability: Easy to add new parameters or change defaults
