import static org.junit.jupiter.api.Assertions.assertEquals;
import Calulator;

public class CalculatorTest {

    //ARRANGE
    private final Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(2, calculator.add(1, 1));
    }

    @Test
    @Order(1)
    void subtract() {
        assertEquals(1, calculator.subtract(3, 2));
    }

    @Test
    @Order(2)
    void multiply() {
        assertEquals(4, calculator.multiply(2, 2));
    }

    @Test
    @Order(3)
    void divide() {
        assertEquals(3, calculator.divide(9, 3));
    }

    @Test
    @Test(expected=IllegalArgumentException.class)
    public void divideException() {
        calculator.divide(2, 0);
    }
}
