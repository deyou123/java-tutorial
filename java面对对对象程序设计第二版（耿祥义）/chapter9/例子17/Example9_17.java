import java.util.*;
public class Example9_17 {
   public static void main(String args[]) {
      Scanner reader=new Scanner(System.in);
      System.out.println("输入年份回车确认");
      int year = reader.nextInt();
      System.out.println("输入月份回车确认");
      int month = reader.nextInt();
      CalendarBean cb=new CalendarBean();
      cb.setYear(year);
      cb.setMonth(month);
      String [] a= cb.getCalendar();//返回号码的一维数组
      System.out.println("\t"+year+"年"+month+"月日历");
      char [] str="日一二三四五六".toCharArray();
      for(char c:str) {     
         System.out.printf("%3c",c);
      }
      for(int i=0;i<a.length;i++) {     //输出数组a
         if(i%7==0)
             System.out.println("");  //换行
         System.out.printf("%4s",a[i]);
      } 
   } 
}


