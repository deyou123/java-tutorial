public class Example9_5 {
   public static void main(String args[]) {
      double aver=0,sum=0,item=0;
      boolean computable=true; 
      for(String s:args) {
         try{ item=Double.parseDouble(s);
              sum=sum+item;
         }
         catch(NumberFormatException e) {
              System.out.println("�������˷������ַ�:"+e);
              computable=false;
         }
      }
      if(computable) {
          aver=sum/args.length;
      }
      for(String s:args) {
         System.out.print(s+" ");
      } 
      System.out.println("��ƽ����:"+aver);
      int number=8642;
      String binaryString=Long.toBinaryString(number);
      System.out.println(number+"�Ķ����Ʊ�ʾ:"+binaryString);
      System.out.println(number+"��ʮ�����Ʊ�ʾ:"+Long.toString(number,16));
  }
}
