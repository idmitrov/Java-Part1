public class FullHouse {
	public static void main (String[] args) {
		String[]  faces = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		char[] suits = {'♣', '♦', '♥', '♠'};
		int fullHouseCounts = 0;
		
		for (int i = 0; i <= 12; i++) {
			for (int j = 0; j <= 12; j++) {
				if (i != j) {
					for (int first = 0; first < 4; first++) {
						for (int second = first + 1; second < 4; second++) {
							for (int third = second + 1; third < 4; third++) {
								for (int fourth = 0; fourth < 4; fourth++) {
									for (int fifth = fourth + 1; fifth < 4; fifth++) {
										fullHouseCounts++;
										System.out.println(faces[i] + "" + suits[first] 
													+ "" + faces[i] + "" + suits[second] 
													+ "" + faces[i] + "" + suits[third] 
													+ "" + faces[j] + "" + suits[fourth]
													+ "" + faces[j] + "" + suits[fifth] + " ");
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(fullHouseCounts + " full houses");
	}
}