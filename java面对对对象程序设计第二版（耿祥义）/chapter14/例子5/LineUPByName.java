import java.util.*;
public class LineUPByName extends Query {
   public ArrayList <StringBuffer> getQueryResult() {
       setSQL("SELECT * FROM "+tableName+" ORDER BY name");
       return super.getQueryResult(); 
   }    
}

