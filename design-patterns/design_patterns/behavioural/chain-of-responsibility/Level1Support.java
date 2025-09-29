public class Level1Support extends SupportHandler {
    public Level1Support() {
        super("Level 1 Support");
    }
    
    @Override
    public boolean canHandle(SupportRequest request) {
        // Level 1 can handle basic issues (priority 1-3)
        return request.getPriority() >= 1 && request.getPriority() <= 3;
    }
}
