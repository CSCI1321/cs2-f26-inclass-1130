package cs2.sandbox;

import java.util.ArrayList;

public class GenericSorting {
  public static <T> ArrayList<T> arrayToArrayList(T[] a) {
    ArrayList<T> lst = new ArrayList<>();
    for(T t : a) { lst.add(t); }
    return lst;
  }

  public static void bubbleSort(int[] a) {
    for(int j=0; j<a.length;j++) {
      for(int i=0; i<a.length-1; i++) {
        if(a[i] > a[i+1]) {
          int tmp = a[i];
          a[i] = a[i+1];
          a[i+1] = tmp;
        }
      }
    }
  }

  public static <T extends Comparable<T>> void genericBubbleSort(T[] a) {
    for(int j=0; j<a.length;j++) {
      for(int i=0; i<a.length-1; i++) {
        if(a[i].compareTo(a[i+1]) > 0) {
          T tmp = a[i];
          a[i] = a[i+1];
          a[i+1] = tmp;
        }
      }
    }
  }

  public static void main(String[] args) {
    String[] sarr = {"Hello","Apple","Goodbye","Zebra","Banana"};
    System.out.println(sarr);
    ArrayList<String> salst = arrayToArrayList(sarr);
    System.out.println(salst);

    Integer[] iarr = {3,1,5,3,7,3,9};
    System.out.println(iarr);
    ArrayList<Integer> ialst = arrayToArrayList(iarr);
    System.out.println(ialst);

    int[] lilA = {3,1,5,3,7,3,9};
    for(int i:lilA) System.out.print(i+",");
    bubbleSort(lilA);
    System.out.println();
    for(int i:lilA) System.out.print(i+",");

    for(String i:sarr) System.out.print(i+",");
    genericBubbleSort(sarr);
    System.out.println();
    for(String i:sarr) System.out.print(i+",");

    

  }

}
