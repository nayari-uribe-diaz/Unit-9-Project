public class Main
{
  public static void main(String[] args) 
  {
    Flower lilly1 = new Lilly("Lilly", "Liliaceae", "pink");
    Lilly lil1 = new Lilly ("Stargazer Lilly", "Lilium orientalis", "pink and white");
    Flower orchid1 = new Orchid("Orchid", "Bulbophyllum", "Purple", "Orchids have 28000 species.");
    Orchid orch1 = new Orchid ("Yellow Moth Orchid", "Phalaenopsis amabilis", "Yellow", "Orchids have aerial roots.");

    
  
    lilly1.setName("Altari Lilly");

    orchid1.setName("Vanda Orchid");

    System.out.println("Flower 1: " + lilly1 + "\n");

    System.out.println("Lilly 1: "+ lil1 + "\n");

    System.out.println("Flower 2: " + orchid1);
    
System.out.println(((Orchid)orchid1).getFact("Fun Fact 2: The Vanda orchid is one of the most common orchids.\n"));
    
    System.out.println("Orchid 1: " + orch1 + "\n");

  
    
//"Some lilly buds can be comsumed and used in cooking."
    
  }
}