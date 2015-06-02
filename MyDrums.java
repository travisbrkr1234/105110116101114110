//My example HashMap
import java.util.HashMap;
import java.util.Map;

public class MyDrums {

  public static void main(String[] args) {
    Map drumSets = new HashMap();

    //Drumsets by amount of pieces
    drumSets.put("Tama", 7);
    drumSets.put("DW", 5);
    drumSets.put("Orange County", 9);
    drumSets.put("Pacific", 6);
    drumSets.put("Gretch", 8);

    System.out.println(drumSets);
    System.out.println("");
    System.out.println("I have " + drumSets.size() + " complete drumsets!\nJust kidding, I only have 2.");

    String searchKey = "Tama";
    if (drumSets.containsKey(searchKey))
    System.out.println("My " + searchKey + " kit has " + drumSets.get(searchKey) + " pieces.");
    else
    System.out.println("Cannot find search term");

    drumSets.clear();
    System.out.println("After we have cleared the drumsets, we end up with: " + drumSets.size() + " drumsets!!!!");

  }
}
