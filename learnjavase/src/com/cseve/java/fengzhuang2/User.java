package com.cseve.java.fengzhuang2;

/*
* 封装的步骤：
* 1. 所有属性私有化：使用private进行修饰，只能在本类中访问
* 2. 对外提供简单的操作入口（Setter and Getter）
* 3. 在方法中编写代码进行逻辑控制
* */

public class User {
  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if(age > 0 && age <= 150){
      this.age = age;
    }else {
      System.out.println("输入的数据不合法");
    }

  }

  private int age;
}
