import java.util.*;
public class QueryBySalary extends Query {
   double salaryMax,salaryMin;       //нˮ��Χ
   public void setSalaryMax(double n) {
      salaryMax=n;
   }
   public void setSalaryMin(double n) {
      salaryMin=n;
   }
   public ArrayList <StringBuffer> getQueryResult() {
      String sql="SELECT * FROM employee Where salary <= "+salaryMax+
                " AND "+"salary >= "+salaryMin;
      setSQL(sql);
      return super.getQueryResult(); 
   }    
}
