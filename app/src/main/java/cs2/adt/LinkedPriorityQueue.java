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
    if(item.compareTo(head.data) > 0) {
      head = new Node(item, head);
    } else {
      Node rover = head;
      while(rover.next != null && rover.next.data.compareTo(item) > 0) {
        rover = rover.next;
      }
      rover.next = new Node(item, rover.next);
    }
  }
  public T get() {
    T retVal = head.data;
    head = head.next;
    return retVal;
  }
  public T peek() {
    return head.data;
  }
  public boolean isEmpty() {
    return head == null;
  }

  /*
  public void add(T item) {
    head = new Node(item, head);
  }
  public T get() {
    Node bigNode = head;
    Node obb = null;
    Node rover = head;
    Node obr = null;
    while(rover != null) {
      if(rover.data.compareTo(bigNode.data) > 0) {
        bigNode = rover;
        obb = obr;
      }
      obr = rover;
      rover = rover.next;
    }
    obb.next = bigNode.next;
    return bigNode.data;
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
  */
}
