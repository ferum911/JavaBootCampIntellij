import java.util.Hashtable;
import java.util.Scanner;

public class Fibonacci {
    static Hashtable<Integer, Integer> obj = new Hashtable<Integer,Integer>();
    public static void main(String[] args) {

        System.out.println("Type number to get Fibonacci number:");
        Scanner firstInput = new Scanner(System.in);
        int number = firstInput.nextInt();

        obj.put(0,0);
        obj.put(1,1);
        for(int i = 2; i< number ;i++){
            obj.put(i,(obj.get(i-1)+obj.get(i-2)));

        }

        System.out.println("Your Fibonacci number is: " + obj.get(number-1));
    }


}
