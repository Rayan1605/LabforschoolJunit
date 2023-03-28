package Calculator_Test;
import Calculator.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Testing_mutiply {

    Calculator calculator = new Calculator(2,2);

    @Test
    @DisplayName("Testing the multiply method")
    public void test_multiply() {
        assertEquals(4, calculator.multiply());
    }


}
