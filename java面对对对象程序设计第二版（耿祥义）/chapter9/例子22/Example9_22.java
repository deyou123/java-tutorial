import java.util.regex.*;
public class Example9_22 {
   public static void main(String args[ ]) {
      Pattern p;          //模式对象
      Matcher m;         //匹配对象
      String regex="[1-9][0-9]*[.]?[0-9]*" ;
      p=Pattern.compile(regex);  //初试化模式对象
      String  s="Price:123.456$,weight:234.78,height:83";   
      m=p.matcher(s);  //用待匹配字符序列初始化匹配对象
      while(m.find()) {
         String str=m.group();
         System.out.print("从"+m.start()+"到"+m.end()+"匹配模式子序列:");
         System.out.println(str);
      } 
   }
}
