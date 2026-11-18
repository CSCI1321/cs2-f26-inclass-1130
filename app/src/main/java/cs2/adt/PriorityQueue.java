package cs2.adt;

public interface PriorityQueue<T extends Comparable<T>> {
  public void add(T item);
  public T get();
  public T peek();
  public boolean isEmpty();
}
