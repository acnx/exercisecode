package com.cseve.java.duotai;

public class Cat extends Animal {
  // 重写父类方法
  public void move(){
    System.out.println("猫在走");
  }

  public void catchMouse(){
    System.out.println("猫抓老鼠");
  }
}
