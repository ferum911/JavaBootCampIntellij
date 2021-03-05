

public class FirstActivity extends Employee{
    double salary;
    public double getSalary(){return salary;}
    public double setSalary(double salary){return this.salary = salary;}

    //Declaring array
    static FirstActivity[] obj = new FirstActivity[3];

    //Declare temporary array
    static FirstActivity[] temp = new FirstActivity[3];


    public static void main(String[] args) {
        FirstActivity em1 = new FirstActivity();
        em1.setName("Green");
        em1.setAge(24);
        em1.setJobTitle("Dev");
        em1.setCompany("IBM");
        em1.setSalary(2000.3);

        FirstActivity em2 = new FirstActivity();
        em2.setName("Jack");
        em2.setAge(99);
        em2.setJobTitle("Hacker");
        em2.setCompany("Undefined");
        em2.setSalary(5000);

        FirstActivity em3 = new FirstActivity();
        em3.setName("Frank");
        em3.setAge(40);
        em3.setJobTitle("Security");
        em3.setCompany("DHL");
        em3.setSalary(1500.3);
        //Test salary get
        //System.out.println("Test " + em1.getSalary());


//        Assign objects
        obj[0] = em1;
        obj[1] = em2;
        obj[2] = em3;

        printByLargestSalary(obj);
        printByLargestSalaryExtract();

    }

    public static void printByLargestSalary(FirstActivity[] obj){
        //Implement sorting

        for(int i = 0; i< obj.length; i++) {



            for (int j = i + 1; j < obj.length; j++) {
                if (obj[i].getSalary() < obj[j].getSalary()) {
                    temp[i] = obj[i];
                    obj[i] = obj[j];
                    obj[j] = temp[i];


                }


            }
        }

    }

    public static void printByLargestSalaryExtract(){
        //Implement output
        System.out.println("Higher paid roles:");
        for(int i = 0; i < obj.length; i++) {
            System.out.println(obj[i].getName() + " earns " + obj[i].getSalary() + " and works in " + obj[i].getCompany());
        }
    }
}
