package org.example;

public class App {
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
    int counter = end - start + 1;
    double average = average(sum, counter);
    return "Sum of 1 to 10 is " + sum + ". Average is " + average + ".";
  }

  public String getSumOfOddAndEvenOfTo(int start, int end) {
    int sumOdd = sumOddRange(start, end);
    int sumEven = sumEvenRange(start, end);
    return "Sum of odd of 1 to 10 is " + sumOdd + ". Sum of even is " + sumEven + ".";
  }

  public String getGreeting() {
    return "Hello World!";
  }

  public static void main(String[] args) {
    App calc = new App();
    System.out.println(calc.getGreeting());
    System.out.println(calc.getSumAndAverageOfAnd(2, 3));
    System.out.println(calc.getSumAndAverageOfTo(1, 10));
    System.out.println(calc.getSumOfOddAndEvenOfTo(1, 10));
  }
}
