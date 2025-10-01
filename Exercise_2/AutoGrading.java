import java.util.logging.*;

public class AutoGrading implements GradingStrategy {
    private static final Logger LOGGER = Logger.getLogger(AutoGrading.class.getName());

    @Override
    public void grade(Assignment assignment, Submission submission) {
        // Very simple auto grade logic for demo
        int grade = Math.min(100, Math.max(0, submission.getContent().length() % 100));
        submission.setGrade(grade);
        LOGGER.info("Auto-graded submission " + submission.getAssignmentId() + " for student "
                + submission.getStudentId() + ": " + grade);
        System.out.println("Submission auto-graded. Score: " + grade);
    }
}
