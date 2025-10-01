import java.time.*;
import java.util.logging.*;

public abstract class Assignment {
    private static final Logger LOGGER = Logger.getLogger(Assignment.class.getName());
    private final String id;
    private final String title;
    private final String description;
    private final LocalDate dueDate;
    protected GradingStrategy gradingStrategy;

    public Assignment(String id, String title, String description, LocalDate dueDate, GradingStrategy strategy) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.gradingStrategy = strategy;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setGradingStrategy(GradingStrategy strategy) {
        this.gradingStrategy = strategy;
    }

    // Each concrete assignment may have extra behavior
    public abstract void acceptSubmission(Submission s);

    // delegate grading to strategy
    public void grade(Submission s) {
        if (gradingStrategy == null) {
            LOGGER.warning("No grading strategy set; cannot grade.");
            return;
        }
        gradingStrategy.grade(this, s);
    }
}
