/**
   Makes a triangle with * using nested loops
*/

public class NestedLoopTriangle
{
        public static void main(String[] args)
        {
                for(int numLines = 1;numLines <=10;numLines++)
                        {
                                int numStars = 0;
                                int numSpaces = 10;
                                while(numSpaces > numLines)
                                        {
                                                System.out.print(' ');
                                                numSpaces--;
                                        }
                                while(numStars < numLines *2-1)
                                        {
                                                System.out.print("*");
                                                numStars++;
                                        }
                                System.out.println("");
                        }
        }
}
