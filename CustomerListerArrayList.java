/**
   Lab 8 Arrays Robert Kramer cs 201 pr81
*/


import java.io.*;
import java.util.*;

public class CustomerListerArrayList {

        public static void main(String[] args){
                ArrayList<String> customerName = new ArrayList<String>();
                //System.out.println(customerName.length);
                customerName.add("Chris");
                customerName.add("Lois");
                customerName.add("Meg");
                customerName.add("Peter");
                customerName.add("Stewie");
                for (String element : customerName){
                        System.out.println(element);
                }
                System.out.println();
                customerName.add(3,"Brian");
                customerName.add(2,"Meg");
                for (String element : customerName){
                        System.out.println(element);
                }
                System.out.println();
                for (int i = 0; i < customerName.size(); i++){
                        if(customerName.get(i).equals("Meg")){
                                customerName.remove(i);
                                i = i-1;//fixes the skip index problem
                }
                }
                for (String element : customerName){
                        System.out.println(element);
                }
        }
}
                
                                
