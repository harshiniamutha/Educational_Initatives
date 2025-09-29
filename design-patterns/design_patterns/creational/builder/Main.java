public class Main {
    public static void main(String[] args) {
        System.out.println("=== Builder Pattern Demo ===\n");
        
        // Example 1: Building a basic computer with minimal configuration
        System.out.println("1. Building a Basic Computer:");
        Computer basicComputer = new ComputerBuilder()
                .setCpu("Intel i3")
                .setRam("8GB")
                .build();
        System.out.println(basicComputer);
        System.out.println();
        
        // Example 2: Building a gaming computer with full configuration
        System.out.println("2. Building a Gaming Computer:");
        Computer gamingComputer = new ComputerBuilder()
                .setCpu("Intel i7")
                .setRam("16GB")
                .setStorage("1TB NVMe SSD")
                .setGraphicsCard("RTX 3080")
                .setMotherboard("ASUS ROG Z690")
                .build();
        System.out.println(gamingComputer);
        System.out.println();
        
        // Example 3: Building a computer with only some specifications
        System.out.println("3. Building a Computer with Partial Configuration:");
        Computer partialComputer = new ComputerBuilder()
                .setCpu("AMD Ryzen 5")
                .setStorage("512GB SSD")
                .build();
        System.out.println(partialComputer);
        System.out.println();
        
        // Example 4: Building a computer with no configuration (uses defaults)
        System.out.println("4. Building a Computer with Default Configuration:");
        Computer defaultComputer = new ComputerBuilder().build();
        System.out.println(defaultComputer);
    }
}
