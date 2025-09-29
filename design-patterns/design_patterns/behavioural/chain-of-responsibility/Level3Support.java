public class Level3Support extends SupportHandler {
    public Level3Support() {
        super("Level 3 Support");
    }
    
    @Override
    public boolean canHandle(SupportRequest request) {
        // Level 3 can handle advanced issues (priority 7-9)
        return request.getPriority() >= 7 && request.getPriority() <= 9;
    }
}
