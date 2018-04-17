import com.sergeydolgozvjaga.tempcalc.Logic.Operations;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OperationsTest {

    private int actualKalvin = 45;
    private int actualCelsius = 50;
    private int actualFahrenheit = 150;

    private Operations oper;

    public OperationsTest() {
        oper = new Operations();
    }

    @Before
    public void before(){
        System.out.println("before test");
    }

    @After
    public void after(){
        System.out.println("after test");
    }

    @Test
    public void testKalvinToFahrenheit(){
        assertEquals(oper.kalvinToFahrenheitAll(actualKalvin), -378);
    }

    @Test
    public void testCelsiusToKalvin(){
        assertEquals(oper.celsiusToKalvinAll(actualCelsius), 323);
    }

    @Test
    public void testFahrenheitToCelsius(){
        assertEquals(oper.fahrenheitToCelsiusAll(actualFahrenheit), 65);
    }

    @Test
    public void testKalvinToCelsius(){
        assertEquals(oper.kalvinToCelsiusAll(actualKalvin), -228);
    }

    @Test
    public void testFahrenheitToKalvin(){
        assertEquals(oper.fahrenheitToKalvinAll(actualFahrenheit), 273);
    }

    @Test
    public void testCelsiusToFahrenheit(){
        assertEquals(oper.celsiusToFahrenheitAll(actualCelsius), 122);
    }
}
