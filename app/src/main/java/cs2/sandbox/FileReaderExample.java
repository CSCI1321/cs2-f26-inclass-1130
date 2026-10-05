package cs2.sandbox;

import java.io.File;
import java.util.Scanner;

public class FileReaderExample {
  public static void main(String[] args) {
    try {
      File file = new File("tempest.txt");
      Scanner scan = new Scanner(file);
      while (scan.hasNextLine()) {
        System.out.println(scan.nextLine());
      }
    } catch (Exception e) {
      System.err.println("Something went wrong");
    }
  }
}
