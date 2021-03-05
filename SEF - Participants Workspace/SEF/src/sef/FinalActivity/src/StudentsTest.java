import jdk.jfr.Description;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StudentsTest {

    @Before
    public void setUp(){


    }

    @Test (timeout = 1000 )
    @Description("Test student introduction")
    public void introductionTest() {
        String input = "RTU";
        Assert.assertEquals("I m study in university \"RTU\"",Students.introduction(input));
        Assert.assertNotEquals("I m study in university ",Students.introduction(input));



    }
}
