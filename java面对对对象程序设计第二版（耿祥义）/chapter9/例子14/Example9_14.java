import java.util.*;
public class Example9_14 {
   public static void main(String args[]) {
      String s="�л���:28.89Ԫ,��;����:128.87Ԫ,������:298Ԫ��";
      String delim = "�л���;������Ԫ:,��";
      StringTokenizer fenxi=new StringTokenizer(s,delim);//��delim�е��ַ������������Ϊ�ָ���� 
      double totalMoney=0;
      while(fenxi.hasMoreTokens()) {
          double money=Double.parseDouble(fenxi.nextToken());
          System.out.println(money);
          totalMoney += money;
      }
      System.out.println("�ܷ��ã�"+totalMoney+"Ԫ");
    } 
}
