import java.time.*;

public class Project extends Assignment {
    public Project(String id, String title, String description, LocalDate dueDate, GradingStrategy strategy) {
        super(id, title, description, dueDate, strategy);
    }

    @Override
    public void acceptSubmission(Submission s) {
        System.out.println("Project [" + getId() + "] accepted submission by " + s.getStudentId());
    }
}
