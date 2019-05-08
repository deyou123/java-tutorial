import java.net.*; 
import java.sql.*;
import com.sun.rowset.*; 
public class Example14_12 {
   public static void main(String args[]) {
      Connection con;
      Statement sql; 
      ResultSet rs;
      CachedRowSetImpl rowSet;
      try { Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  
      }
      catch(ClassNotFoundException e){}
      try{  con=DriverManager.getConnection("jdbc:odbc:star","","");
            sql=con.createStatement();
            rs=sql.executeQuery("SELECT * FROM employee");
            rowSet=new CachedRowSetImpl();
            rowSet.populate(rs);
            con.close();              //现在就可以关闭连接了
            while(rowSet.next()){
               String number=rowSet.getString(1);
               String name=rowSet.getString(2);
               Date birth=rowSet.getDate(3);
               double salary=rowSet.getDouble(4);
               System.out.println(number+","+name+","+birth+","+salary);
            }
       }
       catch(SQLException e){}
    }
}
