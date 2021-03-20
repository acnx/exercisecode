package com.cseve.java.reflect;

/*
* 反射机制
* 1、通过Java语言的反射机制，可以操作（读改）字节码文件
*    通过反射机制，可以操作代码片段
*
* 2、反射机制的相关类在哪个包下？
*   java.lang.reflect.*;
*
* 3、有关反射机制有哪些重要的类？
*   java.lang.Class 代表字节码文件，代表一个类型
*   java.lang.reflect.Method 代表字节码中的方法字节码
*   java.lang.Constructor 代表方法中的构造方法字节码
*   java.lang.Field 代表字节码中的属性字节码
*
* // Class
* public class User{
*
*   // Field
*   int no;
*
*   // Constructor
*   public User(){}
*   public User(int no){
*   this.no = no;
*   }
*
*   //Method
*   public void setNo(int no){
*     this.no = no;
*   }
*   public int getNo(){
*     return no;
*   }
*
* }
* */

public class ReflectTest01 {
  public static void main(String[] args) {
    System.out.println("反射机制");
  }

}
