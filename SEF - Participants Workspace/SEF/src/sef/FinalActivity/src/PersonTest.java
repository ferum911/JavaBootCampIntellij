import jdk.jfr.Description;
import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
    private Person person;

    @Test
    @Description("Test introduce method")
    public void introduceTest(){
        String name = "Arnis";
        int age = 32;
        Object introductionText = person.introduction(name, age);
        Assert.assertEquals("My name is Arnis and I am 32 years old!", introductionText);
    }
}
