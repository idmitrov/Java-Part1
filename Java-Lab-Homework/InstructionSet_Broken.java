package InstructionSet;

import java.util.Scanner;

public class InstructionSet_Broken {
    
    public static void main(String[] args) {
        @SuppressWarnings("resource") //IGNORE THE WARNING
		Scanner input = new Scanner(System.in);
        String opCode = "";
        
        while (!opCode.equals("END")) {
        	
        	opCode = input.nextLine();//FIX INF LOOP
            String[] codeArgs = opCode.split(" ");
            long result = 0;
            
            switch (codeArgs[0]) {
                case "INC": {
                    int operandOne = Integer.parseInt(codeArgs[1]);
                    result = (long)operandOne + 1; //FIX THE OPERATION BY PRINTING THE RESULT + 1
                    System.out.println(result);
                    break;
                }
                case "DEC": {
                    int operandOne = Integer.parseInt(codeArgs[1]);
                    result = (long)operandOne - 1; //FIX THE OPERATION BY PRINTING THE RESULT - 1
                    System.out.println(result);
                    break;
                }
                case "ADD": {
                    int operandOne  = Integer.parseInt(codeArgs[1]);
                    int operandTwo = Integer.parseInt(codeArgs[2]);
                    result = (long)operandOne + operandTwo;
                    System.out.println(result);
                    break;
                }
                case "MLA": {
                    int operandOne  = Integer.parseInt(codeArgs[1]);
                    int operandTwo = Integer.parseInt(codeArgs[2]);
                    result = ((long)operandOne * (long)operandTwo);
                    System.out.println(result);
                    break;
                }
                default:
                    break;
            }
        }
    }
}
