import java.util.regex.*;
public class Example9_22 {
   public static void main(String args[ ]) {
      Pattern p;          //ģʽ����
      Matcher m;         //ƥ�����
      String regex="[1-9][0-9]*[.]?[0-9]*" ;
      p=Pattern.compile(regex);  //���Ի�ģʽ����
      String  s="Price:123.456$,weight:234.78,height:83";   
      m=p.matcher(s);  //�ô�ƥ���ַ����г�ʼ��ƥ�����
      while(m.find()) {
         String str=m.group();
         System.out.print("��"+m.start()+"��"+m.end()+"ƥ��ģʽ������:");
         System.out.println(str);
      } 
   }
}
