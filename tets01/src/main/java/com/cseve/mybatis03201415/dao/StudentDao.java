package com.cseve.mybatis03201415.dao;

import com.cseve.mybatis03201415.domain.Student;

import java.util.List;

// 是一个接口，要操作student表
public interface StudentDao {
  // 查询所有数据
  public List<Student> selectStudents();

}
