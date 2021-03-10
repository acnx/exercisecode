package com.cseve.javase;

/*
* 方法重载：名同数不同
* 方法名相同
* 参数列表不同：参数类型、顺序、个数
*
* */

public class OverloadTest01 {
  public static void main(String[] args) {
    int a =1, b = 2;
    System.out.println(sum(a,b));
    double c =1.1, d = 2;
    System.out.println(sum(c, d));
  }

  private static int sum(int a, int b) {
    return a + b;
  }

  private static double sum(double a, double b) {
    return a + b;
  }
}
