# Structural Design Patterns

    - "Organize code into larger structures while keeping it flexible and efficient through object composition."


Step-by-Step Pattern Guide:

1. Adapter Pattern (adapter/)
   - Purpose: Makes incompatible interfaces work together
   - Key Idea: Acts as a bridge between two incompatible interfaces
   - Use Case: When you need existing classes to work with others without modification
   - Files: MediaPlayer, AdvancedMediaPlayer, MediaAdapter, AudioPlayer, Main


2. Decorator Pattern (decorator/)
   - Purpose: Adds behavior to objects dynamically
   - Key Idea: Wraps objects with additional functionality
   - Use Case: When you need to add or remove responsibilities at runtime
   - Files: Coffee, SimpleCoffee, CoffeeDecorator, MilkDecorator, SugarDecorator, WhipDecorator, Main


Structural Pattern Relationships:

- Adapter vs Bridge: Both deal with interfaces, but Adapter makes incompatible interfaces work together, while Bridge separates abstraction from implementation
- Decorator vs Proxy: Both wrap objects, but Decorator adds behavior, while Proxy controls access
- Composite vs Decorator: Both use composition, but Composite builds tree structures, while Decorator adds functionality

