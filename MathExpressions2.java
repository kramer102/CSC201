import java.util.Scanner;

public class MathExpressions2 {

      
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int tempInC = -100;
                double tempInF = -100;
                System.out.println("Enter the temperature in Celsius");
                tempInC  = in.nextInt();
                tempInF = 5.0/9 + tempInC + 32;
                System.out.printf("The temperature in Celsius is %d. The temperature in Fahrenheit is %f. \n ", tempInC, tempInF);

                        
                
                

                        
        }
}
