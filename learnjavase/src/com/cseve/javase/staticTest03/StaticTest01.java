package com.cseve.javase.staticTest03;

public class StaticTest01 {
  /*
  * 静态代码块，类加载执行，只执行一次
  * 一个类中可以编写多个，遵循自上而下的顺序执行，但没必要
  * 可以用于日志的记录
  * 特殊的时刻：【 类加载时刻 】*
  * 通常在静态代码块中完成准备工作：加载连接池、解析xml文件等
  * */
  static {
    System.out.println("类加载");
  }
  static {
    System.out.println("类加载2");
  }
  static {
    System.out.println("类加载3");
  }
  public static void main(String[] args) {
    System.out.println("main begin");
  }
}
