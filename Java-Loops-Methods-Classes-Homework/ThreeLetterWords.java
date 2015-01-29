import java.util.Scanner;

public class ThreeLetterWords {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		String userInput = "";
		char[] letters = new char[userInput.length()];
		
		do {
			userInput = input.next();
			letters = userInput.toCharArray();
		} while (userInput.length() < 1 ||
				 userInput.length() > 3);
		
		printLetters(letters);
	}
	//PRINT LETTERS
	private static void printLetters(char[] letters) {
		if (letters.length == 3) {
			for (int i3 = 0; i3 < 3; i3++) {
				for (int i2 = 0; i2 < 3; i2++) {
					for (int i = 0; i < 3; i++) {
						System.out.printf("%s%s%s ", letters[i3], letters[i2], letters[i]);
					}
				}
			}
		} else if (letters.length == 2) {
			for (int i3 = 0; i3 < 2; i3++) {
				for (int i2 = 0; i2 < 2; i2++) {
					for (int i = 0; i < 2; i++) {
						System.out.printf("%s%s%s ", letters[i3], letters[i2], letters[i]);
					}
				}
			}
		} else {
			System.out.printf("%s%s%s", letters[0], letters[0], letters[0]);
		}
	}
	//END OF PRINT LETTERS
}
