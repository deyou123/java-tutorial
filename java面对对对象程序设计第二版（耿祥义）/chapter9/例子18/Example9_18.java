import java.util.Date;
import java.text.SimpleDateFormat;
public class Example9_18 {
   public static void main(String args[]) {
      Date nowTime=new Date();
      SimpleDateFormat matter1=
      new SimpleDateFormat("yyyy��M��d��Hʱm��s��");
      String timePattern=matter1.format(nowTime);
      System.out.println(timePattern);
      SimpleDateFormat matter2=
      new SimpleDateFormat("G(zʱ��) yyyy��MMMd��E HHʱmm��ss��");
      timePattern=matter2.format(nowTime);
      System.out.println(timePattern);
      long time=System.currentTimeMillis();
      System.out.printf("���ڵ�ʱ���ǰһ��Сʱ:\n%s",matter1.format(new Date(time-60*60*1000)));
    }
}
