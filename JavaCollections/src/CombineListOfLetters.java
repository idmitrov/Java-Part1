import java.util.ArrayList;
import java.util.Scanner;

public class CombineListOfLetters {
	//START OF METHOD
	private static void fillUpLists(ArrayList<Character> list1,
			ArrayList<Character> list2, String firstList, String secondList) {
		for (Character ch : firstList.toCharArray()) {
			if (!ch.equals(' ')) {
				list1.add(ch);
			}
		}
		
		for (Character ch : secondList.toCharArray()) {
			if (!ch.equals(' ')) {
				list2.add(ch);
			}
		}
	}
	//END OF METHOD
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
				
		ArrayList<Character> list1 = new ArrayList<Character>();
		ArrayList<Character> list2 = new ArrayList<Character>();
		String firstList = input.nextLine();
		String secondList = input.nextLine();
		
		fillUpLists(list1, list2, firstList, secondList);
		//FROM LIST2 TO LIST1 IF CHARACTER DOESNT EXIST IN LIST1
		for (Character ch : list2) {
			if (!list1.contains(ch)) {
				list1.add(ch);
			}
		}
		//PRINT RESULT
		for (Character character : list1) {
			System.out.print(character + " ");
		}
	}
}
