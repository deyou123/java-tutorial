import java.util.*;
public class Example9_19 {
   public static void main(String args[]) {
      Date nowTime = new Date();
      String pattern = "%tY-%<tm-%<td(%<tA) %<tT";
      String s = String.format(pattern,nowTime);
      System.out.println(s);
      s = String.format("����ʱ��%tZ��GMT���:%<tzСʱ",nowTime);
      System.out.println(s);
      Calendar calendar = Calendar.getInstance();
      calendar.set(2015,2,12);
      s = String.format(Locale.US,"%tA %<tb %<td %<tY",calendar);
      System.out.println(s);
      s = String.format(Locale.JAPAN,"%tY��%<tb��%<td��,%<tA",calendar);
      System.out.println(s);
    }
}
