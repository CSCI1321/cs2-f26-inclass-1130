package cs2.adt;

public class LinkedPriorityQueue<T extends Comparable<T>> implements PriorityQueue<T> {
  private class Node {
    public T data; public Node next;
    public Node(T d, Node n) { data=d; next=n; }
  }

  Node head;
  public LinkedPriorityQueue() {
    head = null;
  }

  public void add(T item) {
    head = new Node(item, head);
  }
  public T get() {
    return null;
  }
  public T peek() {
    T biggest = head.data;
    Node rover = head;
    while(rover != null) {
      if(rover.data.compareTo(biggest) > 0) {
        biggest = rover.data;
      }
      rover = rover.next;
    }
    return biggest;
  }
  public boolean isEmpty() { return head == null; }

}
