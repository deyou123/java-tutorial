import java.util.*;
public class LineUPBySalary extends Query {
   public ArrayList <StringBuffer> getQueryResult() {
      setSQL("SELECT * FROM "+tableName+" ORDER BY salary");
      return super.getQueryResult(); 
   }    
}
