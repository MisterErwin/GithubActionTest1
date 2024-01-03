import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        TestClass classUnderTest = new TestClass();
        assertNotNull(classUnderTest.getName(), "Name");
    }
}
