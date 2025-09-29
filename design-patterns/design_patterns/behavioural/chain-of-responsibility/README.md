# Chain of Responsibility



Pass requests along a chain of handlers until one of them handles the request, avoiding coupling between sender and receiver.


Code Flow Explanation:

This example demonstrates how to use the Chain of Responsibility pattern for a technical support system. Support requests are passed through different levels of support staff (Level 1, Level 2, Level 3) based on their priority, with each level deciding whether it can handle the request or pass it along.

Step-by-Step Code Flow:

1. SupportRequest Class (SupportRequest.java)
   - Purpose: Represents the request object that travels through the chain
   - Contains: Description, issue details, and priority level
   - Represents: The data that needs to be processed by handlers

2. SupportHandler Abstract Class (SupportHandler.java)
   - Purpose: Abstract base class for all handlers in the chain
   - Contains: Reference to next handler and abstract canHandle method
   - Behavior: handle() method processes request or passes to next handler
   - Represents: The contract that all handlers must follow

3. Concrete Handler Classes (Level1Support.java, Level2Support.java, Level3Support.java)
   - Purpose: Specific implementations of handlers with different capabilities
   - Each Handler: Implements canHandle() based on priority ranges
   - Level 1: Handles basic issues (priority 1-3)
   - Level 2: Handles intermediate issues (priority 4-6)
   - Level 3: Handles advanced issues (priority 7-9)

4. Main Program (Main.java)
   - Demonstrates: Building and using the chain of handlers
   - Shows: How requests flow through different support levels
   - Creates: Various support requests with different priorities
   - Result: Requests are handled by appropriate support levels




How to Execute the Code:
1. Navigate to the chain-of-responsibility folder in terminal:
   cd behavioural/chain-of-responsibility

2. Compile all Java files:
   javac *.java

3. Run the main program:
   java Main

Expected Output:
=== Chain of Responsibility Pattern Demo ===

Processing request: Password Reset
Level 1 Support is handling: Password Reset
Priority: 1, Issue: User forgot password
Request resolved by Level 1 Support

Processing request: Software Installation
Level 1 Support cannot handle this request. Passing to next handler...
Level 2 Support is handling: Software Installation
Priority: 5, Issue: Office software not installing
Request resolved by Level 2 Support

Processing request: Server Down
Level 1 Support cannot handle this request. Passing to next handler...
Level 2 Support cannot handle this request. Passing to next handler...
Level 3 Support is handling: Server Down
Priority: 9, Issue: Production server crashed
Request resolved by Level 3 Support

Processing request: Email Setup
Level 1 Support is handling: Email Setup
Priority: 2, Issue: Outlook configuration
Request resolved by Level 1 Support

Processing request: Database Error
Level 1 Support cannot handle this request. Passing to next handler...
Level 2 Support cannot handle this request. Passing to next handler...
Level 3 Support cannot handle this request. Passing to next handler...
No handler can process this request: Database Error
Request will be escalated to management.

Key Takeaways:
1. Chain Setup: Create handlers and link them in sequence
2. Request Flow: Requests travel through chain until handled
3. Handler Decision: Each handler decides if it can process the request
4. Loose Coupling: Sender doesn't know which handler will process
5. Dynamic Chain: Chain can be modified at runtime



