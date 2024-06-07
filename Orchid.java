public class Orchid extends Flower
{
  private String fact;

    public Orchid(String name, String gen, String color, String fact)
  {
    super(name, gen, color);
    this.fact = fact;
  }

  public String toString()
  {
    return  super.toString() + "\nFun Fact: " + fact;
  }
  public String getFact(String fact)
  {

    return fact;
    
  }
  
}
    
