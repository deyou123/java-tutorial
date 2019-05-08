DangerException.java
public class DangerException extends Exception {
   final String message = "����";
   public String warnMess() {
       return message;
   }
} 

CargoBoat.java
public class CargoBoat {
     int realContent;  //װ�ص�����
     int maxContent;   //���װ����
     public void setMaxContent(int c) {
         maxContent = c;
     }
     public void loading(int m) throws DangerException {
       realContent += m;
       if(realContent>maxContent) {
          throw new DangerException(); 
       }
       System.out.println("Ŀǰװ����"+realContent+"�ֻ���");
     }
}

Example6_6.java
public class Example6_6 {
   public static void main(String args[]) {
      CargoBoat ship = new CargoBoat();
      ship.setMaxContent(1000);
      int m = 600;
      try{  
           ship.loading(m);
           m = 400;
           ship.loading(m);
           m = 367;
           ship.loading(m);
           m = 555;
           ship.loading(m);
      }
      catch(DangerException e) {
           System.out.println(e.warnMess()); 
           System.out.println("�޷���װ��������"+m+"�ֵļ�װ��");       
      }
      finally {
          System.out.printf("��������������");
      }
  }
}



