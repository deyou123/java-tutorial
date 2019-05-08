import java.util.*;
public class Example9_19 {
   public static void main(String args[]) {
      Date nowTime = new Date();
      String pattern = "%tY-%<tm-%<td(%<tA) %<tT";
      String s = String.format(pattern,nowTime);
      System.out.println(s);
      s = String.format("所在时区%tZ与GMT相差:%<tz小时",nowTime);
      System.out.println(s);
      Calendar calendar = Calendar.getInstance();
      calendar.set(2015,2,12);
      s = String.format(Locale.US,"%tA %<tb %<td %<tY",calendar);
      System.out.println(s);
      s = String.format(Locale.JAPAN,"%tY年%<tb月%<td日,%<tA",calendar);
      System.out.println(s);
    }
}
