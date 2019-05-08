import java.text.*;
public class Example9_21 {
   public static void main(String args[]){
      double number=12345.9876543;
      System.out.println(number+"格式化为整数最少6位，小数最多3位:");
      DecimalFormat df=new DecimalFormat ("000000.000");
      String result=df.format(number);
      System.out.println(result);
      number=12345678.987654;
      System.out.printf("%f格式化为整数最少2位,小数最多4位(整数部分按千分组):%n",number);
      df.applyPattern("#,##,#00.0000$"); 
      result=df.format(number);
      System.out.println(result);
      number=0.986796;
      System.out.println(number+"格式化为百分数和千分数:");
      df.applyPattern("0.0000%");
      result=df.format(number);
      System.out.println(result);
      df.applyPattern("0.0000\u2030");
      result=df.format(number);
      System.out.println(result);
      number=31456.4567;
      System.out.println(number+"格式化为科学计数法:");
      df.applyPattern("0.00E0");
      result=df.format(number);
      System.out.println(result);
      String money="3,521,563.345$";
      System.out.println(money+"转化成数字:"); 
      df.applyPattern("#,##,##0.000");
      try {
          Number num = df.parse(money);   
          System.out.println(num.doubleValue()); 
      }
      catch(Exception exp){}  
   }
}
