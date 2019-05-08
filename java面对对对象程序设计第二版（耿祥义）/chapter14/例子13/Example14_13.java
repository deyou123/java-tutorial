import java.sql.*;
import java.sql.*;
public class Example14_13 {
   public static void main(String[] args) {
      Connection conn = null;
      Statement sta = null;
      try { 
        Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();//��������
        //�������������ݿ�student:
        conn=DriverManager.getConnection("jdbc:derby:student;create=true");
        sta = conn.createStatement();
      }
      catch(Exception e) {
        System.out.println(e);  
        return;
      }
      try {
         sta.execute("create table chengji(name varchar(40),score float)");//������
      }
      catch(SQLException e) {
         System.out.println("�ñ��Ѿ�����"); 
         //�����Ҫɾ����,����ִ��sta.execute("drop table chengji");ɾ����������chengji��
      }
      try {
         sta.execute("insert into chengji values('��С��', 90.8)");  //�����¼
         sta.execute("insert into chengji values('��˹', 88.87)");
         sta.execute("insert into chengji values('liu xiao min',78.3)");
         ResultSet rs = sta.executeQuery("SELECT * FROM chengji "); // ��ѯ���еļ�¼
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
