import java.sql.*;
import java.util.*;
public class Example14_6 {
   public static void main(String args[]) {
     System.out.println("�����а�����:��,���Ƶļ�¼:"); 
     PatternQuery patternQuery=new PatternQuery();
     patternQuery.setNameContain("�����");
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
