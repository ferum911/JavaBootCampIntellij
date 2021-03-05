import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Export extends Employee {
    static Employee[] obj = new Employee[3];
    public static void main(String[] args) {

        Employee em1 = new Employee();
        em1.setName("Klint");
        em1.setAge(41);
        em1.setCompany("Boeing");

        Employee em2 = new Employee();
        em2.setName("Flint");
        em2.setAge(31);
        em2.setCompany("Tesla");

        Employee em3 = new Employee();
        em3.setName("Green");
        em3.setAge(50);
        em3.setCompany("Apple");

        obj[0]=em1; obj[1]=em2; obj[2]=em3;

        try {
            File outFile = new File("output.txt");
            if (outFile.createNewFile()) {
                System.out.println("File created: " + outFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            FileWriter myWriter = new FileWriter("output.txt");
            for(int i = 0; i< obj.length;i++){
            myWriter.write(obj[i].getName() + " is "+ obj[i].getAge() + " years old, and works in "+ obj[i].getCompany()+"\n");

            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
