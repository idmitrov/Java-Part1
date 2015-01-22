import java.util.Scanner;

public class CountOfBitsOne {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt(),
			count = 0;

		while (n != 0) {
			if ((n & 1) == 1) {
				count++;
			}
			n >>= 1 ;
		}
		System.out.println(count);
	}
}
