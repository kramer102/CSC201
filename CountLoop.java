/**
   A simple program that computes the arithmetic sum of a range of numbers
*/

import java.util.Scanner;

public class CountLoop
{
        public static void main(String[] args){
                System.out.println('\n');
                System.out.println("Enter the positive integer to add to \n");
                Scanner input = new Scanner(System.in);
                int numberToAddTo = 0;
                int total = 0;
                int i = 0;
                numberToAddTo = input.nextInt();
                for(i = 0; i <= numberToAddTo; i++)
                        {
                                total = i + total;
                        }
                System.out.println("The total is " + total + ".");
                i = 0;
                total = 0;
                while (i <= numberToAddTo)
                         {
                                 total = i + total;
                                 i++;
                         }
                 System.out.println("The while loop total is " + total + ".");
               i = 0;
               total = 0;
               do {
                       total = i + total;
                       i++;
               }
                while (i <= numberToAddTo);
                System.out.println("The total do-while calculation is " + total + ".");




        }
}
                              
                
