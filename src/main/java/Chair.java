 /**
  * The chair class creates a chair based on its legs and material
  * @author Hailey Tam 
  */

 class Chair {
    private int legs;
    private String material;

    /**
     * Constructor 1: Handles both legs and material
     * @param legs a integer that stores the initial state of how many legs the chair has
     * @param material a String that stores the intital state of what material the chair is made of
     */

    public Chair(int legs, String material){
        this.legs = legs;
        this.material = material;
    }

    /**
     * Constructor 2: Handles only legs
     * @param legs a integer that stores the initial state of how many legs the chair has
     * Material is set to wood by default
     */

    public Chair(int legs){
        this(legs,"wood");
    }

    /**
     * Constructor 3: Does not handle any parameters
     * Legs are set to 4 by default
     * Material is set to wood by default
     */
    
    public Chair(){
        this(4, "wood");
    }

    /**
     * 
     * @return returns the value of how many legs the chair has
     */

    public int getLegs(){
        return this.legs;
    }

    /**
     * 
     * @return returns what material the chair is made of
     */

    public String getMaterial(){
        return this.material;
    }
}
