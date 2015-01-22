/*
 	Write a program that enters a positive integer number num
 	and converts and prints it in hexadecimal form. 
 	You may use some built-in method from the standard Java libraries.
 */
import java.text.MessageFormat;
import java.util.Scanner;

public class DecToHexdec {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		//DECIMAL TO HEX
		int decNum = Integer.parseInt(input.nextLine());
		String hexNum = Integer.toHexString(decNum);
		
		System.out.println(MessageFormat.format("The hex is: {0}", hexNum.toUpperCase()));
	}
}
