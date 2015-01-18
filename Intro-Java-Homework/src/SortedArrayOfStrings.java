import java.util.Arrays;
import java.util.Scanner;

public class SortOfArray {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		//ARRAY LENGTH INPUT
		System.out.print("Array length: ");
		int arrLength = scan.nextInt();
		scan.nextLine();
		//INIT ARRAY
		String[] words = new String[arrLength];
		//FILL THE ARRAY
		for (int i = 0; i < arrLength; i++) {
			System.out.print("Type a string: ");
			words[i] = scan.nextLine();
		}
		//SORT AND PRINT THE ARRAY
		Arrays.sort(words);
		for (String word : words) {
			System.out.println(word);
		}
	}
}
