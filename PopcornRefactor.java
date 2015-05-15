//***************************************************************************
//Robert Kramer
//Version 1
//CSC 201 Spring 2015 81PR
//Programming Project 4
//Popcorn takes in a text file as input that contains a series of data sets,
//one per line, with each set representing the production for one farm.  The 
//output is a bar chart that identifies each farm and displays it's production
//in pints of corn per acre.
//***********************************************************

import java.util.Scanner;  //imports Scanner method for getting user input
import java.io.*;

public class PopcornRefactor{

  
  
    // This is the private helper method that displays information about the
    // programmer, the course, and the project.
    private static void printHeading(){

        String name = "Robert Kramer";
        System.out.println(name);
        System.out.println("CSC 201 Spring 2015 81PR");
        System.out.println("Programming Project 4");
        System.out.println("Popcorn");
        System.out.println();
        
        
    }
    
    public static void main (String[] args) throws IOException{
        System.out.println('\n');
        printHeading(); 
        String fileName = getValidFilename();
        printGraphHead();
        
        FileReader inReader = new FileReader(fileName);
        Scanner inFile = new Scanner(inReader);
        boolean textLeft = inFile.hasNext(); // break condition for While loop
        
        String nextLine = "";
        String badLine = "";
        boolean validLine = false;
       
        int badLineCount = 0;
        while(textLeft){
                try {nextLine = inFile.nextLine();}
                catch(Exception ex){break;}
                
                validLine = lineValidate(nextLine);
                
                if(validLine)
                        parseAndPrint(nextLine);
                else{       
                        if(! nextLine.equals("")){  //negates the empty lines
                                badLine = badLine + nextLine+"\n";
                                badLineCount++;
                        } 
                }
        }
        if(badLineCount > 0)  
                System.out.println("\nSorry following input is invalid:\n"+ badLine);
        System.out.println();
    }       
    



        //METHODS USED BELOW********************************************************************************************************************


        // this method prompts the user and returns the string of a valid
        //file name,  Will not get the name if the text file is stop
        private static String getValidFilename(){
                Scanner input1 = new Scanner(System.in);
                String userTxt = "";
                System.out.println("Enter the name of the text file containing the Popcorn Co-Op information:");
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

        //This method prints the graph heading banner
        private static void printGraphHead(){
                System.out.println();
                System.out.printf("%35s","Popcorn Co-op"+"\n\n");
                System.out.printf("%53s","Production in Hundreds"+"\n");
                System.out.printf("%52s","of Pint Jars per Acre" +"\n");
                System.out.printf("%-33s","Farm Name");
                System.out.print("1   2   3   4   5   6\n");
                System.out.printf("%55s","---|---|---|---|---|---|"+"\n");
        }
        //END METHOD***************************************

        //This method takes in a line as a string from the file
        //it then validates the line is in the correct form
        //it returns true if valid "<name>, <double acres> <int jars>"
        private static boolean lineValidate(String nextLine){
                StringReader inReader = new StringReader(nextLine);
                Scanner in = new Scanner(inReader);
                boolean madeIt = false;
                while(in.hasNext()){
                        if(in.hasNext(".*,")){                                
                                in.next();
                                
                                if(in.hasNextDouble()){                                        
                                        in.next();
                                        if(in.hasNextInt()){                                                
                                                try{ in.next();}
                                                catch(Exception ex){
                                                        }
                                                madeIt = true;
                                                if(in.hasNext())
                                                        return false;
                                        }
                                        else
                                                return false;
                                }
                                else
                                        return false;
                        }
                        try{ in.next();}
                        catch(Exception ex){
                                break;
                                        }
                }
                if(madeIt)
                        return true;
                return false;
        }
                        
        //END METHOD***************************************

                
        //This method parses a valid String line then prints the correct
        //output.  It takes in the nextLine as a string and returns nothing
        //refactoring part to use Farm class
        private static void parseAndPrint(String nextLine){
                int commaIndex = nextLine.indexOf(',');
                String farmName = nextLine.substring(0,commaIndex);
                String restOfLine = nextLine.substring(commaIndex +1);
                Scanner in = new Scanner(new StringReader(restOfLine));
                double acres = in.nextDouble();
                int jars = in.nextInt();
                Farm aFarm = new Farm(farmName, acres, jars);
                System.out.println(aFarm.toDisplayString());
                //double jarsPerAcre = Math.round(jars/acres);
                //int intJarsPerAcre = (int) jarsPerAcre;
                //System.out.printf("%-30s", farmName);
                //System.out.print(printStars(intJarsPerAcre)+"\n");
                
        }
        //END METHOD***************************************

        //This method takes in the integer jars per acre and
        //returns a string with the correct stars for the graph
        private static String printStars(int jarsPerAcre){
                String graphLine = "";
                int count = 0;
                if(jarsPerAcre > 399){
                        while(jarsPerAcre > 0){
                                count++;
                                if(count == 16)
                                        graphLine += "#";
                                else 
                                        graphLine += "*";
                                jarsPerAcre -= 25;
                        }
                }
                else{
                        while(jarsPerAcre > 25){
                                graphLine += "*";
                                jarsPerAcre -= 25;

                        }
                        while(graphLine.length() < 15){
                                graphLine += " ";
                                
                        }
                        graphLine += "|";
                        
                }
                return graphLine;
        }
        //END METHOD***************************************
        
}
    



