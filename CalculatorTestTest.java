import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTestTest {

    @Before
    public void setUp(){
        Calculator calculator = new Calculator();
    }
    @Test
    public void testAddition(int summand1, int summand2) {
        Calculator calculator = new Calculator(3, 5);
        assertEquals(8, calculator.addition());
    }


}