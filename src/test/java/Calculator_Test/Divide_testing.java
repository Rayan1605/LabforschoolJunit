package Calculator_Test;

import Calculator.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Divide_testing {
    Calculator calculator = new Calculator(2,2);
@Test
@DisplayName("Testing the divide method")
    public void test_divide() {
        assertEquals(1, calculator.divide());
    }

}
