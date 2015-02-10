import java.util.Scanner;

/*
 	HOMEWORK #4
 	
 	Write a program to find all increasing sequences inside an array of integers.
 	The integers are given in a single line,separated by a space.
 	Print the sequences in the order of their appearance in the input array,
 	each at a single line.Separate the sequence elements by a space. 
 	Find also the longest increasing sequence and print it at the last line.
 	If several sequences have the same longest length, print the leftmost of them.
 	
 	EXAMPLES: https://softuni.bg/Trainings/Resources/Pdf/2952/Domashno-Java-Basics-Jan-2015
*/
public class LongestIncreasingSequence {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		String userInput = input.nextLine();
		String[] elements = userInput.split(" ");
		int[]numbers = new int[elements.length];
		
		for (int i = 0; i < elements.length; i++) {
			numbers[i] = Integer.parseInt(elements[i]);
		}

		int crntNum = 0,
			nextNum = 0,
			crntCount = 1;
		String longestSequence = "";
		
		for (int i = 0; i < numbers.length; i++) {
			crntNum = numbers[i];
			String crntSequence = numbers[i] + " ";
			int count = 1;
			for (int j = i + 1; j < numbers.length; j++) {
				nextNum = numbers[j];
				
				if (crntNum < nextNum) {
					crntSequence += nextNum + " ";
					count++;
					crntNum = nextNum;
				} else {
					break;
				}
			}
			System.out.println(crntSequence);
			if (count > crntCount) {
				crntCount = count;
				longestSequence = crntSequence;
			}
			i += count - 1;
		}
		if (crntCount > 1) {
			System.out.println("Longest: " + longestSequence);
		} else {
			System.out.println("Longest: " + numbers[0]);
		}
	}
}
