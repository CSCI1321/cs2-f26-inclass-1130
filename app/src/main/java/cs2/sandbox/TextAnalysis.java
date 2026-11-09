package cs2.sandbox;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TextAnalysis {

  public static Set<String> getWords(String filename) {
    HashSet<String> set = new HashSet<String>();
    try {
      File file = new File(filename);
      Scanner scan = new Scanner(file);
      while(scan.hasNextLine()) {
        String line = scan.nextLine();
        String [] parts = line.split(" ");
        for(String word : parts) {
          set.add(word.toLowerCase().replaceAll("[^A-Za-z]",""));
        }
      }

    } catch (Exception e) {
      e.printStackTrace();
    }
    set.remove("");
    return set;
  }

  public static Map<String,Integer> getWordCounts(String filename) {
    HashMap<String,Integer> map = new HashMap<String,Integer>();
    try {
      File file = new File(filename);
      Scanner scan = new Scanner(file);
      while(scan.hasNextLine()) {
        String line = scan.nextLine();
        String [] parts = line.split(" ");
        for(String word : parts) {
          String w = word.toLowerCase().replaceAll("[^A-Za-z]","");
          if(map.containsKey(w)) {
            map.put(w, map.get(w) + 1);
          } else {
            map.put(w, 1);
          }
        }
      }

    } catch (Exception e) {
      e.printStackTrace();
    }
    map.remove("");
    return map;
  }

  public static void main(String[] args) {
    Set<String> tset = getWords("tempest.txt");
    Set<String> mset = getWords("midsummer.txt");
    //System.out.println(tset);
    System.out.println(tset.size());
    System.out.println(mset.size());
    mset.removeAll(tset);
    System.out.println(mset);

    Map<String,Integer> tmap = getWordCounts("tempest.txt");
    System.out.println(tmap);

    for(String key : tmap.keySet()) {
      if(tmap.get(key) > 100) {
        System.out.println(key + "\t" + tmap.get(key));
      }
    }


  }

  
}
