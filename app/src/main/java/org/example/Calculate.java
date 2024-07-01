package org.example;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public int sumRange(int start, int end) {
    int sum = 0;
    for (int i = start; i <= end; i++) {
      sum += i;
    }
    return sum;
  }

  public double average(int total, int count) {
    return (double) total / count;
  }

  public int sumOddRange(int start, int end) {
    int sum = 0;
    for (int i = start; i <= end; i++) {
      if (i % 2 != 0) {
        sum += i;
      }
    }
    return sum;
  }

  public int sumEvenRange(int start, int end) {
    int sum = 0;
    for (int i = start; i <= end; i++) {
      if (i % 2 == 0) {
        sum += i;
      }
    }
    return sum;
  }

  public String getSumAndAverageOfAnd(int x, int y) {
    int sum = sum(x, y);
    double average = average(sum, 2);
    return "Sum of 2 and 3 is " + sum + ". Average is " + average + ".";
  }

  public String getSumAndAverageOfTo(int start, int end) {
    int sum = sumRange(start, end);
    int counter = 0;
    for (int i = start; i <= end; i++) {
      counter = counter + 1;
    }
    double average = average(sum, counter);
    return "Sum of 1 to 10 is " + sum + ". Average is " + average + ".";
  }

  public String getSumOfOddAndEvenOfTo(int start, int end) {
    int sumOdd = sumOddRange(start, end);
    int sumEven = sumEvenRange(start, end);
    return "Sum of odd of 1 to 10 is " + sumOdd + ". Sum of even is " + sumEven + ".";
  }

}
