import java.sql.*;
import java.util.*;
public class Example14_7 {
   public static void main(String args[]) {
     ModifyTable modify=new ModifyTable();
     modify.setDatasourceName("star");
     modify.setSQL("UPDATE employee SET salary =3999 WHERE name='张三'");
     String backMess=modify.modifyRecord();
     System.out.println(backMess); 
     modify.setSQL("DELETE  FROM employee WHERE number = '002'");
     backMess=modify.modifyRecord();
     System.out.println(backMess); 
     modify.setSQL("INSERT INTO employee VALUES ('009','金山山', '1988-12-20',3976)");
     backMess=modify.modifyRecord();
     System.out.println(backMess);
   } 
}
