//Test 3 study program to practice before the test() 

import java.util.*;
import java.io.*;

public class Test3Study{
        
        public static void main(String[] args) throws IOException{
                int[] num = new int[10];
                ArrayList<Integer> numList = new ArrayList<Integer>();
                for(int element : num){
                        System.out.println(element);
                }
                System.out.println("\n");
                String[] customerName = new String[7];
                int numFilled = 0;
                String[] nameStart = {"Chris",
                                      "Lois",
                                      "fred"};
                for(String element : nameStart){
                        customerName[numFilled] = element;
                        numFilled ++;
                }
                for(int i = 0;i<numFilled;i++){
                        System.out.print(customerName[i]+" ");
                        //System.out.print("asd ");
                }
                System.out.println();

                //Filling an Array
                int[] values = new int[11];
                for(int i =0;i<values.length;i++){
                        values[i]=i*i;
                }
                for(int element:values){
                        System.out.print(element+" ");}
                System.out.println();


                //largest number in a 3x4
                int rows = 2;
                int columns = 2;
                int[][] nums = new int[rows][columns];
                int largest = nums[0][0];
                nums[0][0] = 10;
                nums[1][1] = 20;
                //for(int row:nums)
                
                        
                for(int i=0;i<rows;i++){
                        for(int j=0;j<columns;j++){
                                if( nums[i][j] > largest){
                                        largest = nums[i][j];}
                        }
                }
                System.out.println(largest);
        }


        //methods
        //private static void printArray(
}
