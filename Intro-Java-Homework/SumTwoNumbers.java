import java.util.Scanner;

public class SumTwoNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Type a number: ");
		int firstNum = scan.nextInt();
		
		System.out.println("Type a number: ");
		int	secondNum = scan.nextInt(),
			sumNumbers = firstNum + secondNum;
		
		System.out.println("The sum is: " + sumNumbers);
	}
}