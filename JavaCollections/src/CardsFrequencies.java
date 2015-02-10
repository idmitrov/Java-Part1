import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class CardsFrequencies {
	//FILL MAP
		public static Map<String, Integer> fillMap(String[] cards,	Map<String, Integer> cardsCount) {
			for (String card : cards) {
				Integer count = cardsCount.get(card);
				if (count == null) {
					count = 0;
				}
				cardsCount.put(card, count + 1);
			}
			return cardsCount;
		}
	//CALCULATE SUM
	private static double calcSum(Map<String, Integer> cardsCount) {
		double sumOfValues = 0;
		for (Map.Entry<String, Integer> card : cardsCount.entrySet()) {
			sumOfValues += card.getValue();
		}
		return sumOfValues;
	}
	//RESULT
	public static void result(Map<String, Integer> cardsCount,
			double sumOfValues) {
		for (Map.Entry<String, Integer> card : cardsCount.entrySet()) {
			double frequency = (card.getValue() / sumOfValues) * 100;
			System.out.printf("%s -> %.2f%%", card.getKey(), frequency);
			System.out.println();
		}
	}
	//MAIN
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String[] cards = input.nextLine().split("\\W+");
		
		Map<String, Integer> countCards = new LinkedHashMap<String, Integer>();
		countCards = fillMap(cards, countCards);
		double sum = calcSum(countCards);
		
		result(countCards, sum);
	}
}