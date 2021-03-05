import jdk.jfr.Description;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest  {
    private Employee employee;

    @Before
    public void setUp() throws Exception {
        employee = new Employee();
    }
    @After
    public void destroy(){
        employee = null;
    }

@Test
@Description("Test Name geters seters")
    public void setAndGetNameTest() {
    String setName = "JasonTest";
    Assert.assertNull(employee.getName());
    employee.setName(setName);
    Assert.assertEquals(employee.getName(), setName);
    employee.setName("Francis");
    Assert.assertNotEquals(employee.getName(), setName);
}
@Test
@Description("Test age setters and getters")
    public void SetAndGetAgeTest() {
        int setAge = 88;
        Assert.assertEquals(0,employee.getAge());
        employee.setAge(setAge);
        Assert.assertEquals(setAge,employee.getAge());
        employee.setAge(44);
        Assert.assertNotEquals(setAge,employee.getAge());
    }
@Test
@Description("Test jobTitle setters and getters")
    public void setAndGetJobTitleTest(){

        String setJobTitle = "Developer";
        Assert.assertNull(employee.getJobTitle());
        employee.setJobTitle(setJobTitle);
        Assert.assertEquals(employee.getJobTitle(), setJobTitle);
        employee.setJobTitle("Hacker");
        Assert.assertNotEquals(employee.getJobTitle(), setJobTitle);


    }
@Test
@Description("Test Company setters and getters")
    public void setAndGetCompanyTest(){

    String setCompany = "Facebook";
    Assert.assertNull(employee.getCompany());
    employee.setCompany(setCompany);
    Assert.assertEquals(employee.getCompany(), setCompany);
    employee.setCompany("Tesla");
    Assert.assertNotEquals(employee.getCompany(), setCompany);
}
@Test
@Description("Test method introduce employee")
    public void introduceEmployeeTest(){

        employee.setName("Jack");
        employee.setAge(35);
        employee.setJobTitle("Craftsman");
        employee.setCompany("Disney");
        Assert.assertEquals("My name is Jack and I am 35 years old. I work as Craftsman in Disney",
                "My name is "+employee.getName()+ " and I am " +employee.getAge()+ " years old. I work as " +employee.getJobTitle()+ " in " +employee.getCompany());


}

}
