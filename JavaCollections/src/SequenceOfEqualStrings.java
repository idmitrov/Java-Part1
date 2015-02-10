import java.util.Scanner;

/*
 	HOMEWORK #2
 
	Write a program that enters an array of strings 
	and finds in it all sequences of equal elements.
	The input strings are given as a single line, 
	separated by a space.
	
	EXAMPLES: https://softuni.bg/Trainings/Resources/Pdf/2952/Domashno-Java-Basics-Jan-2015
 */
public class SequenceOfEqualStrings {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		
		
		String[] elements = text.split(" ");
		
		for (int i = 0; i < elements.length; i++) {		
			int repeatedElements = 0;
			for (int j = i + 1; j < elements.length; j++) {
				if (elements[i].equals(elements[j])) {
					System.out.print(elements[j] + " ");
					repeatedElements++;
				}
			}
			System.out.println(elements[i]);
			i += repeatedElements;
		}
	}
}
