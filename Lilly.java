public class Lilly extends Flower
{

  public Lilly(String name, String genus, String color)
  {
    super(name, genus, color);
   
  }

  public String toString()
  {
    return super.toString();
  }

  @Override
  public String getGenus()
  {
    return "Lilly Genus: " + super.getGenus();
  }
}