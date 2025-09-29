public class Level2Support extends SupportHandler {
    public Level2Support() {
        super("Level 2 Support");
    }
    
    @Override
    public boolean canHandle(SupportRequest request) {
        // Level 2 can handle intermediate issues (priority 4-6)
        return request.getPriority() >= 4 && request.getPriority() <= 6;
    }
}
