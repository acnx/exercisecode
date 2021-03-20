package com.cseve.mybatis03201415.domain;


// 推荐和表名一致
public class Student {
//  定义属性，一般和表的列名保持一致
  protected String id;
  protected String name;

  @Override
  public String toString() {
    return "Student{" +
        "id='" + id + '\'' +
        ", name='" + name + '\'' +
        '}';
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
