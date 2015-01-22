import java.util.Scanner;

/*
 	Write a program that enters 3 points in the plane (as integer x and y coordinates),
  	calculates and prints the area of the triangle composed by these 3 points. 
  	Round the result to a whole number. In case the three points do not form a triangle, print "0" as result.
 */
public class TriangleArea {
	
	//CALCULATE TRIANGLE AREA BY GIVEN COORDS
	public static int calculateArea(int aX, int aY, int bX, int bY, int cX, int cY) {
		int area = Math.abs(aX * (bY - cY) + bX * (cY - aY) + cX * (aY - bY)) / 2;
		return area;
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Type side a X:");
		int aX = Integer.parseInt(input.nextLine());
		System.out.print("Type side a Y:");
		int aY = Integer.parseInt(input.nextLine());
		
		System.out.print("Type side b X:");
		int bX = Integer.parseInt(input.nextLine());
		System.out.print("Type side b Y:");
		int bY = Integer.parseInt(input.nextLine());
		
		System.out.print("Type side c X:");
		int cX = Integer.parseInt(input.nextLine());
		System.out.print("Type side c Y:");
		int cY = Integer.parseInt(input.nextLine());
		
		System.out.println("Triangle area = " + calculateArea(aX, aY, bX, bY, cX, cY));
	}
}
