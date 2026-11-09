package cs2.sandbox;

import java.util.HashMap;

public class MapTester {
  public static void main(String[] args) {
    HashMap<String,Double> map = new HashMap<>();
    System.out.println(map);
    map.put("One", 1.0);
    map.put("two", 2.0);
    System.out.println(map); 
    System.out.println(map.size());
    System.out.println(map.containsKey("three"));
    System.out.println(map.containsValue(1.0));
    map.remove("two");
    System.out.println(map);
    map.put("One", 4.0);
    System.out.println(map);
    System.out.println(map.remove("One"));
    map.put("A",Math.PI);
    map.put("B",2.7);
    System.out.println(map.get("Z"));
  }
}
