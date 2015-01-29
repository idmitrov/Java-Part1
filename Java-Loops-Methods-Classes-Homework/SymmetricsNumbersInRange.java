import java.util.Scanner;

public class SymmetricsNumbersInRange {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int start = 0, end = 0;
		 
		do {
			start = input.nextInt();
			end = input.nextInt();
		} while (start < 0 || start > end || end > 999);
		 
		int firstDigit = 0, lastDigit = 0;
		
		for (int i = start; i <= end; i++) {
			if (i <= 9) {
				System.out.printf("%d ", i);
				continue;
			}
			
			firstDigit = getFirstDigit(firstDigit, i);
			lastDigit = i % 10;

			if (firstDigit == lastDigit) {
				System.out.printf("%d ", i);
			}
			//speed up loop iterations
			i = iterationBoost(i);
		}
	}

	private static int getFirstDigit(int firstDigit, int i) {
		if (i >= 10 && i <= 99) {
			firstDigit = i / 10;
		} else if (i >= 99 && i <= 999) {
			firstDigit = i / 100;

		}
		return firstDigit;
	}

	private static int iterationBoost(int i) {
		if (i >= 11 && i <= 88) {

		} else if (i >= 101) {
			if (i != 191 && i != 292 && i != 393 && i != 494 && i != 595
					&& i != 696 && i != 797 && i != 898) {

				i += 9;
			} else {
				i += 10;
			}
		}
		return i;
	}
}

/* USING STING
for (int i = start; i <= end; i++) {
	StringBuilder iReversed = new
	StringBuilder(Integer.toString(i)).reverse();

	if (iReversed.toString().equals(Integer.toString(i))) {
		System.out.printf("%d ", i);
	}
}
END OF USING STRING
 */