//***************************************************************************
//Robert Kramer
//Version 1
//CSC 201 Spring 2015 81PR
//Programming Project 5
//MatchUp takes in the name of a file as a command line argument and numbers 
//each set of brackets while labling unmatched brackets with a zero
//***********************************************************

import java.util.Scanner;  //imports Scanner method for getting user input
import java.io.*;

public class MatchUp{

  
  
    // This is the private helper method that displays information about the
    // programmer, the course, and the project.
    private static void printHeading(){

        String name = "Robert Kramer";
        System.out.println(name);
        System.out.println("CSC 201 Spring 2015 81PR");
        System.out.println("Programming Project 5");
        System.out.println("Match Up");
        System.out.println();
        
        
    }
    
    public static void main (String[] args) throws IOException{
        System.out.println('\n');
        printHeading(); 
        String fileName = checkArgs(args);
        FileReader inReader = new FileReader(fileName);
        Scanner inFile = new Scanner(inReader);
        String inLine = "";
        String outLine = "";
        int braceCount = 0;
        char ch;
        while(inFile.hasNextLine()){
                inLine = inFile.nextLine();
                //System.out.println(inLine);
                Scanner s = new Scanner(inLine);
                for(int i=0;i<inLine.length();i++){
                        ch = inLine.charAt(i);
                        
                        if(ch == ('{')){
                                braceCount ++;
                                outLine = outLine + ch + braceCount;
                        }
                        else if(ch == ('}') && braceCount == 0){
                                outLine = outLine + ch + braceCount;
                        }
                        else if(ch == ('}') && braceCount > 0){
                                outLine = outLine + ch + braceCount;
                                braceCount --;
                        }
                        
                        else{ outLine = outLine + ch;}
                }
                
                //System.out.println();       
                                        

                System.out.println(outLine);
                outLine = "";

        }
        
      
    }       
    



        //METHODS USED BELOW********************************************************************************************************************
        

        // This method checks to make sure there is one entry in the command line input array args
        //If there is a string in position 0 it returns it as the potential filename
        private static String checkArgs(String[] args){
                
                int argsLength = args.length;
                if(argsLength == 0)
                      return  getValidFilename();
                String userTxt = args[0];
                File theFile = new File(userTxt);
                Scanner input1 = new Scanner(System.in);
                 while(! theFile.canRead()){                         
                        System.out.println("Check to make sure the pathname is correct and re-enter,"+
                                           " or enter \"stop\" to stop trying");
                        userTxt = input1.next();
                        if(userTxt.equals("stop")){
                                break;
                        }
                         theFile = new File(userTxt);
                         //System.out.println();
                }
                 input1.close();
                 return userTxt;
        }


        // this method prompts the user and returns the string of a valid
        //file name,  Will not get the name if the text file is stop
        private static String getValidFilename(){
                Scanner input1 = new Scanner(System.in);
                String userTxt = "";
                System.out.println("The command line input was in the incorrect format.  Please enter the filename");
                userTxt = input1.next();
                System.out.println();
                File theFile = new File(userTxt);
                while(! theFile.canRead()){                         
                        System.out.println("Check to make sure the pathname is correct and re-enter,"+
                                           " or enter \"stop\" to stop trying and see the error");
                        userTxt = input1.next();
                        if(userTxt.equals("stop")){
                                break;
                        }
                         theFile = new File(userTxt);
                         System.out.println();
                }
                return userTxt;
        }
        //END METHOD***************************************

       

        

                
      
        
}
    



