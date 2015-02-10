/*
 Write a program to find how many times given string appears in given text as substring.
 The text is given at the first input line. The search string is given at the second input line. 
 The output is an integer number. Please ignore the character casing
 
 EXAMPLES: https://softuni.bg/Trainings/Resources/Pdf/2952/Domashno-Java-Basics-Jan-2015
*/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountSubstringOccurrences {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		String text = input.nextLine().toLowerCase(),
			   searchString = input.nextLine();
		
		Pattern StrPattern = Pattern.compile(searchString);
		Matcher matchPattern = StrPattern.matcher(text);
		
		int count = 0;
		
		while (matchPattern.find()) {
			count++;
			int startIndex = matchPattern.start();
			matchPattern.region(startIndex + 1, text.length());
		}
		System.out.println(count);
	}
}
