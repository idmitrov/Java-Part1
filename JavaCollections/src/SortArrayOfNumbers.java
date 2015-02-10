/*
 	HOMEWORK #1
 
	Write a program to enter a number n and n integer numbers
	and sort and print them. Keep the numbers in array of integers: int[]
	
	EXAMPLES: https://softuni.bg/Trainings/Resources/Pdf/2952/Domashno-Java-Basics-Jan-2015
*/
import java.util.Arrays;
import java.util.Scanner;

public class SortArrayOfNumbers {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int[] numbers = new int[n];
		
		for (int i = 0; i < n; i++) {
			numbers[i] = input.nextInt(); 
		}
		Arrays.sort(numbers);
		
		for (int number : numbers) {
			System.out.print(number + " ");
		}
	}
}
