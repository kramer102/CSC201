//***************************************************************************
//Robert Kramer
//Version 1
//CSC 201 Spring 2015 81PR
//Programming Project 1 
//Name Art:  A program that displays my name in characters or ascii art
//***************************************************************************

public class NameArt{

 // This is the private helper method that displays information about the
 // programmer, the course, and the project.
        private static void printHeading(){

  String name = "Robert Kramer";
  System.out.println(name);
  System.out.println("CSC 201 Spring 2015 81PR");
  System.out.println("Programming Project 1");
  System.out.println("Name Art");
  System.out.println();
  

 }

 // This is the method that displays my name.  I wrote it like this before
 // you said to include it in main.  Hope it's okay      
        private static void printNameArt(){

     System.out.println(" __      __    __    _____  __    _________      |  ");
     System.out.println("|  \\    /  \\  |  \\  |      |  \\       |          |  ");
     System.out.println("|   \\  |    | | _/  |      |   \\      |          |  ");
     System.out.println("|___|  |    | |  \\  |_____ |___|      |          |  ");  
     System.out.println("|   \\  |    | |   \\ |      |   \\      |             ");
     System.out.println("|    \\  \\__/  |___/ |_____ |    \\     |          *  ");       
       
}

    public static void main (String[] args){
            System.out.println('\n');
            printHeading(); // this statement calls the printHeading method
            printNameArt(); // this statement calls the printNameArt method
  

 }
}
