/**
 * This class represents a popcorn farm
 * 
 * @author Debra Duke
 * @version 10/24/2012
 */
public class Farm
{
    // instance variables 
    private String  name;   // this farm's name
    private double acres;   // the number of acres planted by this farm
    private int pints;      // the number of pints of corn produced by this farm

    /**
     * Default Constructor for objects of class Farm
     */
    public Farm() {
        // initialize instance variables
        name = "";
        acres = 1.0;
        pints = 0;
    }
    
    /**
     * Parameterized Constructor for objects of class Farm
     * 
     * @param  aName   the name of the Farm
     * @param  numAcres   the number of acres for this Farm
     * @param  numPints   the number of pints of popcorn produced by
     *                    this Farm
     */
    public Farm(String aName, double numAcres, int numPints)  {
       // initialise instance variables
      setName(aName);
      setAcres(numAcres);
      setPints(numPints);
    }

    /**
     * Accessor method for this Farm's name
     * 
     * @return     name 
     */
    public String getName() {
        return name;
    }
    
      /**
     * Accessor method for acres
     * 
     * @return     acres 
     */
    public double getAcres() {
        return acres;
    }
    
      /**
     * Accessor method for pints
     * 
     * @return     pints 
     */
    public int getPints() {
        return pints;
    }
    
     /**
     * Mutator method for name
     * 
     * @param  aName   the name of the Farm
     * @throws IllegalArgumentException for null parameters
     */
    public void setName(String aName) {
        if(aName != null)
          name = aName;  
        else 
          throw new IllegalArgumentException("Farm name cannot be null");
    }
    
    /**
     * Mutator method for acres
     * 
     * @param  numAcres   the number of acres for this Farm
     * @throws IllegalArgumentException for parameters 
     *         less than or equal to zero
     */
    public void setAcres(double numAcres) {
        if (numAcres > 0) acres = numAcres;
        else 
          throw new IllegalArgumentException("Acres must be greater than 0.");
    }
    
    /**
     * Mutator method for pints
     * 
     * @param  numPints   the number of pints of popcorn produced by
     *                    this <strong>Farm</strong>
     * @throws IllegalArgumentException for parameters greater than zero
     */
    public void setPints(int numPints) {
        if (numPints >= 0) pints = numPints; 
        else
          throw new IllegalArgumentException("Pints cannot be negative.");
    }
    
    /**
     * Calculates the production for this farm in pints of corn per acre
     *
     * @return     number of pints per acre
     */
    public double calculateProduction() {
        return pints/acres;
    }
    
    /**
     * Overrides the toString in Object to provide information about this farm
     *
     * @return     a string representation of the instance variables
     */
    public String toString() {
        String result = "Farm Name:  " + name + "\n";
        result += "Number of acres planted:  " + acres + "\n";
        result += "Number of pints of corn produced:  " + pints + "\n";
        return result;
    }

    /**
     * Creates a formatted String representation of this Farm's 
     * name and it's production suitable for display as a bar
     * chart 
     *
     * @return     a formatted String
     */
    public String toDisplayString() {
        String result = name;
        
        //add spaces for a total length of 29 characters
        for(int i = name.length(); i < 30; i++){
            result += " ";
        }
        
        //add stars based on production
        int numStars = (int)calculateProduction()/25;
        int j = 1; 
        while(j <= numStars || j <= 20){
            if(j != 20){
                if(j <= numStars)
                    result += '*';
                else
                    result += " ";
            }
            else{
                if(j <= numStars)
                    result += '#';
                else
                    result += '|';
            }
            j++;
        }
        return result;
    }
}
