/**
   Lab 7 Methods Robert Kramer cs 201 pr81
*/




import java.io.*;
import java.util.Scanner;

public class MethodLab {
  
   public static void main(String[] args) {
     // variable declarations for part 1
     String title;
     String firstName;
     String lastName;
     Scanner in = new Scanner(System.in);
     // prompt for input for part 1
     System.out.print("Enter a title:");
     title = in.next();
     System.out.print("Enter your first name:");
     firstName = in.next();     
     System.out.print("Enter a your last name:");
     lastName = in.next();
     // call the method for part 1
     greeting(title, firstName, lastName);
     
     // variable declarations for part 2
     int number1;
     int number2;
     // user prompts for part 2
     System.out.print("Enter first number:");
     number1 = in.nextInt();
     System.out.print("Enter second number:");
     number2 = in.nextInt();
     // call the method for part 2 inside the println statement
     System.out.println("The largest number is " + max(number1, number2));
 }



        public static void greeting(String title, String firstName, String lastName)
        {
                System.out.println("\nDear "+title+" "+firstName+" "+lastName+",\n");
        } 
        public static int max(int num1, int num2)
        {
                if( num1 < num2 )
                        return num2;
                return num1;
        }
      

}
