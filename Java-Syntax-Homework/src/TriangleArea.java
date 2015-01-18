import java.util.Scanner;

public class TriangleArea {
	public static void main(String[] args) {
		//SCANNER INPUT
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		//SIDE A X:
		System.out.print("SideA coord X: ");
		int sideAX = Integer.parseInt(scan.nextLine());
		//SIDE A Y:
		System.out.print("SideA coord Y: ");
		int sideAY = Integer.parseInt(scan.nextLine());
		
		//SIDE B X:
		System.out.print("SideB coord X: ");
		int sideBX = Integer.parseInt(scan.nextLine());
		//SIDE B Y:
		System.out.print("SideB coord Y: ");
		int sideBY = Integer.parseInt(scan.nextLine());
		
		//SIDE C X:
		System.out.print("SideC coord X: ");
		int sideCX = Integer.parseInt(scan.nextLine());
		//SIDE C Y:
		System.out.print("SideC coord Y: ");
		int sideCY = Integer.parseInt(scan.nextLine());
		
		int area = Math.abs(sideAX * (sideBY - sideCY)
				+ sideBX * (sideCY - sideAY) 
				+ sideCX * (sideAY - sideBY)) / 2;
		
		System.out.println("Area = " + area);
	}
}
