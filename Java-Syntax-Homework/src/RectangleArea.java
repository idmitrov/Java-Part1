import java.util.Scanner;

/*
 	Write a program that enters the sides of a rectangle (two integers a and b)
  	and calculates and prints the rectangle's area.
 */

public class RectangleArea {
	
	//RECTANGLE AREA METHOD
	public static int calculateArea (int sideA, int SideB) {
		int area = sideA * SideB;
		return area;
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Type sides A and B");
		int sideA = input.nextInt(),
			sideB = input.nextInt();

		System.out.println("Area = " + calculateArea(sideA, sideB));
	}
}
