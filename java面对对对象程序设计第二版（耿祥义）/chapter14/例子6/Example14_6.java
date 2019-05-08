import java.sql.*;
import java.util.*;
public class Example14_6 {
   public static void main(String args[]) {
     System.out.println("姓名中包含有:张,李或酒的记录:"); 
     PatternQuery patternQuery=new PatternQuery();
     patternQuery.setNameContain("张李酒");
     String datasorce="star";
     String tableName="employee";
     patternQuery.setDatasourceName(datasorce);
     patternQuery.setTableName(tableName);
     ArrayList<StringBuffer> result=patternQuery.getQueryResult();
     for(StringBuffer str:result) {
        System.out.println(str);  
     }
   } 
}
