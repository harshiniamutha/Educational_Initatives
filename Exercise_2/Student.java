import java.time.*;
import java.util.*;
import java.util.logging.*;

public class Student implements Observer {
    private static final Logger LOGGER = Logger.getLogger(Student.class.getName());
    private final String id;
    private final String name;
    private final Set<String> enrolledClassrooms;
    private final Map<String, Submission> submissions; // assignmentId -> submission

    public Student(String id, String name) {
        if (id == null || id.trim().isEmpty())
            throw new IllegalArgumentException("Invalid student ID");
        this.id = id;
        this.name = name == null ? "" : name;
        this.enrolledClassrooms = new HashSet<>();
        this.submissions = new HashMap<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // called by classroom
    @Override
    public void update(Classroom classroom, String message) {
        // simple console notification + log
        String notify = "Notification to Student [" + id + "]: " + message;
        System.out.println(notify);
        LOGGER.info(notify);
    }

    public void enroll(Classroom c) {
        enrolledClassrooms.add(c.getName());
    }

    public void leave(Classroom c) {
        enrolledClassrooms.remove(c.getName());
    }

    public void submitAssignment(Classroom c, String assignmentId, String content) throws Exception {
        Assignment a = c.findAssignmentById(assignmentId);
        if (a == null)
            throw new AssignmentNotFoundException("Assignment not found: " + assignmentId);
        if (!enrolledClassrooms.contains(c.getName()))
            throw new InvalidOperationException("Student not enrolled in classroom");
        Submission sub = new Submission(assignmentId, id, content, LocalDateTime.now());
        submissions.put(assignmentId, sub);
        System.out.println("Assignment submitted by Student [" + id + "] in [" + c.getName() + "].");
        LOGGER.info(
                "Assignment submitted by Student [" + id + "] in [" + c.getName() + "], assignment: " + assignmentId);
        // optionally grade immediately via assignment's grading strategy
        a.grade(sub);
    }

    public Submission getSubmission(String assignmentId) {
        return submissions.get(assignmentId);
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}
