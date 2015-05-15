//***************************************************************************
//Robert Kramer
//Version 1
//CSC 201 Spring 2015 81PR
//Lab 3 
//
//***************************************************************************

public class MathExpressions1 {

 public static void main(String[] args) {
         final int NUM = 14;
         final int DEM = 5;
         System.out.println(NUM +" / " + DEM + " using integer division equals " + NUM/DEM );
         System.out.println(NUM + " / " + DEM + " using floating-point division equals "
                            + ((float)NUM)/(DEM));
         System.out.println(NUM + " modulo " + DEM + " equals " + NUM%DEM);
 }
}
