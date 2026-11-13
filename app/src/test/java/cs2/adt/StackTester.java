package cs2.adt;

import static org.junit.jupiter.api.Assertions.*;

import java.util.EmptyStackException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StackTester {
  private Stack<Integer> s;

  @BeforeEach 
  void init() {
    s = new ArrayStack<Integer>();
  }

  @Test 
  void testPushPop() {
    assertTrue(s.isEmpty());
    s.push(10);
    assertFalse(s.isEmpty());
    assertEquals(s.peek(), 10);
    assertEquals(s.pop(), 10);
    assertTrue(s.isEmpty());
  }

  @Test
  void testManyPushPop() {
    assertTrue(s.isEmpty());
    for(int i=0; i<100; i++) {
      s.push(i);
    }
    assertFalse(s.isEmpty());
    for(int i=99; i>=0; i--) {
      assertEquals(s.peek(), i);
      assertEquals(s.pop(), i);
    }
    assertTrue(s.isEmpty());

    assertThrows(EmptyStackException.class, () -> s.pop() );

  }



}
