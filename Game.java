public class Game
{
  private String gameName;
  private int happinessIncrs;
  private int weightDecrs;

  public Game(String name, int happinessIncr, int weightDecr)
  {
    gameName = name;
    happinessIncrs = happinessIncr;
    weightDecrs = weightDecr;
  }

  public String getName()
  {
    return gameName;
  }

  public int getHappinessIncr()
  {
    return happinessIncrs;
  }

  public int getWeightDecr()
  {
    return weightDecrs;
  }

  public boolean isWinner()
  {
    
  double rand = Math.random();

  if (rand < 0.5)
  {
    return true;
  }
  else
  {
    return false;
  }
}}
  
