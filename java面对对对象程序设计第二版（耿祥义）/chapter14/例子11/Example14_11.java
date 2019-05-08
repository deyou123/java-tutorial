import java.sql.*; 
public class Example14_11{
    public static void main(String args[]){
       Connection con=null;
       Statement sql; 
       ResultSet rs;
       try { Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  
       }
       catch(ClassNotFoundException e){
             System.out.println(""+e);
       }
       try{ double n=500;
            con=DriverManager.getConnection("jdbc:odbc:star","","");
            con.setAutoCommit(false);       //关闭自动提交模式
            sql=con.createStatement();
            rs=sql.executeQuery("SELECT * FROM employee WHERE number='001'");
            rs.next();
            double moneyOne=rs.getDouble("salary");
            moneyOne=moneyOne-n;
            rs=sql.executeQuery("SELECT * FROM employee WHERE number='003'");
            rs.next();
            double moneyTwo=rs.getDouble("salary");
            moneyTwo=moneyTwo+n;
            sql.executeUpdate
               ("UPDATE employee SET salary ="+moneyOne+" WHERE number='001'");
            sql.executeUpdate
               ("UPDATE employee SET salary="+moneyTwo+" WHERE number='003'");
            con.commit();                 //开始事务处理
            con.close();
         }
         catch(SQLException e){
            try{ con.rollback();             //撤消事务所做的操作
            }
            catch(SQLException exp){}
            System.out.println(e);
         }
    }
}
