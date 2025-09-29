public class Main{
    public static void main(String[] args) {
        LazySingleton singleton1 = LazySingleton.getInstance();
        System.out.println(singleton1);
        LazySingleton singleton2 = LazySingleton.getInstance();
        System.out.println(singleton2);

        System.out.println("Are both instances the same? " + (singleton1 == singleton2));
    }
}