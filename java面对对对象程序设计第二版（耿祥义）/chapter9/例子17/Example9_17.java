import java.util.*;
public class Example9_17 {
   public static void main(String args[]) {
      Scanner reader=new Scanner(System.in);
      System.out.println("������ݻس�ȷ��");
      int year = reader.nextInt();
      System.out.println("�����·ݻس�ȷ��");
      int month = reader.nextInt();
      CalendarBean cb=new CalendarBean();
      cb.setYear(year);
      cb.setMonth(month);
      String [] a= cb.getCalendar();//���غ����һά����
      System.out.println("\t"+year+"��"+month+"������");
      char [] str="��һ����������".toCharArray();
      for(char c:str) {     
         System.out.printf("%3c",c);
      }
      for(int i=0;i<a.length;i++) {     //�������a
         if(i%7==0)
             System.out.println("");  //����
         System.out.printf("%4s",a[i]);
      } 
   } 
}


