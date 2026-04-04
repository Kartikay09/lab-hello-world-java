import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class Stage1Test {

    @Test
    void mainPrintsHelloWorld() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Main.main(new String[]{});

        System.setOut(System.out);
        String output = out.toString().trim();
        assertEquals("Hello, World!", output,
            "Expected main() to print exactly: Hello, World!");
    }
}
