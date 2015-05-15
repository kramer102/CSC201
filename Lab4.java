

//***************************************************************************
//Robert Kramer
//Version 1
//CSC 201 Spring 2015 81PR
//Lab 4 
//Algorithm
 //You should print out the prompt
//read in the character and check to make sure
//it's an Uppercase char
//use conditional control to check to see which number cooresponds with the char
//println the results
//***************************************************************************

import java.util.Scanner;


public class Lab4 {

        public static void main(String[] args) {
                String str;
                int argsLength = args.length;
                if(argsLength == 0){
                Scanner input = new Scanner(System.in);
                System.out.println("Enter a single str, and I will tell you what \nthe corresponding digit is on the telephone:");
                str = input.next();
                }
                else {str = args[0];}
                char letter = str.charAt(0);
                int strNum = 99;
                if (!Character.isUpperCase(letter))
                        {
                                System.out.print("The str is not upper case.");
                                System.exit(0);
                        }
                
                if(str.equals("A") || str.equals("B") || str.equals("C"))
                   strNum = 2;
                   else if(str.equals("D") || str.equals("E") || str.equals("F"))
                   strNum = 3;
                   else if(str.equals("G") || str.equals("H") || str.equals("I"))
                   strNum = 4;
                   else if(str.equals("J") || str.equals("K") || str.equals("L"))
                   strNum = 5;
                   else if(str.equals("M") || str.equals("N") || str.equals("O"))
                   strNum = 6;
                   else if(str.equals("P") || str.equals("Q") || str.equals("R") || str.equals("S"))
                   strNum = 7;
                   else if(str.equals("T") || str.equals("U") || str.equals("V"))
                   strNum = 8;
                   else if (str.equals("X") || str.equals("Y") || str.equals("Z") || str.equals("W"))
                   strNum = 9;
                System.out.println("The digit "+ strNum + " corresponds to the letter "+ str + " on the telephone."); 
                
        
 }
}
