import java.util.logging.*;

public class TeacherReview implements GradingStrategy {
    private static final Logger LOGGER = Logger.getLogger(TeacherReview.class.getName());

    @Override
    public void grade(Assignment assignment, Submission submission) {
        // Placeholder: teacher will review later. Mark as pending (use -1)
        submission.setGrade(-1);
        LOGGER.info("Submission " + submission.getAssignmentId() + " marked for teacher review.");
        System.out.println("Submission marked for teacher review.");
    }
}
