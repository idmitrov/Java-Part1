/*
	Write a program to count the number of words in given sentence. 
	Use any non-letter character as word separator.
	
	EXAMPLES: https://softuni.bg/Trainings/Resources/Pdf/2952/Domashno-Java-Basics-Jan-2015
*/
import java.util.Scanner;

public class CountAllWords {

	public static void main(String[] args) {
		@SuppressWarnings({"resource"})
		Scanner input = new Scanner(System.in);
		
		String line = input.nextLine();
		
		String[] words = line.split("\\W+");
		int count = words.length;
		System.out.println(count);
		
//		UNCOMENT TO TEST (COMENT LINES: 17, 18, 19 TO WORK)
//		int count = 0;
//		
//		while(line.length() > 0) {
//			String[] words = line.split("\\W+");
//			count += words.length;
//			line = input.nextLine();
//		}
//		System.out.println(count);
		
	}
}
