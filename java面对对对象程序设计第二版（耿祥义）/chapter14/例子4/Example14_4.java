import java.sql.*;
import java.util.*;
public class Example14_4 {
   public static void main(String args[]) {
     QueryByNumber byNumber=new QueryByNumber();
     String datasorce="star";
     String tableName="employee";
     byNumber.setDatasourceName(datasorce);
     byNumber.setTableName(tableName);
     String number="002";
     System.out.println("��ѯѧ��Ϊ"+number+"�ļ�¼:");  
     byNumber.setNumber(number);
     ArrayList<StringBuffer> result=byNumber.getQueryResult();
     for(StringBuffer str:result) {
        System.out.println(str);  
     }
     double max=3500,min=2600;
     System.out.println("��ѯнˮ��"+min+"��"+max+"֮��ļ�¼:");  
     QueryBySalary bySalary=new QueryBySalary();
     bySalary.setDatasourceName(datasorce);
     bySalary.setTableName(tableName);
     bySalary.setSalaryMax(max);
     bySalary.setSalaryMin(min); 
     result=bySalary.getQueryResult();
     for(StringBuffer str:result) {
        System.out.println(str);  
     }
   }
}
