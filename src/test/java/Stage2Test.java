import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Stage2Test {

    private final Greeter greeter = new Greeter();

    @Test
    void greetReturnsPersonalisedMessage() {
        assertEquals("Hello, Karan!", greeter.greet("Karan"));
    }

    @Test
    void greetTrimsWhitespace() {
        assertEquals("Hello, Alice!", greeter.greet("  Alice  "));
    }

    @Test
    void greetWithSimpleName() {
        assertEquals("Hello, Bob!", greeter.greet("Bob"));
    }
}
