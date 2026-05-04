public class Food
{
  // Instance variables
  private String foodName;
  private int energyinc;
  private int happinessinc;
  private int weightgain;

  // Constructor
  public Food(String name, int energyIncrease, int happinessIncrease, int weightGain)
  {
    foodName = name;
   energyinc = energyIncrease;
  happinessinc = happinessIncrease;
    weightgain = weightGain;
  }

  // Accessor methods
  public String getName()
  {
    return foodName;
  }

  public int getEnergyIncrease()
  {
    return energyinc;
  }

  public int getHappinessIncrease()
  {
    return happinessinc;
  }

  public int getWeightGain()
  {
    return weightgain;
  }
}