public class Main {
    public static void main(String[] args) {
        System.out.println("=== Template Method Pattern Demo ===\n");
        
        Game game = new Cricket();
        game.play();
        
        System.out.println();
        game = new Football();
        game.play();
    }
}
