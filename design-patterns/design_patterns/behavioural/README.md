# Behavioral Design Patterns

    - "Manage object interactions and communication while keeping objects loosely coupled and responsibilities well-distributed."

Step-by-Step Pattern Guide:

1. Chain of Responsibility Pattern (chain-of-responsibility/)
   - Purpose: Passes requests along a chain of handlers until one handles it
   - Key Idea: Creates a chain of handler objects for request processing
   - Use Case: When you need to route requests through multiple handlers
   - Files: SupportRequest, SupportHandler, Level1Support, Level2Support, Level3Support, Main

2. Template Method Pattern (template-method/)
    - Purpose: Defines the skeleton of an algorithm in a method
    - Key Idea: Lets subclasses redefine certain steps without changing structure
    - Use Case: When you have algorithms with fixed structure but variable steps
    - Files: Game, Cricket, Football, Main



Behavioral Pattern Relationships:
- Observer vs Mediator: Both handle communication, but Observer is one-to-many notification, while Mediator centralizes communication
- Strategy vs State: Both use delegation, but Strategy changes algorithms, while State changes behavior
- Command vs Chain of Responsibility: Both handle requests, but Command encapsulates requests, while Chain routes them through handlers
