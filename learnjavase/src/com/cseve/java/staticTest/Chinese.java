package com.cseve.java.staticTest;

/*
* 中国人类
*
*
*
* */

public class Chinese {
  public Chinese() {
  }

  public Chinese(String id, String name, String country) {
    this.id = id;
    this.name = name;
    this.country = country;
  }

  String id;
  String name;
  String country;
  /*
  * 中国人类中的country属性每个对象都是“中国”，每个对象内部都保存同一个值，浪费空间
  * 应该设置为实例变量
  * */

}
