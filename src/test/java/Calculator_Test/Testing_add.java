package Calculator_Test;

import Calculator.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Testing_add {
    Calculator calculator = new Calculator(2,2);
@Test
@DisplayName("Testing the add method")
    public void test_add() {
     assertEquals(4, calculator.add());
    }


}
