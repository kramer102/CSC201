import java.util.Scanner;

public class SingleDigitConversion{

        public static void main(String[] args){
                System.out.println("Enter a single digit:");
                Scanner keyIn = new Scanner(System.in);
                String response = ("");  //output
                int input = -1; //initializing the variable
                if(keyIn.hasNextInt()){  //testing if the input is correct
                        input = keyIn.nextInt();
                
                if(input == 0) response = "zero";
                else if (input == 1) response = "one";
                else if (input == 2) response = "two";  
                else if (input == 3) response = "three";
                else if (input == 4) response = "four";
                else if (input == 5) response = "five";
                else if (input == 6) response = "six";
                else if (input == 7) response = "seven";
                else if (input == 8) response = "eight";
                else if (input == 9) response = "one";
                else  response = "That's not a single digit";

                System.out.printf("The number %d is %s.  \n", input, response);
                }
                else
                        System.out.println("The input is incorrect");
        }
}
