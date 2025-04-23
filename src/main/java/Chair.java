 /**
  * The chair class creates a chair based on its legs and material
  * @author Hailey Tam 
  */

 class Chair {
    private int legs;
    private String material;

    /**
     * Constructor 1: creates a chair with a specific material and number of legs
     * @param legs a integer that represent how many legs the chair has
     * @param material a String represents the material the chair is made of
     */

    public Chair(int legs, String material){
        this.legs = legs;
        this.material = material;
    }

    /**
     * Constructor 2: creates a chair with a specific number of legs
     * @param legs a integer that represents how many legs the chair has
     * Material is set to wood by default
     */

    public Chair(int legs){
        this(legs,"wood");
    }

    /**
     * Constructor 3: does not specific the number of legs and material of the chair
     * Legs are set to 4 by default
     * Material is set to wood by default
     */
    
    public Chair(){
        this(4, "wood");
    }

    /**
     * Gets the number of legs the chair has
     * @return returns the value of how many legs the chair has as a doube
     */

    public int getLegs(){
        return this.legs;
    }

    /**
     * Gets the material of the chair
     * @return returns what material the chair is made of as a string
     */

    public String getMaterial(){
        return this.material;
    }
}
