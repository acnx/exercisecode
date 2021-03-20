package com.cseve.mybatis03201415;

import com.cseve.mybatis03201415.domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyApp {
  public static void main(String[] args) throws IOException {
    // 访问mybatis访问数据库，读取数据
    // 1. 定义mybatis主配置文件，从类路径根开始
    String config = "mybatis.xml";
    // 2. 读取config表示的文件
    InputStream in = Resources.getResourceAsStream(config);
    // 3. 创建SqlSessionFactoryBuilder 对象
    SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
    // 4. 创建SqlSessionFactory 对象
    SqlSessionFactory factory = builder.build(in);
    // 5*. 从SqlSessionFactory 中获取sqlSession对象
    SqlSession sqlSession = factory.openSession();
    // 6*. 指定要执行的sql语句的标识：sql映射文件中的namespace + "." + 标签的id值
    String sqlId = "com.cseve.mybatis03201415.dao.StudentDao" + "." + "selectStudents";
    // 7. 通过sqlid执行sql语句
    List<Student> studentList = sqlSession.selectList(sqlId);
    // 8. 输出结果
    studentList.forEach(stu -> System.out.println(stu));
    // 9. 关闭sqlsession对象
    sqlSession.close();
  }
}
