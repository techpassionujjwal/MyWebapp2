package com.microsoft.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SimpleTest {
  @Test
  public void evaluatesExpression() {
    int sum = 1 + 2 + 2 + 3;
    assertEquals(7, sum);
  }
}
