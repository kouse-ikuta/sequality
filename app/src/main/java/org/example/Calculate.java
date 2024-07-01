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

  public String getSumAndAverageOf2And3() {
    int sum = sum(2, 3);
    double average = average(sum, 2);
    return "Sum of 2 and 3 is " + sum + ". Average is " + average + ".";
  }

  public String getSumAndAverageOf1To10() {
    int sum = sumRange(1, 10);
    double average = average(sum, 10);
    return "Sum of 1 to 10 is " + sum + ". Average is " + average + ".";
  }

  public String getSumOfOddAndEvenOf1To10() {
    int sumOdd = sumOddRange(1, 10);
    int sumEven = sumEvenRange(1, 10);
    return "Sum of odd of 1 to 10 is " + sumOdd + ". Sum of even is " + sumEven + ".";
  }

  public static void main(String[] args) {
    Calculate calc = new Calculate();

    System.out.println(calc.getSumAndAverageOf2And3());
    System.out.println(calc.getSumAndAverageOf1To10());
    System.out.println(calc.getSumOfOddAndEvenOf1To10());
  }
}
