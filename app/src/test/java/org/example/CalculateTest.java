package org.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    assertEquals("Sum of 2 and 3 is 5. Average is 2.5.", calculate.getSumAndAverageOf2And3());
    assertEquals("Sum of 1 to 10 is 55. Average is 5.5.", calculate.getSumAndAverageOf1To10());
    assertEquals("Sum of odd of 1 to 10 is 25. Sum of even is 30.", calculate.getSumOfOddAndEvenOf1To10());
  }
}
