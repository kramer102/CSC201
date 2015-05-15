//***************************************************************************
//Robert Kramer
//Version 1
//CSC 201 Spring 2015 81PR
//Programming Project 6
//An abstract class for circles
//
//***********************************************************
/**
 * A class to represent a circle 
 */

public class Circle {
        private double radius; //instance variable defining a circle
        
        /**
         *default constructor sets radius to 1
         */
        public Circle(){
                radius = 1;
        }
        /**
         *Parameterized constructor for a Circle 
         *@param aRadius radius
         */
        public Circle(double aRadius){
                setRadius(aRadius);
        }
        //accessor methods
        /**
         *Returns the radius of this Circle
         *@return double
         */
        public double getRadius(){
                return radius;
        }
        /**
         *Returns the diameter of this Circle
         *@return double
         */
        public double getDiameter(){
                double diameter = 2*radius;
                return diameter;
        }
         /**
         *Returns the circumference of this Circle
         *@return double
         */
        public double getCircumference(){
                double circumference = 2*Math.PI*radius;
                return circumference;
        }
         /**
         *Returns the area of this Circle
         *@return double
         */
        public double getArea(){
                double area = Math.PI*Math.pow(radius,2);
                return area;
        }
        
        //mutator methods
         /**
          * Sets the month of the SimpleDate
          * @param aRadius a Circle radius
          * @throws IllegalArgumentException invalid radius arguments
          */
        public void setRadius(double aRadius){
                if(aRadius<0){
                        throw new IllegalArgumentException("Invalid radius");
                }
                radius = aRadius;
        }
        /** 
         * @return The radius information for this Circle
         */
        public String toString(){
                String output;
                output = "\nCircle with radius: " + radius;
                return output;
        }

       
        
    

}


