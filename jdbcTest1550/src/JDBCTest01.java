import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCTest01 {
  public static void main(String[] args) {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    List<Student> studentList = new ArrayList<>();// 钻石表达式
    try {
      Class.forName("com.mysql.jdbc.Driver");
      String url = "jdbc:mysql://localhost:3306/wkcto";
      String user = "root";
      String password = "root";
      conn = DriverManager.getConnection(url, user, password);
      String sql = "select id,name,birth from tbl_student";
      ps = conn.prepareStatement(sql);
      rs = ps.executeQuery();
      // 5、处理查询结果集
      while (rs.next()) {
        String id = rs.getString("id");
        String name = rs.getString("name");
        String birth = rs.getString("birth");

        // 将以上零散数据封装到JavaBean
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setBirth(birth);
        // 把JavaBean放到容器中
        studentList.add(student);
      }


    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if (rs != null) {
        try {
          rs.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }

      }
      if (ps != null) {
        try {
          ps.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }

      }
      if (conn != null) {
        try {
          conn.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }

      }


    }

    // 使用list集合展示（view）
    for (Student s : studentList){
      System.out.println(s);
    }


  }
}
