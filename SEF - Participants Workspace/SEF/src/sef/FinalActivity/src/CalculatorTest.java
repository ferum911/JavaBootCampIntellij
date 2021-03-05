import jdk.jfr.Description;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    private Calculator calculator;

    @Test
    @Description("Check addition/minus/divide/multiply function")
    public void calculatorTest(){

        int n1 = 12;
        int n2 = 6;
        Assert.assertEquals(calculator.addition(n1,n2),n1+n2);
        Assert.assertEquals(calculator.minus(n1,n2),n1-n2);
        Assert.assertEquals(calculator.multiply(n1,n2),n1*n2);
        Assert.assertEquals(calculator.divide(n1,n2),n1/n2);

    }
}
