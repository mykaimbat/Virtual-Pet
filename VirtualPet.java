public class VirtualPet
{
  private int energy;
  private int happiness; 
  private int weight; 
  private int ageInYears;
  private int months;
  private String name;

  private static final int MINIMUM_WEIGHT = 5;

  public VirtualPet(String petName)
  {
    name = petName;
    energy = 0;
    happiness = 0;
    weight = MINIMUM_WEIGHT;
    months = 0; 
    ageInYears = 0;
  }
    
  public String getName()
  {
    return name;
  }
     
  public String toString()
  {
    return name + "'s Information:\nEnergy: " + energy + "\nHappiness: " 
           + happiness + "\nWeight: " + weight + "g\nAge: " 
           + months + " months and " + ageInYears + " years";    
  }
}

