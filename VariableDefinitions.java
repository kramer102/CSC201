public class VariableDefinitions
{
    public static void main(String[] args)
    {
	System.out.println("Robert Kramer");
	System.out.println("CSC 201 81PR Tues/Thurs");
	System.out.println("");
	
	//Variable Definitions Part A

	short numPeople = 3;          //number of people
	float itemPrice = 32.32F;      //price of an item
	boolean flag = false;         //value of a boolean flag
	char dataChar = 'a';          //character data value
	int classRoomNumber = 207;    //class room number
	float dinnerPrice = 30.0F;     //price of dinner
	long longNumber = 990123456789L;  //a rather long number
	int shorterNumber = 177609;   //not quite as long of a number
	
	//Initializing variables Part B
	int count = 42;
	double total = 34.567;
	char stopKey = 'k';
	boolean stopFlag = false;
	float temperatureReading = 45.4f;
	byte numPets = 3;
	short littleNum = 43;
	long reallyBigNumber = 123433456970L;
	
	//Print a descriptive list of all the variables
	System.out.println("The number of people is "+numPeople);
	System.out.println("The price of an item is " +itemPrice);
	System.out.println("The value of a boolean flag is " +flag);
	System.out.println("The character of a data value is " +dataChar);
	System.out.println("The class room number is " +classRoomNumber);
	System.out.println("The price of dinner is " +dinnerPrice);
	System.out.println("A rather long number " +longNumber);
	System.out.println("not quite as long of a number " +shorterNumber);
	//Part B print out.  I didn't need to do that
	System.out.println("The count is "+count);
	System.out.println("The total is " +total);
	System.out.println("The stop key is " + stopKey);
	System.out.println("The stop flag is " +stopFlag);
	System.out.println("The temperature reading is "+ temperatureReading);
	System.out.println("The number of pets is " + numPets);
	System.out.println("The little number is " +littleNum);
	System.out.println("The really big number is " +reallyBigNumber);
	//Changing the values
	numPeople = 4;          //number of people
	itemPrice = 34.32F;      //price of an item
	flag = true;         //value of a boolean flag
	dataChar = 'b';          //character data value
	classRoomNumber = 245;    //class room number
	dinnerPrice = 30.9F;     //price of dinner
	longNumber = 990444456789L;  //a rather long number
	shorterNumber = 133309;   //not quite as long of a number
	//Printing the changed values
	System.out.println("The number of people is "+numPeople);
	System.out.println("The price of an item is " +itemPrice);
	System.out.println("The value of a boolean flag is " +flag);
	System.out.println("The character of a data value is " +dataChar);
	System.out.println("The class room number is " +classRoomNumber);
	System.out.println("The price of dinner is " +dinnerPrice);
	System.out.println("A rather long number " +longNumber);
	System.out.println("not quite as long of a number " +shorterNumber);
	//THe constants
	final byte MIN_CARS = 1;
	final int PEOPLE = 32;
	final float STANDARD_TEMPERATURE = 69.4F;
	final double PI = 3.1459;
	final short TOO_FEW = 3;
	final long TOO_MANY = 2340987L;
	final char BEST_CHAR = 'Y';
	final boolean TEST_CASE = true;
	//Print out of the constants
	System.out.println("The min cars is "+ MIN_CARS);
	System.out.println("People are " + PEOPLE);
	System.out.println("Standard Temperature Pressure is " + STANDARD_TEMPERATURE);
	System.out.println("Pi is " + PI);
	System.out.println("Too few is " + TOO_FEW);
	System.out.println("Too many is " + TOO_MANY);
	System.out.println("The best char is " +BEST_CHAR);
	System.out.println("The test case is " +TEST_CASE);
	

	
    }
}
