/*
 	HOMEWORK #3
  
	Write a program that enters an array of strings and 
	finds in it the largest sequence of equal elements. 
	If several sequences have the same longest length, 
	print the leftmost of them. The input strings are given 
	as a single line, separated by a space. 
	
	EXAMPLES: https://softuni.bg/Trainings/Resources/Pdf/2952/Domashno-Java-Basics-Jan-2015
*/

import java.util.Scanner;

public class LargestSequenceOfEqualStrings {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		String userInput = input.nextLine();
		String[] elements = userInput.split(" ");
		
		String largestSequence = "";
		int	crntCount = 1;
		
		for (int i = 0; i < elements.length; i++) {
			int count = 1;
			String currentSequence = "";
			
			for (int j = i + 1; j < elements.length; j++) {
				if (elements[i].equals(elements[j])) {
					currentSequence += elements[j] + " ";
					count++;	
				}
			}
			
			if (count > crntCount) {
				crntCount = count;
				largestSequence = currentSequence + elements[i];
			}
		}
		
		if (crntCount > 1) {
			System.out.println(largestSequence);
		} else {
			System.out.println(elements[0]);
		}
	}
}
