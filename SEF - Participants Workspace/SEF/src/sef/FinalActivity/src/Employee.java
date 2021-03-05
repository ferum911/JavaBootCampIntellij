public class Employee {
    //Initialization attributes
    private String name;
    private int age;
    private String jobTitle;
    private String company;


    //Create getters
    public String getName(){return name;}
    public int getAge(){return age;}
    public String getJobTitle(){return jobTitle;}
    public String getCompany(){return company;}

    //Create setters
    public void setName(String name) {
        try{
            if(!name.matches(".*\\d.*")){
            this.name = name;}else{
                throw new Exception("Wrong input");
            }
        }catch(Exception e)
        {System.out.println("Name has numbers, with error:"+ e);}
         }

    public void setAge(int age) {
        this.age = age;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setCompany(String company) {
        this.company = company;
    }


    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("Jo33hn");
        e.setAge(22);
        e.setJobTitle("CEO");
        e.setCompany("Google");

    introduceEmployee(e.getName(),e.getAge(),e.jobTitle,e.company);


    }

    public static void introduceEmployee(String name, int age, String jobTitle, String company){
       System.out.println("My name is "+name+ " and I am " +age+ " years old. I work as " +jobTitle+ " in " +company);


    }

}
