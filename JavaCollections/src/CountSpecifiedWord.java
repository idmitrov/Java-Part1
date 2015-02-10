/*
 Write a program to find how many times a word appears in given text. 
 The text is given at the first input line. 
 The target word is given at the second input line. 
 The output is an integer number. 
 Please ignore the character casing.
 Consider that any non-letter character is a word separator.
 
 EXAMPLES: https://softuni.bg/Trainings/Resources/Pdf/2952/Domashno-Java-Basics-Jan-2015
*/

import java.util.Scanner;

public class CountSpecifiedWord {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
			   
		//NOTICE line INPUT  IS ALAYS ON 1 LINE
		//AND specified word INPUT ON THE NEXT LINE
		String line = input.nextLine(),
			   specifiedWord = input.nextLine();
		
		String[] words = line.split("\\W+");
		
		int count = 0;
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(specifiedWord)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
