import java.sql.*;
import java.util.*;
public class SequencePrepareQuery extends PrepareQuery {
   public ArrayList <StringBuffer> getQueryResult() {
       setSQL("SELECT * FROM "+tableName);
       return super.getQueryResult(); 
   }    
}

