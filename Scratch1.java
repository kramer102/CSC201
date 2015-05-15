// A file to play with the code
import java.util.regex.Pattern;
import java.util.*;

import java.io.*;

public class Scratch1{

        public static void main (String[] args) throws IOException{
                FileReader inReader = new FileReader("Tester.java");
                Scanner inFile = new Scanner(inReader);
                String nextLine;
                String outLine = "";
                char ch;
                while(inFile.hasNextInt()){
                        nextLine = inFile.nextLine();
                        System.out.println(nextLine);
                        for(int i = 0;i<nextLine.length();i++){
                                ch = nextLine.charAt(i);
                                outLine = outLine + ch;
                                
                        }
                        System.out.println(outLine);
                        outLine = "";
                }

                        
        
        }
}
        
