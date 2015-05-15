/**
   Lab 8 Arrays Robert Kramer cs 201 pr81
*/


import java.io.*;
import java.util.Scanner;

public class CustomerListerArray {

        public static void main(String[] args){
                String customerName[] = new String[7];
                //System.out.println(customerName.length);
                customerName[0] = "Chris";
                customerName[1] = "Lois";
                customerName[2] = "Meg";
                customerName[3] = "Peter";
                customerName[4] = "Stewie";
                for (String element : customerName){
                        System.out.println(element);
                }
                System.out.println();
                customerName[6] = customerName[4];
                customerName[5] = customerName[3];
                customerName[3] = "Meg";
                customerName[4] = "Brian";
                for (String element : customerName){
                        System.out.println(element);
                }
                System.out.println();
                for (int i = 0; i < customerName.length; i++){
                        if(customerName[i].equals("Meg")){
                                        customerName[i] = null;
                                        if(i != customerName.length-1){
                                                for (int j = i; j <customerName.length-1; j++){
                                                        customerName[j] = customerName[j+1];
                                                }
                                        }
                                        customerName[customerName.length-1] = "";
                                        i= i-1;//fixes the double "Meg" problem, but may break at index 0
                       
                        }
                }
                for (String element : customerName){
                        System.out.println(element);
                }
        }
}
                
                                
