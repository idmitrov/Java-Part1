import java.util.Locale;
import java.util.Scanner;

public class PointsInsideFigure {
	public static void main(String[] args) {
		//LOCALE
		Locale.setDefault(Locale.ROOT);
		//SCANNER INPUT
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Type 2 points: ");
		double pointX = scan.nextDouble(),
			   pointY = scan.nextDouble();
		//IS INSIDE OF THE LEFT PART OF THE FIGURE
		boolean isInLeft = pointX >= 12.5 && pointX <= 17.5
						&& pointY >= 8.5 && pointY <= 13.5,
				
		//IS INSIDE OF THE TOP PART OF THE FIGURE
				isInTop = pointX >= 12.5 && pointX <= 22.5
						&& pointY >= 6.0 && pointY <= 8.5,
						
		//IS INSIDE OF THE TOP PART OF THE FIGURE
				isInRight = pointX >= 20.0 && pointX <= 22.5
						&& pointY >= 8.5 && pointY <= 13.5;
						
						System.out.println(isInLeft || isInTop || isInRight ? "Inside" : "Outside");
	}
}
