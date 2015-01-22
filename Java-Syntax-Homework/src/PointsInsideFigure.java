import java.util.Locale;
import java.util.Scanner;

/*
	Write a program to check whether a point is inside or outside of the figure below.
	The point is given as a pair of floating-point numbers, separated by a space. 
	Your program should print "Inside" or "Outside".

 */
public class PointsInsideFigure {
	//RETURN IS INSIDE OR NOT METHOD
	public static String isInside(double posX, double posY) {
		boolean isInsideL = (posX >= 12.5 && posX <= 17.5) && (posY >= 8.5 && posY <= 13.5),
				isInsideT = (posX >= 12.5 && posX <= 22.5) && (posY >= 6 && posY <= 8.5),
				isInsideR = (posX >= 20 && posX <= 22.5) && (posY >= 8.5 && posY <= 13.5);
		String result = isInsideL || isInsideR || isInsideT ? "Inside" : "Outside";
		return result;
	}
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Type position X: ");
		double posX = Double.parseDouble(input.nextLine());
		
		System.out.print("Type position Y: ");
		double posY = Double.parseDouble(input.nextLine());
		
		System.out.println(isInside(posX, posY));
		
		
	}
}
