package com.cseve.javase.staticTest03;

/*
* 实例代码块
* 可以编写多个，自上而下执行
* 构造方法执行前执行
* 构造方法执行一次，实例代码块对应执行一次
* 特殊时机：【初始化时机】
*
* */

public class Shili {
  public Shili() {
    System.out.println("缺省构造器执行");
  }

  {
    System.out.println("实例代码块1");
  }
  {
    System.out.println("实例代码块2");
  }
  {
    System.out.println("实例代码块3");
  }

  /*
  * public 公开的，任何地方都可以访问
  * static 静态的，使用“类名.”即可访问，不需要创建对象
  * void 空类型，main方法执行结束不返回任何值
  * (String[] args) 形式参数列表
  * */
  public static void main(String[] args) {
    System.out.println("main begin");
    new Shili();
    new Shili();
    main(4324);
  }
  // 重载
  public static void main(int a){
    System.out.println(a);
  }
}

