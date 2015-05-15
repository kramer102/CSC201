//***************************************************************************
//Robert Kramer
//Version 1
//CSC 201 Spring 2015 81PR
//Programming Project 2
//Circle Operarions or Selection is a program that takes in the radius of a circle and
//prints the Diameter, Circumference, or Area of the circle based on inputs.
//The inputs are the radius in floating point form and what type of calculation 
//to perform.  It doesn't return anything, but does print the corresponding
//calculation.
//***************************************************************************

import java.util.Scanner;  //imports Scanner method for getting user input

public class CircleOperations{

  
  
    // This is the private helper method that displays information about the
    // programmer, the course, and the project.
    private static void printHeading(){

        String name = "Robert Kramer";
        System.out.println(name);
        System.out.println("CSC 201 Spring 2015 81PR");
        System.out.println("Programming Project 2");
        System.out.println("Circle Operations or Selection");
        System.out.println();
        
        
    }
    
    public static void main (String[] args){
        System.out.println('\n');
        printHeading(); // calls the printHeading method
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        double radius = 0;
        System.out.println("Enter the radius in floating point form");
        if (input1.hasNextDouble())                                           //validates input
            radius = input1.nextDouble();
        else
            {
                System.out.println("The input is not in floating point form");
                System.exit(0);
            }
        

        System.out.println("To calculate Diameter, Circumference, or Area, enter D, C, or A");
        String userOperation = input2.next();
        
       
        if (userOperation.equals("D"))
            {
                double diameter = 2* radius;
                System.out.printf("The diameter of a circle with radius %.2f is %.2f \n",radius, diameter);
            }
        else if (userOperation.equals("C"))
            {
                double circumference = 2*Math.PI*radius;
                System.out.printf("The circumference of a circle with radius %.2f is %.2f \n",radius, circumference);
            }
        else if (userOperation.equals("A"))
            {
                double area = Math.PI*Math.pow(radius,2);
                System.out.printf("The area of a circle with radius %.2f is %.2f \n",radius, area);
            }
        else
            System.out.println("The input was incorrect");
        
    }
}


