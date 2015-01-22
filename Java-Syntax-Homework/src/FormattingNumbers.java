import java.text.MessageFormat;
import java.util.Locale;
import java.util.Scanner;

public class FormattingNumbers {
	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int a = 0; double b = 0, c = 0;
		do {
			   a = input.nextInt();
			   b = input.nextDouble();
			   c = input.nextDouble();
		} while (!(a >= 0 && a <= 500));
		
		String firstCol = String.format("%1$-" + 10 + "x".toUpperCase(), a),
			   secondCol = String.format("%1$" + 10 + "s", Integer.toBinaryString(a)).replace(' ', '0'),
			   thirdCol = String.format("%1$" + 10 + ".2f", b),
			   lastCol = String.format("%1$-" + 10 + ".3f", c);
		
	    System.out.print(MessageFormat.format("|{0}|{1}|{2}|{3}|",firstCol, secondCol, thirdCol, lastCol));
	}
}
