# Virtual Classroom Manager


A console-based Java application that helps manage classrooms, students, and assignments.
this coding exercise and demonstrates Object-Oriented Programming (OOP), SOLID principles, Data Structures and common Design Patterns.

Class Diagram:
 class diagram illustrates the overall architecture of the Virtual Classroom Manager and highlights the relationships and responsibilities of each class.

 
<p align="center">
  <img src="docs/1_Class_Diagram.png" alt="UML Class Diagram of Virtual Classroom Manager" width="700"/>
</p>



Features:

- Classroom Management – Create, list, and remove classrooms.

- Student Management – Enroll students into classrooms and view enrolled students.

- Assignment Management – Schedule assignments for classrooms and allow students to submit.

- Notifications – Students are notified when a new assignment is added (Observer Pattern).


Design Patterns Implemented:

- Singleton → Ensures only one VirtualClassroomManager instance exists.

- Factory Method → Creates different types of assignments (Quiz, Homework, Project).

- Observer → Classroom notifies enrolled Students when a new assignment is added.

- Strategy (optional/bonus) → Supports different grading strategies (AutoGrading, TeacherReview).

Libraries Used:

- java.util → Collections (Map, List, Set), UUID, Scanner

- java.time → Date and time handling

- java.util.logging → Logging events and errors

Data Structures Used:

- Map<String, Classroom> → To store and manage classrooms efficiently.

- Map<String, Student> → For quick lookup of students in a classroom.

- Map<UUID, Submission> → To manage submissions by assignment ID.

- List<Assignment> → To maintain ordered assignments in each classroom.

- Set<String> → To track classrooms a student is enrolled in (prevents duplicates).


OOP Used:

- Encapsulation – Private fields, accessed via getters/setters.

- Abstraction – Assignment is abstract; specific types extend it.

- Inheritance – Quiz, Homework, and Project extend Assignment.

- Polymorphism – Different grading strategies can be applied dynamically.

SOLID Principles Applied:

- Single Responsibility – Each class handles one responsibility.

- Open/Closed – New assignment types can be added without modifying existing code.

- Liskov Substitution – Subclasses (Quiz, Homework) can replace Assignment.

- Interface Segregation – Students only implement what they need (Observer methods).

- Dependency Inversion – High-level modules depend on abstractions (GradingStrategy).





