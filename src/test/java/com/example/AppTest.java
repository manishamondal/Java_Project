import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testMainMethod() {
        // Assuming App has a method that returns a string for testing
        String expected = "Hello, World!";
        String actual = App.getGreeting(); // Example method to test
        assertEquals(expected, actual);
    }
}