# Creational Design Patterns 


Encapsulate the creation logic to make systems more flexible and decoupled from specific implementations.

Step-by-Step Pattern Guide:

1. Builder Pattern (builder/)

     Purpose: Separates object construction from its representation.

     Key Idea: Allows step-by-step construction of complex objects using a builder class.

     Use Case: When you need to create objects with many optional or configurable parameters.

     Files: Computer, ComputerBuilder, Main

2. Singleton Pattern (singleton/)

     Purpose: Ensures a class has only one instance and provides a global access point.

     Key Idea: Controls instance creation and guarantees a single object throughout the application.

     Use Case: When exactly one object is needed (e.g., configuration manager, logging, cache, database connection).

     Files: LazySingleton, Main

Creational Pattern Relationships

     -Builder vs Factory: Both create objects, but Builder constructs step-by-step with flexibility, while Factory just returns a new instance.

     -Singleton vs Prototype: Singleton restricts to one instance, Prototype creates new objects by cloning an existing one.


     -Builder vs Singleton: Builder focuses on flexible object construction, while Singleton ensures only one instance exists.
