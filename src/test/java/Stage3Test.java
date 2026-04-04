import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Stage3Test {

    private final Greeter greeter = new Greeter();

    @Test
    void greetNullReturnsStranger() {
        assertEquals("Hello, stranger!", greeter.greet(null));
    }

    @Test
    void greetEmptyStringReturnsStranger() {
        assertEquals("Hello, stranger!", greeter.greet(""));
    }

    @Test
    void greetBlankStringReturnsStranger() {
        assertEquals("Hello, stranger!", greeter.greet("   "));
    }

    @Test
    void greetValidNameStillWorks() {
        assertEquals("Hello, Karan!", greeter.greet("Karan"));
    }

    @Test
    void greetWithWhitespaceAroundValidName() {
        assertEquals("Hello, Alice!", greeter.greet("  Alice  "));
    }
}
