package Exercise4;

import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp(){
        calculator = new Calculator();
        System.out.println("Setting up the test environment.");
    }
    @After
    public void tearDown(){
        calculator = null;
        System.out.println("Cleaning up the test environment.");
    }
    @Test
    public void testAdd() {
        //arrange
        int a =2;
        int b =3;
        //act
        int result = calculator.multiply(a,b);
        //assert
        assertEquals(6, result);
    }

}