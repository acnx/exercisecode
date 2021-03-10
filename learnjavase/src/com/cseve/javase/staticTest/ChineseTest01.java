package com.cseve.javase.staticTest;

public class ChineseTest01 {
  public static void main(String[] args) {
    Chinese zs = new Chinese("1", "zhangsan", "中国");
    System.out.println(zs.name + zs.id + zs.country);
    Chinese ls = new Chinese("2", "lisi", "中国");
    System.out.println(ls.id + ls.name + ls.country);

  }
}
