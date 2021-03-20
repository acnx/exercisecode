package com.cseve.java.fengzhuang;

public class UserTest {
  public static void main(String[] args) {
    User user = new User();
    System.out.println(user.age);
    user.age = -100;
    System.out.println(user.age);
    /*
    * 对于当前程序来说
    * User 的 age 属性在外部可以随意访问修改，导致age属性不安全
    * 年龄不能为负数，程序运行时没有报错，这是程序的缺陷
    *
    * 面向对象包括三大特征：封装 -> 继承 -> 多态
    *
    * 封装后才会形成真正的“对象”,真正的独立体
    *
    * 封装后意味着程序可以重复使用，适应性强，任何场合都可以用
    *
    * 封装后，对于事物本身，提高了安全性
    *
    * 封装：
    *   1.私有化
    *   2.提供接口
    *   3.编写逻辑
    * */
  }
}
