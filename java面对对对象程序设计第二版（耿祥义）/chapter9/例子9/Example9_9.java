public class Example9_9 {
   public static void main (String args[ ]) {
      String regex="[1-9][0-9]*[.]?[0-9]*" ;
      String str1="12r34a5";
      String str2="123.45908";
      if(str1.matches(regex)) {
         System.out.println(str1+"���Ա�ʾ����"); 
      }
      else {
          System.out.println(str1+"�����Ա�ʾ����"); 
          String result=str1.replaceAll("\\D+","");
          System.out.println("�޳�"+str1+"�ķ������ַ��õ����ַ����ǣ�");
          System.out.println(result);
      }
      if(str2.matches(regex)) {
         System.out.println(str2+"���Ա�ʾ����"); 
      }  
      else {
         System.out.println(str2+"�����Ա�ʾ����");
         String result=str1.replaceAll("\\D","");
         System.out.println("�޳�"+str2+"�ķ������ַ��õ����ַ����ǣ�");
         System.out.println(result); 
      }
     
   }
}

