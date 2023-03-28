package Calculator_Test;

import Calculator.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Minus_Test {
    Calculator calculator = new Calculator(2,2);
@Test
@DisplayName("Testing the subtract method")
    public void test_minus() {
        assertEquals(0, calculator.subtract());
    }
}
