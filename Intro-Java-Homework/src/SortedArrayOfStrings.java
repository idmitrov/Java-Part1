import java.util.*;


public class SortedArrayOfStrings {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] myStringArray = new String[n];
		
		for (int i = 0; i < n; i++) {
			myStringArray[i] = new Scanner(System.in).nextLine();
		}

		Arrays.sort(myStringArray);
		for (String sentence : myStringArray) {
			System.out.println(sentence);
		}
	}
}
