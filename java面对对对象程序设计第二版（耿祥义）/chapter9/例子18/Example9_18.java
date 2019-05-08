import java.util.Date;
import java.text.SimpleDateFormat;
public class Example9_18 {
   public static void main(String args[]) {
      Date nowTime=new Date();
      SimpleDateFormat matter1=
      new SimpleDateFormat("yyyy年M月d日H时m分s秒");
      String timePattern=matter1.format(nowTime);
      System.out.println(timePattern);
      SimpleDateFormat matter2=
      new SimpleDateFormat("G(z时区) yyyy年MMMd日E HH时mm分ss秒");
      timePattern=matter2.format(nowTime);
      System.out.println(timePattern);
      long time=System.currentTimeMillis();
      System.out.printf("现在的时间的前一个小时:\n%s",matter1.format(new Date(time-60*60*1000)));
    }
}
