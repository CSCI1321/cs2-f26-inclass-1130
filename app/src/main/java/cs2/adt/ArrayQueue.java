package cs2.adt;

import java.util.NoSuchElementException;

public class ArrayQueue<T> implements Queue<T> {
  private T[] arr;
  private int len, beg;

  public ArrayQueue() {
    len = 0; beg = 0;
    arr = (T[]) new Object[10];
  }

  public void enqueue(T item) {
    if(len == arr.length) {
      T[] tmp = (T[]) new Object[arr.length * 2];
      for(int i=0; i<len; i++) {
        tmp[i] = arr[(beg + i) % arr.length];
      }
      beg = 0;
      arr = tmp;
    }
    arr[(beg + len) % arr.length] = item;
    len++;
  }
  public T dequeue() {
    if(isEmpty()) throw new NoSuchElementException();
    T retVal = arr[beg];
    beg = (beg + 1) % arr.length;
    len--;
    return retVal;
  }
  public T peek() {
    if(isEmpty()) throw new NoSuchElementException();
    return arr[beg];
  }
  public boolean isEmpty() { return len==0; }
}
