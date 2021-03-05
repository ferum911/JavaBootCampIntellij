import jdk.jfr.Description;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FirstActivityTest {
    private FirstActivity employee;
    static FirstActivity[] obj = new FirstActivity[3];

    @Before
    public void setUp() throws Exception {
        employee = new FirstActivity();
    }
    @After
    public void destroy(){
        employee = null;
    }

    @Test
    @Description("Test salary setters and getters")
    public void setAndGetTest(){
        double setSalary = 3000.0;
        Assert.assertEquals(0.0,employee.getSalary(),200.2);
        employee.setSalary(setSalary);
        Assert.assertEquals(setSalary,employee.getSalary(),1500.0);
        employee.setSalary(4000.2);
        Assert.assertNotEquals(setSalary,employee.getSalary());

    }
    @Test
    @Description("Test print by largest salary method")
    public void printByLargestSalaryTest(){
        FirstActivity em1 = new FirstActivity();
        FirstActivity em2 = new FirstActivity();
        FirstActivity em3 = new FirstActivity();

        em1.setSalary(3000.0);
        em2.setSalary(2000.0);
        em3.setSalary(5000.0);

        obj[0] = em1; obj[1] = em2; obj[2]= em3;

        employee.printByLargestSalary(obj);

        Assert.assertEquals(obj[0].getSalary(), 5000.0,0);
        Assert.assertEquals(obj[1].getSalary(), 3000.0,0);
        Assert.assertEquals(obj[2].getSalary(), 2000.0, 0);

        Assert.assertNotEquals(obj[0].getSalary(), 3000.0,0);
        Assert.assertNotEquals(obj[1].getSalary(), 2000.0,0);
        Assert.assertNotEquals(obj[2].getSalary(), 4000.0, 0);

    }
}
