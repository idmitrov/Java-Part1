import java.util.Scanner;

/*
			 Write a program that enters the sides of a rectangle
			 (two integers a and b) and calculates and prints the rectangle's area. Examples:
	 
		 */
public class RectangleArea {
	public static void main(String[] args) {
		//SCANNER INPUT
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		//SIDE A
		System.out.print("Type side A: ");
		int a = Integer.parseInt(scan.nextLine());
		
		//SIDE B
		System.out.print("Type side B: ");
		int b = Integer.parseInt(scan.nextLine()),
		
		//RECTANGLE AREA
			area = a * b;
		
		//RESULT
		System.out.println("Rectangle area is: " + area);
	}
}
