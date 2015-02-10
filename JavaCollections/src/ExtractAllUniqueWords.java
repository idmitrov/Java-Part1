/*
 	At the first line at the console you are given a piece of text. 
 	Extract all words from it and print them in alphabetical order.
	Consider each non-letter character as word separator.
	Take the repeating words only once. Ignore the character casing.
	 Print the result words in a single line, separated by spaces.
	 
	 EXAMPLES: https://softuni.bg/Trainings/Resources/Pdf/2952/Domashno-Java-Basics-Jan-2015
*/
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ExtractAllUniqueWords {
	
	public static void printMaxCountWords(Map<String, Integer> wordsCount,
			int maxValueInMap) {
		for (Map.Entry<String, Integer> word : wordsCount.entrySet()) {
			if (word.getValue() == maxValueInMap) {
				System.out.println(word.getKey() + " -> " + word.getValue() + " times");
				System.out.println();
			}
		}
	}

	public static Map<String, Integer> countWords(String[] words, Map<String, Integer> wordsCount) {
		for (String word : words) {
			Integer count = wordsCount.get(word);
			if (count == null) {
				count = 0;
			}
			wordsCount.put(word, count + 1);
		}
		return wordsCount;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		String[] words = input.nextLine().toLowerCase().split("\\W+");
		
		Map<String, Integer> wordsCount = new TreeMap<String, Integer>();
		wordsCount = countWords(words, wordsCount);
		
		int maxValueInMap=(Collections.max(wordsCount.values()));
		printMaxCountWords(wordsCount, maxValueInMap);

	}
}
