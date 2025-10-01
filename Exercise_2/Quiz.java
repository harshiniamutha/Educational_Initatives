import java.time.*;

public class Quiz extends Assignment {
    public Quiz(String id, String title, String description, LocalDate dueDate, GradingStrategy strategy) {
        super(id, title, description, dueDate, strategy);
    }

    @Override
    public void acceptSubmission(Submission s) {
        // minimal: log or store elsewhere
        System.out.println("Quiz [" + getId() + "] accepted submission by " + s.getStudentId());
    }
}
