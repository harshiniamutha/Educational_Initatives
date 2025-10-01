import java.time.*;
import java.util.UUID;

// Factory Method: simple static factory; can be converted to more OO factory if required.
public class AssignmentFactory {
    public enum Type {
        QUIZ, HOMEWORK, PROJECT
    }

    public static Assignment createAssignment(Type type, String title, String description, LocalDate dueDate,
            GradingStrategy strategy) {
        String id = UUID.randomUUID().toString();
        switch (type) {
            case QUIZ:
                return new Quiz(id, title, description, dueDate, strategy);
            case HOMEWORK:
                return new Homework(id, title, description, dueDate, strategy);
            case PROJECT:
                return new Project(id, title, description, dueDate, strategy);
            default:
                throw new IllegalArgumentException("Unknown assignment type");
        }
    }
}
