import java.sql.*;
import java.util.*;
public class SequenceQuery extends Query {
   public ArrayList <StringBuffer> getQueryResult() {
       setSQL("SELECT * FROM "+tableName);
       return super.getQueryResult(); 
   }    
}

