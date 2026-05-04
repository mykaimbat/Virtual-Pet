public class VirtualPet4
{
  private int energy;
  private int happiness;
  private int weight;
  private int ageInYears;
  private int months;
  private String name;

  // Constants
  private static final int MINIMUM_WEIGHT = 5;
  private static final int MAXIMUM_LEVEL = 10;

  // Constructor
  public VirtualPet4(String petName)
  {
    name = petName;
    energy = 0;
    happiness = 0;
    weight = MINIMUM_WEIGHT;
    months = 0;
    ageInYears = 0;
  }

  // Accessors
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

  // Feed method
  public void feed(Food food)
  {
    energy += food.getEnergyIncrease();
    if (energy > MAXIMUM_LEVEL)
    {
      energy = MAXIMUM_LEVEL;
    }
    if (energy < 0)
    {
      energy = 0;
    }

    happiness += food.getHappinessIncrease();
    if (happiness > MAXIMUM_LEVEL)
    {
      happiness = MAXIMUM_LEVEL;
    }
    if (happiness < 0)
    {
      happiness = 0;
    }

    weight += food.getWeightGain();
  }

  // Play method
  public boolean play(Game g)
  {
    boolean result = g.isWinner(); // call only once

    if (result)
    {
      happiness += g.getHappinessIncr();
      if (happiness > MAXIMUM_LEVEL)
      {
        happiness = MAXIMUM_LEVEL;
      }
    }
    else
    {
      happiness -= g.getHappinessIncr();
      if (happiness < 0)
      {
        happiness = 0;
      }
    }

    weight -= g.getWeightDecr();
    if (weight < MINIMUM_WEIGHT)
    {
      weight = MINIMUM_WEIGHT;
    }

    return result;
  }

  // Update status
  public void updateStatus()
  {
    if (energy > 0)
    {
      energy--;
    }

    if (happiness > 0)
    {
      happiness--;
    }

    months++;

    if (months == 12)
    {
      ageInYears++;
      months = 0;
    }
  }

  // toString
  public String toString()
  {
    return name + "'s Information:\nEnergy: " + energy +
           "\nHappiness: " + happiness +
           "\nWeight: " + weight + " g\nAge: " +
           months + " months and " + ageInYears + " years";
  }
}