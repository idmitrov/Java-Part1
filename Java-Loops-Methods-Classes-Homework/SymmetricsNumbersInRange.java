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
		
		for (int crntNum = start; crntNum <= end; crntNum++) { 
			Boolean isSymmetric = true;
			String tempNum = Integer.toString(crntNum);
			
			for (int index = 0; index < (tempNum.length() + 1 ) / 2; index++) {
				char leftSideDigit = tempNum.charAt(index),
					 rightSideDigit = tempNum.charAt(tempNum.length() - index - 1);
				if (leftSideDigit != rightSideDigit) {
					isSymmetric = false;
					break;
				}
			}
			if (isSymmetric) {
				System.out.print(crntNum + " ");
			}
		}	
	}
}

/* USING STRING BUILDER
for (int i = start; i <= end; i++) {i
	StringBuilder iReversed = new StringBuilder(Integer.toString(i)).reverse();

	if (iReversed.toString().equals(Integer.toString(i))) {
		System.out.printf("%d ", i);
	}
}
END
 */