import java.util.Locale;
import java.util.Scanner;

public class TheSmallestOf3Numbers {
	
	public static void main(String[] args) {
		//LOCALE
		Locale.setDefault(Locale.ROOT);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		//FIRST NUMBER
		System.out.print("Type the first number: ");
		double firstNum = Double.parseDouble(input.nextLine());
		//SECOND NUMBER
		System.out.print("Type the second number: ");
		double secondNum = Double.parseDouble(input.nextLine());
		//THIRD NUMBER
		System.out.print("Type the third number: ");
		double thirdNum = Double.parseDouble(input.nextLine());
		//COMPARING NUMBERS
		double result = (Math.min(firstNum, Math.min(secondNum, thirdNum)));
		//RESULT
		if (result % 1 == 0) {
			System.out.println((int)result);
		} else {
			System.out.println(result);
		}
	}			
}
