import java.util.Scanner;

public class Students {

    public static void main(String[] args) {
        greetingText();


    }

    public static String introduction(String university){
        String result = "I m study in university \""+university+ "\"";
        return result ;
    }
    public static void greetingText(){
        //Question for input
        System.out.println("Please type in your university: ");
        //Get data from input
        Scanner universityInput = new Scanner(System.in);
        String university = universityInput.nextLine();

        //Run method to introduce
        System.out.println(introduction(university));


    }
}
