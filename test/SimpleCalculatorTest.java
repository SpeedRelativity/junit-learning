import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SimpleCalculatorTest {

    @Test
    void addTwoNumbersTest() {
        SimpleCalculator calc = new SimpleCalculator();
        assertEquals(3, calc.add(1,2));
    }
}