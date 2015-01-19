import java.util.Locale;
import java.util.Scanner;

public class TheSmallestOf3Numbers {
	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Type 3 numbers");
		
		double firstNum = scan.nextDouble(),
			   secondNum = scan.nextDouble(),
			   thirdNum = scan.nextDouble(),
			   smallestNum = Math.min(Math.min(firstNum, secondNum), thirdNum);
		//IF SMALLEST IS WHOLE NUMBER PRINT IT WITHOUT FLOATING AND ZEROES
		if (smallestNum % 1 == 0) {
			System.out.println("Smallest is: " + (int)smallestNum);
		} else {
			System.out.println("Smallest is: " + smallestNum);
		}
	}
}
