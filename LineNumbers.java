//***************************************************************************
//Robert Kramer
//Version 1
//CSC 201 Spring 2015 81PR
//Programming Project 3
//Line Numbers prompts the user for a text file as input and displays the text 
//with line numbers unless it's a blank line in the source.  Then it
//displays the blank line to maintain the formatting.  It does not return anything.
//***************************************************************************

import java.util.Scanner;  //imports Scanner method for getting user input
import java.io.*;

public class LineNumbers{

  
  
    // This is the private helper method that displays information about the
    // programmer, the course, and the project.
    private static void printHeading(){

        String name = "Robert Kramer";
        System.out.println(name);
        System.out.println("CSC 201 Spring 2015 81PR");
        System.out.println("Programming Project 3");
        System.out.println("Line Numbers");
        System.out.println();
        
        
    }
    
    public static void main (String[] args) throws IOException{
        System.out.println('\n');
        printHeading(); // calls the printHeading method
        //program begins
        //try{               //I was going to use this for error checking left to remind of option
        Scanner input1 = new Scanner(System.in);
        String userTxt = "";
        
        System.out.println("Enter the name of the text file");
        userTxt = input1.next();
        System.out.println();
        File theFile = new File(userTxt);
        while(! theFile.canRead()){                         //My complier didn't recongnise .exist() for some reason
                System.out.println("Check to make sure the pathname is correct and re-enter,"+
                                   " or enter \"stop\" to stop trying and see the error");
                userTxt = input1.next();
                if(userTxt.equals("stop")){
                   break;
                }
                theFile = new File(userTxt);
                System.out.println();
        }
        FileReader inReader = new FileReader(userTxt);
        Scanner inFile = new Scanner(inReader);
        boolean textLeft = inFile.hasNextLine();
        int count = 1;
        String textLine = inFile.nextLine();
        while(textLeft)
                {
                        if(textLine.length() > 0)
                                {
                                        System.out.print(count + ". ");
                                        System.out.println(textLine);
                                        
                                        try{                          //The only way I could not get the Exception to show
                                        textLine = inFile.nextLine();
                                        }
                                        catch(Exception ex){
                                                break;
                                        }
                                        count++;
                                        
                                }        
                        else
                                {
                                        System.out.println(textLine);
                                        try{
                                        textLine = inFile.nextLine();
                                        }
                                        catch(Exception ex){
                                                break;
                                        }
                                }
                }
        System.out.println();
        // }
        
        //catch(Exception p){
        //                System.out.println("Make sure your path is correct and the file is spelled correctly and try again");
                        
                        
    }
      
}



