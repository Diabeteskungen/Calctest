import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    @DisplayName("2 + 1 = 3")
    void addsTwoNumbers(){
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.add(2,1 ),"2 + 1 should equal 3");
    }

    @Test
    @DisplayName("2 - 1 = 1")
    void substractTwoNumbers(){
        Calculator calculator = new Calculator();
        assertEquals(1,calculator.subtract(2,1),"2 - 1 should equal 1");
    }

}
