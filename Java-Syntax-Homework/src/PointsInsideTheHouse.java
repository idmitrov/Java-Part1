import java.util.Locale;
import java.util.Scanner;

public class PointsInsideTheHouse {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.ROOT);
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		double pointX = input.nextFloat(),
		       pointY = input.nextFloat();
		//(Bx-Ax)*(Y-Ay) - (By-Ay)*(X-Ax)
		double firstPos = (22.5 - 12.5) * (pointY - 8.5) - (8.5 - 8.5) * (pointX - 12.5);
		double secondPos = (17.5 - 12.5) * (pointY - 8.5) - (3.5 - 8.5) * (pointX - 12.5);
		double thirdPos = (22.5 - 17.5) * (pointY - 3.5) - (8.5 - 3.5) * (pointX - 17.5);
		
		if ((firstPos <= 0 && secondPos >= 0 && thirdPos >= 0)
		|| (firstPos >= 0 && pointY <= 13.5 && pointX >= 12.5 && pointX <= 17.5) 
		|| (firstPos >= 0 && pointY <= 13.5 && pointX >= 20 && pointX <= 22.5)) {
			System.out.println("Inside");
		} else {
			System.out.println("Outside");
		}
		
	}
}
