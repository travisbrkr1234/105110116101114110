//My example LinkedList
import java.util.LinkedList;

public class Hobbies{
  public static void main(String[] args) {

    LinkedList<String> hobbies = new LinkedList<String>();

    hobbies.add("Brewing");
    hobbies.add("HD Music");
    hobbies.add("Rockets");
    hobbies.add("Building Computers");

    System.out.println("Some of my hobbies include: " + hobbies);

    hobbies.addFirst("Drumming");
    hobbies.addLast("Working on Cars");

    System.out.println();
    System.out.println("My Favorite hobbies are: " + hobbies);
  }
}
