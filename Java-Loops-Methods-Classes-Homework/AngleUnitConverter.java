import java.util.Scanner;


public class AngleUnitConverter {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int userInput = scanner.nextInt();
		
		for (int i = 0; i < userInput; i++) {
			double value = scanner.nextDouble();
			String measure = scanner.next();
			
			switch (measure) {
			case "deg": System.out.printf("%6f rad%n", value * Math.PI / 180); break;
			case "rad": System.out.printf("%6f deg%n", value * 180 / Math.PI); break;
			default:System.out.println("Unknown measure type!"); break;
			}
		}

	}
}