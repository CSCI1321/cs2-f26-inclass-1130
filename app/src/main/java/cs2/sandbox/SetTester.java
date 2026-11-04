package cs2.sandbox;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTester {
  public static void main(String[] args) {
    Set<String> s = new HashSet<String>();
    System.out.println(s);
    s.add("HEllo");
    s.add("Z");
    s.add("Goodbye");
    System.out.println(s);
    s.add("AAAA");
    s.add("words");
    System.out.println(s);
  
    s.remove("AAAA");
    System.out.println(s);
    System.out.println(s.contains("what"));
    System.out.println(s.size());

    System.out.println(s.add("Goodbye!"));
    System.out.println(s);

    System.out.println(s.remove("Not There"));
    System.out.println(s);

    HashSet<String> t = new HashSet<>();
    t.add("HEllo");
    t.add("1130");
    t.add("words");
    System.out.println(s);
    System.out.println(t);

    Set<String> tcopy = (HashSet<String>)t.clone();

    t.retainAll(s);
    System.out.println(t);

    System.out.println(tcopy);

    Iterator<String> it = tcopy.iterator();
    while(it.hasNext()) {
      String tmp = it.next();
      System.out.println(tmp);
      System.out.println(tmp);
    } 




  } 
}
