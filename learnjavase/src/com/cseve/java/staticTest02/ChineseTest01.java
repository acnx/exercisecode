package com.cseve.java.staticTest02;

/*
* 使用static修饰意为“静态的”
* 修饰的方法称为静态方法
* 修饰变量称为静态变量
* 修饰的内容都时类级别的，与具体的对象无关
*
* */

public class ChineseTest01 {
  public static void main(String[] args) {
    Chinese zs = new Chinese("1", "zhangsan", "中国");
    System.out.println(zs.name + zs.id + Chinese.country);
    Chinese ls = new Chinese("2", "lisi", "中国");
    System.out.println(ls.id + ls.name + Chinese.country);
    // 使用“引用.”也可以，但不鼓励
    System.out.println(zs.id + zs.name + zs.country);

  }
}
