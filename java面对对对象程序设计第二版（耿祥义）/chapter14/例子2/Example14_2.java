import java.sql.*;
import java.util.*;
public class Example14_2 {
   public static void main(String args[]) {
     SequenceQuery query=new SequenceQuery();
     String datasorce="star";
     String tableName="employee";
     query.setDatasourceName(datasorce);
     query.setTableName(tableName);
     ArrayList<StringBuffer> result=query.getQueryResult();
     for(StringBuffer str:result) {
        System.out.println(str);  
     }
  }
}
