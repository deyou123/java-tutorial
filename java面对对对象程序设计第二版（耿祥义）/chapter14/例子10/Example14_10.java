import java.sql.*;
import java.util.*;
public class Example14_10 {
   public static void main(String args[]) {
     AddRecord insertRecord=new AddRecord();
     String datasorce="star";
     String tableName="employee";
     insertRecord.setDatasourceName(datasorce);
     insertRecord.setTableName(tableName);
     insertRecord.setNumber("110");
     insertRecord.setName("¿ÔœÚ—Ô");
     insertRecord.setBirthday("1990-12-10");
     insertRecord.setSalary(3000);
     String backMess=insertRecord.addRecord();
     System.out.println(backMess);
     insertRecord.setNumber("111");
     insertRecord.setName("Œ¿¿Ô¡˘");
     insertRecord.setBirthday("1996-12-15");
     insertRecord.setSalary(6000);
     backMess=insertRecord.addRecord();
     System.out.println(backMess);
  }
}

