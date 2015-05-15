//Robert Kramer
//Lab 5
// CSC 201

import java.util.Scanner;

public class PrintStrings{


        public static void main(String[] args)
        {
                Scanner input = new Scanner(System.in);

                System.out.println("Enter the first word");
                String firstWord = input.next();
                System.out.println("Enter the second word");
                String secondWord = input.next();
                if (firstWord.compareTo(secondWord) < 0)
                        {
                                System.out.println(firstWord + " " + secondWord);
                        }
                else
                        System.out.println(secondWord + " " + firstWord);

                





        }
}
