import java.time.*;

public class Homework extends Assignment {
    public Homework(String id, String title, String description, LocalDate dueDate, GradingStrategy strategy) {
        super(id, title, description, dueDate, strategy);
    }

    @Override
    public void acceptSubmission(Submission s) {
        System.out.println("Homework [" + getId() + "] accepted submission by " + s.getStudentId());
    }
}
