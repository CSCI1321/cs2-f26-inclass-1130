package cs2.adt;

import java.util.EmptyStackException;

public interface Stack<T> {
  public void push(T elem);
  public T pop() throws EmptyStackException;
  public T peek() throws EmptyStackException;
  public boolean isEmpty();
}
