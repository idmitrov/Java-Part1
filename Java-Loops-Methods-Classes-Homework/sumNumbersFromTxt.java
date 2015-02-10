import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class sumNumbersFromTxt {
	public static void main(String[] args) {
		File file = new File("Input.txt");
		long sum = 0;
		
		try {
			@SuppressWarnings("resource")
			Scanner input = new Scanner(file);
			while (input.hasNext()) {
				sum += Integer.parseInt(input.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error");
			return;
		}
		System.out.println(sum);
	}
}