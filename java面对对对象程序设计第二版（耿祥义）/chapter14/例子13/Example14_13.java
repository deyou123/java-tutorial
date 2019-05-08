import java.sql.*;
import java.sql.*;
public class Example14_13 {
   public static void main(String[] args) {
      Connection conn = null;
      Statement sta = null;
      try { 
        Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();//加载驱动
        //创建并连接数据库student:
        conn=DriverManager.getConnection("jdbc:derby:student;create=true");
        sta = conn.createStatement();
      }
      catch(Exception e) {
        System.out.println(e);  
        return;
      }
      try {
         sta.execute("create table chengji(name varchar(40),score float)");//创建表
      }
      catch(SQLException e) {
         System.out.println("该表已经存在"); 
         //如果需要删除表,可以执行sta.execute("drop table chengji");删除曾建立的chengji表
      }
      try {
         sta.execute("insert into chengji values('张小林', 90.8)");  //插入记录
         sta.execute("insert into chengji values('李斯', 88.87)");
         sta.execute("insert into chengji values('liu xiao min',78.3)");
         ResultSet rs = sta.executeQuery("SELECT * FROM chengji "); // 查询表中的记录
         while(rs.next()) {
            String name=rs.getString(1);
            System.out.print(name+"\t");
            float score=rs.getFloat(2);
            System.out.println(score);
         }
         conn.close();
      } 
      catch(SQLException e) {
          System.out.println(e);  
      }
  }
}
