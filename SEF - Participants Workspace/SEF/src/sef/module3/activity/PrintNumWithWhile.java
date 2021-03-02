/**
 * 
 */
package activity;

/**
 * @author 
 *
 */
public class PrintNumWithWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		// Print all even numbers less than 100
		int i = 0;
		while(i<=100){
			System.out.println("Even: " + i);
			i=i+2;			
		}

		int j = 0;
		while(j<100){
			if (j % 2 !=0){
			System.out.println("Odd: " + j);}
			j=j+1;
		}

		// write code to Print all odd numbers less than 100

	}

}
