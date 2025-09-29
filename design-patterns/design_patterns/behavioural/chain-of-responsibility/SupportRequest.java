public class SupportRequest {
    private String description;
    private String issue;
    private int priority;
    
    public SupportRequest(String description, String issue, int priority) {
        this.description = description;
        this.issue = issue;
        this.priority = priority;
    }
    
    public String getDescription() {
        return description;
    }
    
    public String getIssue() {
        return issue;
    }
    
    public int getPriority() {
        return priority;
    }
}
