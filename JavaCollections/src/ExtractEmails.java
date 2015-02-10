/*
	Write a program to extract all email addresses from given text. 
	The text comes at the first input line. Print the emails in the output,
	each at a separate line. Emails are considered to be in format <user>@<host>
*/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		String text = input.nextLine();
		
		Pattern emailExample = Pattern.compile("[\\w]+[\\.-]*[\\w]+@[A-Za-z-]+-*[A-Za-z]\\.[A-Za-z]+\\.*[A-Za-z]+"); 	
		Matcher emailValidate = emailExample.matcher(text);
		
		while (emailValidate.find()) {
			System.out.println(emailValidate.group());
		}
	}
}
