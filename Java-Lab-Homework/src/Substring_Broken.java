package Substring;

import java.util.Scanner;

public class Substring_Broken {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        
        String text = input.nextLine();
        int jump = Integer.parseInt(input.nextLine());
        //char search = 'ð'; REMOVED
        boolean hasMatch = false;

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == 'p') { // 'p' REPLACE search which has REMOVED
                hasMatch = true;

                int endIndex = jump + i; //Changed from int endIndex = jump; (Added + i)

                if (endIndex > text.length()) {
                    endIndex = text.length();
                }
                else if (endIndex + 1 < text.length()) { //Added to check if end index is not bigger than text length
                	endIndex++;
                }
                
                String matchedString = text.substring(i, endIndex);
                System.out.println(matchedString);
                i += jump;
            }
        }

        if (!hasMatch) {
            System.out.println("no");
        }
    }
}
