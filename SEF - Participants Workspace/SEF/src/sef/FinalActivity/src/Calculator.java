import java.util.Scanner;

public class Calculator {

    private static int result;

    public static void main(String[] args) {
        //Console step 1
        System.out.println("Please type in first number:");
        Scanner firstInput = new Scanner(System.in);
        int nr1 = firstInput.nextInt();
        System.out.println("Please type in second number:");
        Scanner secondInput = new Scanner(System.in);
        int nr2 = secondInput.nextInt();
//        System.out.println("Result:" + addition(nr1,nr2));
        //Console step 2
        System.out.println("What action you would like to perform (type number):" +
                "\n1.Addition\n2.Minus\n3.Multiply\n4.Divide");

        //Result
        int actionNr = secondInput.nextInt();
        if (nr1 == (int)nr1 && nr2 == (int)nr2) {
            switch (actionNr) {
                case 1:
                    System.out.println(nr1 + " + " + nr2 + " = " + addition(nr1, nr2));
                    break;
                case 2:
                    System.out.println(nr1 + " - " + nr2 + " = " + minus(nr1, nr2));
                    break;
                case 3:
                    System.out.println(nr1 + " * " + nr2 + " = " + multiply(nr1, nr2));
                    break;
                case 4:
                    System.out.println(nr1 + " / " + nr2 + " = " + divide(nr1, nr2));
                    break;
            }
        }
        else{ System.out.println("Something went wrong, try retype your numbers");

        }
    }

    public static int addition(int a, int b){
        return a+b;
    }
    public static int minus(int a,int b){
        return a-b;
    }

    public static int multiply (int a,int b){
        return a*b;
    }

    public static int divide (int a, int b){
        try {
             result = a/b;

        }catch (Exception e){
             System.out.println("Cannot perform action "+ e.getMessage());
        }


        return result;
    }

}
