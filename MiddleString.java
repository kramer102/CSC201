//Robert Kramer
//Lab 5
// CSC 201
//test first word is middle
//     it's between the second and third
//     it's between the third and second
//test second word is middle
//     first > second >third
//     first < second < third 
//test thrid word is middle
//     first< third< second
//     first>third>second
//test the first and second repeat
//test the second and third repeat
// test the first and thrid repeat
//test all three repeat

import java.util.Scanner;

public class MiddleString{


        public static void main(String[] args)
        {
                Scanner input = new Scanner(System.in);

                System.out.println("Enter the first word");
                String firstWord = input.next();
                System.out.println("Enter the second word");
                String secondWord = input.next();
				System.out.println("Enter the third word");
                String thirdWord = input.next();
                if (firstWord.compareTo(secondWord) <= 0 && firstWord.compareTo(thirdWord)>0 || 
					firstWord.compareTo(secondWord) >= 0 && firstWord.compareTo(thirdWord)<0 )
                        {
                                System.out.println(firstWord);
                        }
                else if (secondWord.compareTo(thirdWord) < 0 &&
						  secondWord.compareTo(firstWord) > 0 || 
						 secondWord.compareTo(firstWord) < 0 &&
						 secondWord.compareTo(thirdWord) > 0)
					System.out.println(secondWord);
				else
					System.out.println(thirdWord);
		    

                





        }
}
