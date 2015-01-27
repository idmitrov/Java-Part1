package BitRotation;

import java.util.Scanner;

public class BitRotation_Broken {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

        byte number = Byte.parseByte(input.nextLine());
        byte rotations = Byte.parseByte(input.nextLine());

        for (int i = 0; i < rotations; i++) {
            String direction = input.nextLine();
            //Changed == "right/left" to .equals("R/L");
            if (direction.equals("right")) {
                int rightMostBit = number & 1;
                number >>= 1;
                number |= rightMostBit << 5;//Changed from number << 6 to number << 5
            } else if (direction.equals("left")) {
            	int leftMostBit = (number >> 5) & 1;//Changed from number >> 6 to number >> 5
            	 number = (byte) (number << 1);//Added cast
            	if (leftMostBit == 1) { //AFTER << TO THE LEFT WITH 1, IF LEFT MOST IS 1,THEN THE MOVED LEFT MOST BIT WILL BECOME 1 BUT MUST TO BE 0
            		number ^= 64; //XOR WILL REMOVE THE MOVED TO THE LEFT << LEFT MOST BIT IF ITS 1 (WILL CHANGE IT TO 0)
            	}
                number |= leftMostBit;
            }
        }
        System.out.println(number);
    }
}
