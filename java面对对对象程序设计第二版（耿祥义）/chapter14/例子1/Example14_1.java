import java.sql.*;
public class Example14_1 {
   public static void main(String args[]) {
      Connection con;
      Statement sql; 
      ResultSet rs;
      try{  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
      }
      catch(ClassNotFoundException e) {
         System.out.print(e);
      }
      try { 
          con=DriverManager.getConnection("jdbc:odbc:star","","");
          sql=con.createStatement();
          rs=sql.executeQuery("SELECT * FROM employee WHERE salary>1900");
          while(rs.next()) {
             String number=rs.getString(1);
             String name=rs.getString(2);
             Date date=rs.getDate("birthday");
             double salary=rs.getDouble("salary");
             System.out.printf("%-4s",number);
             System.out.printf("%-6s",name);
             System.out.printf("%-15s",date.toString()); 
             System.out.printf("%6s\n",salary);
          }
          con.close();
      }
      catch(SQLException e) { 
         System.out.println(e);
      }
  }
}
