package com.cseve.java;

/*
*
* 变量
* 占用内存空间、值、数据类型、变量名
* 重复利用
* 读取、更改
* 可以只声明
* 可以同时声明多个
* 可以声明的同时赋值
* 可以连续赋值
* 声明不开辟空间
* 赋值时开辟空间
* */

public class VarTest01 {
  public static void main(String[] args) {
    int i;
    int a, b, c;
    a = b = c =2;
    i = a + b + c;
    System.out.println(i);
  }
}