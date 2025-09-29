public class Main {
    public static void main(String[] args) {
        System.out.println("=== Decorator Pattern Demo ===\n");
        
        // Example 1: Simple Coffee
        System.out.println("1. Simple Coffee:");
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Cost: $" + simpleCoffee.getCost());
        System.out.println("Description: " + simpleCoffee.getDescription());
        System.out.println();
        
        // Example 2: Coffee with Milk
        System.out.println("2. Coffee with Milk:");
        Coffee coffeeWithMilk = new MilkDecorator(new SimpleCoffee());
        System.out.println("Cost: $" + coffeeWithMilk.getCost());
        System.out.println("Description: " + coffeeWithMilk.getDescription());
        System.out.println();
        
        // Example 3: Coffee with Milk and Sugar
        System.out.println("3. Coffee with Milk and Sugar:");
        Coffee coffeeWithMilkAndSugar = new SugarDecorator(new MilkDecorator(new SimpleCoffee()));
        System.out.println("Cost: $" + coffeeWithMilkAndSugar.getCost());
        System.out.println("Description: " + coffeeWithMilkAndSugar.getDescription());
        System.out.println();
        
        // Example 4: Coffee with All Toppings
        System.out.println("4. Coffee with All Toppings:");
        Coffee coffeeWithAll = new WhipDecorator(new SugarDecorator(new MilkDecorator(new SimpleCoffee())));
        System.out.println("Cost: $" + coffeeWithAll.getCost());
        System.out.println("Description: " + coffeeWithAll.getDescription());
        System.out.println();
        
        // Example 5: Different Decorator Order
        System.out.println("5. Different Decorator Order:");
        Coffee coffeeOrder1 = new SugarDecorator(new WhipDecorator(new SimpleCoffee()));
        Coffee coffeeOrder2 = new WhipDecorator(new SugarDecorator(new SimpleCoffee()));
        
        System.out.println("Order 1 (Sugar + Whip):");
        System.out.println("Cost: $" + coffeeOrder1.getCost());
        System.out.println("Description: " + coffeeOrder1.getDescription());
        System.out.println();
        
        System.out.println("Order 2 (Whip + Sugar):");
        System.out.println("Cost: $" + coffeeOrder2.getCost());
        System.out.println("Description: " + coffeeOrder2.getDescription());
        System.out.println();
        
        // Example 6: Building Coffee Step by Step
        System.out.println("6. Building Coffee Step by Step:");
        Coffee coffee = new SimpleCoffee();
        System.out.println("Base: " + coffee.getDescription() + " - $" + coffee.getCost());
        
        coffee = new MilkDecorator(coffee);
        System.out.println("Add Milk: " + coffee.getDescription() + " - $" + coffee.getCost());
        
        coffee = new SugarDecorator(coffee);
        System.out.println("Add Sugar: " + coffee.getDescription() + " - $" + coffee.getCost());
        
        coffee = new WhipDecorator(coffee);
        System.out.println("Add Whip: " + coffee.getDescription() + " - $" + coffee.getCost());
    }
}
