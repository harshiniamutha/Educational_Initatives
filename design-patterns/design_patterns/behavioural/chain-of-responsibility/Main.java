public class Main {
    public static void main(String[] args) {
        System.out.println("=== Chain of Responsibility Pattern Demo ===\n");
        
        // Create the chain of handlers
        SupportHandler level1 = new Level1Support();
        SupportHandler level2 = new Level2Support();
        SupportHandler level3 = new Level3Support();
        
        // Set up the chain
        level1.setNextHandler(level2);
        level2.setNextHandler(level3);
        
        // Create different support requests
        SupportRequest[] requests = {
            new SupportRequest("Password Reset", "User forgot password", 1),
            new SupportRequest("Software Installation", "Office software not installing", 5),
            new SupportRequest("Server Down", "Production server crashed", 9),
            new SupportRequest("Email Setup", "Outlook configuration", 2),
            new SupportRequest("Database Error", "Critical database corruption", 10)
        };
        
        // Process each request through the chain
        for (SupportRequest request : requests) {
            System.out.println("Processing request: " + request.getDescription());
            level1.handle(request);
        }
    }
}
