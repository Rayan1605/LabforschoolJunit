package Calculator_Test;

import Calculator.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Testing_add {
@Test
    public void test_add() {
     Calculator calculator = new Calculator(2,2);
     assertEquals(4, calculator.add());
    }

}
