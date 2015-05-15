
public class Expressions 
{
  public static void main(String[] args)
  {
    int a = 3;
    int b = 4;
    int c = 5;
    int d = 17;
    final int RIGHT = 4;
    RIGHT = 10;
    
    System.out.println((a + b) / c);   
// 3 and 4 are added with sum 7       
// 7 is divided by 5 with quotient 1 
    
    System.out.println(a + b / c);       
// 4 is divided by 5 with quotient 0       
// 3 is added to 0 with sum 3
    
    System.out.println(a++);
    // prints a (3) and assigns a = a+1     
    System.out.println(a--);
    // prints a (4) and assigns a = a-1 or a = 3       
    System.out.println(a + 1);
    // prints the sum of a and 1 or 4        
    System.out.println(d % c);
    // prints the remainder of d/c --> 2       
    System.out.println(d / c);
    // prints the result of integer div 17/5 --> 3       
    System.out.println(d % b);
    // prints the result of 17 mod 4 --> 1
    System.out.println(d / b);
    // prints the result of int div 17 / 4 --> 4       
    System.out.println(d + a / d + b);
    // prints the sum of d and a/d and b
    //17+0+4 --> 21
    System.out.println((d + a) / (d + b));
    // (17 + 3) / (17 +4) = 20/21 = 0       
    System.out.println(Math.sqrt(b));
    //prints the square root of b --> 2.0
    //returns a double
    System.out.println(Math.pow(a, b));
    //raises 3 to the power of 4 -->9^2-->81.0
    //returns a double
    System.out.println(Math.abs(-a));
    // prints the absolute value of -3 -->3
    System.out.println(Math.max(a, b));    
    //prints the biggest number between a and b -->4
  } 
} 
