import java.util.Random;
import java.util.Scanner;

public class RandomHandsOf5Cards {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		String[] cardFace = { "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"A", "J", "Q", "K" };
		char[] cardSuit = { '♠', '♥', '♣', '♦' };
		int userInput = input.nextInt();
		
		int card1 = 0, card2 = 0, card3 = 0, card4 = 0, card5 = 0,
			suit1 = 0, suit2 = 0, suit3 = 0, suit4 = 0, suit5 = 0;
		
		Random cardGenerator = new Random();
		
		for (int i = 0; i < userInput; i++) {
			card1 = cardGenerator.nextInt(cardFace.length);
			suit1 = cardGenerator.nextInt(cardSuit.length);
			do {
				card2 = cardGenerator.nextInt(cardFace.length);
				suit2 = cardGenerator.nextInt(cardSuit.length);
			} while (card2 == card1 & suit2 == suit1);
			do {
				card3 = cardGenerator.nextInt(cardFace.length);
				suit3 = cardGenerator.nextInt(cardSuit.length);
			} while (card3 == card2 && suit3 == suit2 ||
					 card3 == card1 && suit3 == suit1 );
			do {
				card4 = cardGenerator.nextInt(cardFace.length);
				suit4 = cardGenerator.nextInt(cardSuit.length);
			} while (card4 == card3 && suit4 == suit3 ||
					 card4 == card2 && suit4 == suit2 ||
					 card4 == card1 && suit4 == suit1 );
			do {
				card5 = cardGenerator.nextInt(cardFace.length);
				suit5 = cardGenerator.nextInt(cardSuit.length);
			} while (card5 == card4 && suit5 == suit4 ||
					 card5 == card3 && suit5 == suit3 ||
					 card5 == card2 && suit5 == suit2 ||
					 card5 == card1 && suit5 == suit1 );
			System.out.printf("%s %s %s %s %s%n", 
					cardFace[card1] + "" + cardSuit[suit1], cardFace[card2] + "" + cardSuit[suit2],
                    cardFace[card3] + "" + cardSuit[suit3], cardFace[card4] + "" + cardSuit[suit4],
                    cardFace[card5] + "" + cardSuit[suit5]);
		}
	}
}
