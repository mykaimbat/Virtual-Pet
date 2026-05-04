public class VirtualPet
{
  // Instance Variables
  private int energy, happiness, weight, ageInYears, months;
  private String name;
    
  // Constant Variables
  private static final int MINIMUM_WEIGHT = 5;
  private static final int MAXIMUM_LEVEL = 10;
    
  // Constructor
  public VirtualPet(String petName)
  {
    name = petName;
    energy = 0;
    happiness = 0;
    weight = MINIMUM_WEIGHT;
    months = 0; 
    ageInYears = 0;
  }
    
  // Accessor Methods   
  public String getName()
  {
    return name;
  }
     
  public int getEnergyLevel()
  {
     return energy;
  }

  public int getHappinessLevel()
  {
     return happiness;
  }

  public void feed()
  {
    if (energy != MAXIMUM_LEVEL)
    {
       energy++;
    }
    weight++;
  }

  public void play(){

    if(happiness < MAXIMUM_LEVEL){
      happiness++; 

    }
  

  if (weight > MINIMUM_WEIGHT){
    weight--;
  }
}

public void updateStatus(){
  if (energy > 0) {
    energy--;
  }

  if (happiness > 0){
    happiness--;
  }

  months++; 

  if(months==12) {
    ageInYears++;
    months = 0; 
  }
}
  
  // returns a String of the state of the object
  public String toString()
  {
    return name + "'s Information:\nEnergy: " + energy + "\nHappiness: " 
                    + happiness + "\nWeight: " + weight + " g\nAge: " 
                    + months + " months and " + ageInYears + " years";    
  }
}
