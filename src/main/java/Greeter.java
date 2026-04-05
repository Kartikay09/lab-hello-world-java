public class Greeter {
    public String greet(String name) {
        if (name == null || name.trim().isEmpty()) {
            return "Hello, stranger!";
        }
        return "Hello, " + name.trim() + "!";
    }
}