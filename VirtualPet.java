public class VirtualPet
{
  /* enter code for instance variables, constructor
     getName and toString methods
  **/
 private int energy, happiness, weight, ageInYears, months;
 private String name;

private static final int MINIMUM_WEIGHT = 5;
private static final int MAXIMUM_LEVEL = 10;

 public VirtualPet(String petName)
  {
    name = petName;
    energy = 0;
    happiness = 0;
    weight = MINIMUM_WEIGHT;
    months = 0; 
    ageInYears = 0;
  }
    
  // Accessor Method   
  public String getName()
  {
    return name;
  }
     

  
  public String toString()
  {
    return name + "'s Information:\nEnergy: " + energy + "\nHappiness: " 
                    + happiness + "\nWeight: " + weight + " g\nAge: " 
                    + months + " months and " + ageInYears + " years";    
  }
}
















}