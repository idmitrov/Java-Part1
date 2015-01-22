import java.util.Scanner;


public class CountOfEqualBitsPairs {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt(),
			mask = 3,
			pairs = 0;
		
		while (n != 0) {
			if ((n & mask) == 3 || (n & mask) == 0) {
				pairs++;
			}
			n >>= 1;
		}
		System.out.println(pairs);
	}
}
