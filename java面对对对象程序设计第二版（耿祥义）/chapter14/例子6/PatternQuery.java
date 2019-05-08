import java.util.*;
public class PatternQuery extends Query {
   String nameContain;
   public void setNameContain(String s) {
      nameContain=s;
   }
   public ArrayList <StringBuffer> getQueryResult() {
      String sql="SELECT * FROM "+tableName+" WHERE name LIKE '%["+
                  nameContain+"]%'";
       setSQL(sql);
       return super.getQueryResult(); 
   }    
}

