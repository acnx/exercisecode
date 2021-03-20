package com.cseve.cjv1.ch01;// 包
 // 类
public class Welcome {
  // 主方法
  public static void main(String[] args) {
    // 定义字符串类型数组，数组名是greeting，里面有三个值
    String[] greeting = new String[3];
    greeting[0] = "welcome to Core Java";
    greeting[1] = "by CH";
    greeting[2] = "and GC";

    // 循环
    for (String g:greeting){
      System.out.println(g);
    }

  }
}
