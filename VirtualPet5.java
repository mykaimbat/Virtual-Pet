public class VirtualPet5
{
    // Instance Variables
    private int energy;
    private int happiness;
    private int weight;
    private int ageInYears;
    private int months;
    private String name;

    // New Features
    private int health;       // 0-10
    private boolean isSick;   // true if pet is sick

    // Constants
    private static final int MINIMUM_WEIGHT = 5;
    private static final int MAXIMUM_LEVEL = 10;

    // Constructor
    public VirtualPet5(String petName)
    {
        name = petName;
        energy = 0;
        happiness = 0;
        weight = MINIMUM_WEIGHT;
        months = 0;
        ageInYears = 0;
        health = MAXIMUM_LEVEL;
        isSick = false;
    }

    // Accessors
    public String getName() {
         return name; }
         
    public int getEnergyLevel() { 
        return energy; }

    public int getHappinessLevel() { 
        return happiness; }

    public int getHealth() { 
        return health; }
    public boolean getSickStatus() { 
        return isSick; }

    // Feed method
    public void feed(Food food)
    {
        energy += food.getEnergyIncrease();
        if (energy > MAXIMUM_LEVEL) energy = MAXIMUM_LEVEL;
        if (energy < 0) energy = 0;

        happiness += food.getHappinessIncrease();
        if (happiness > MAXIMUM_LEVEL) happiness = MAXIMUM_LEVEL;
        if (happiness < 0) happiness = 0;

        weight += food.getWeightGain();

        updateHealth();
    }

    // Play method
    public boolean play(Game g)
    {
        boolean result = g.isWinner(); // call only once

        if (result)
        {
            happiness += g.getHappinessIncr();
            if (happiness > MAXIMUM_LEVEL) happiness = MAXIMUM_LEVEL;
        }
        else
        {
            happiness -= g.getHappinessIncr();
            if (happiness < 0) happiness = 0;
        }

        weight -= g.getWeightDecr();
        if (weight < MINIMUM_WEIGHT) weight = MINIMUM_WEIGHT;

        updateHealth();
        return result;
    }

    // Sickness Methods
    public void getSick()
    {
        isSick = true;
        System.out.println(name + " is sick! Give medicine to help them recover.");
    }

    public void giveMedicine()
    {
        if (isSick)
        {
            isSick = false;
            happiness += 2;
            if (happiness > MAXIMUM_LEVEL) happiness = MAXIMUM_LEVEL;
            System.out.println(name + " has taken medicine and feels better!");
            updateHealth();
        }
        else
        {
            System.out.println(name + " is not sick.");
        }
    }

    // Update Health Method
    private void updateHealth()
    {
        health = MAXIMUM_LEVEL;

        if (energy < 3) health--;
        if (happiness < 3) health--;
        if (isSick) health -= 2;

        if (health < 0) health = 0;
        if (health > MAXIMUM_LEVEL) health = MAXIMUM_LEVEL;
    }

    // Update Status Method
    public void updateStatus()
    {
        if (energy > 0) energy--;
        if (happiness > 0) happiness--;

        months++;
        if (months == 12)
        {
            ageInYears++;
            months = 0;
        }

        // 10% chance of getting sick
        if (!isSick && Math.random() < 0.1)
        {
            getSick();
        }

        updateHealth();
    }

    // toString Method
    public String toString()
    {
        return name + "'s Information:\n" +
               "Energy: " + energy + "\n" +
               "Happiness: " + happiness + "\n" +
               "Weight: " + weight + " g\n" +
               "Age: " + months + " months and " + ageInYears + " years\n" +
               "Health: " + health + "\n" +
               (isSick ? "Status: Sick\n" : "");
    }
}