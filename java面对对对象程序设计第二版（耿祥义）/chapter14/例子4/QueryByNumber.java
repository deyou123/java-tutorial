import java.util.*;
public class QueryByNumber extends Query {
   String number;
   public void setNumber(String number) {
      this.number=number;
   }
   public ArrayList <StringBuffer> getQueryResult() {
       setSQL("SELECT * FROM employee Where number = '"+number+"'");
       return super.getQueryResult(); 
   }    
}

