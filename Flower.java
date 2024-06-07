public class Flower
{
  private String name;
  private String genus;
  private String color;
  

  public Flower(String n, String b, String c)
  {
    name = n;
    genus = b;
    color = c;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String newName)
  {
    name = newName;
  }

  public String getGenus()
  {
    return genus;
  }

  public String toString()
  {
    return "\nName: " + name + "\nGenus: " + genus + "\nColor: " + color ;
  }

  public String getColor()
  {

    return color;
  }


  
  
}