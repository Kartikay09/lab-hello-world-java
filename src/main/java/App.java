public class App {

    public static void main(String[] args) {
        System.out.print("Hello, World!");
    }

    public static String greet(String name) {
        if (name == null || name.trim().isEmpty()) {
            return "Hello, stranger!";
        }
        return "Hello, " + name.trim() + "!";
    }
}