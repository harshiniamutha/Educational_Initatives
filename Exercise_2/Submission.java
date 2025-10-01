import java.time.*;

public class Submission {
    private final String assignmentId;
    private final String studentId;
    private final String content;
    private final LocalDateTime timestamp;
    private Integer grade; // nullable, -1 for pending

    public Submission(String assignmentId, String studentId, String content, LocalDateTime timestamp) {
        this.assignmentId = assignmentId;
        this.studentId = studentId;
        this.content = content;
        this.timestamp = timestamp;
        this.grade = null;
    }

    public String getAssignmentId() {
        return assignmentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer g) {
        this.grade = g;
    }
}
