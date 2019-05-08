import java.sql.*;
import java.util.*;
public class Example14_5 {
   public static void main(String args[]) {
     System.out.println("∞¥–ΩÀÆ∏ﬂµÕ∆¥“Ù≈≈–Úº«¬º:"); 
     LineUPBySalary sortBySalary=new LineUPBySalary();
     String datasorce="star";
     String tableName="employee";
     sortBySalary.setDatasourceName(datasorce);
     sortBySalary.setTableName(tableName);
     ArrayList<StringBuffer> result=sortBySalary.getQueryResult();
     for(StringBuffer str:result) {
        System.out.println(str);  
     }
     System.out.println("∞¥–’ œ∆¥“Ù≈≈–Úº«¬º:"); 
     LineUPByName sortByName=new LineUPByName();
     sortByName.setDatasourceName(datasorce);
     sortByName.setTableName(tableName);
     result=sortByName.getQueryResult();
     for(StringBuffer str:result) {
        System.out.println(str);  
     }
   }
}
