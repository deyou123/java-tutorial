public class Example15_1 { 
   public  static void main(String args[]) { //���߳�
       SpeakHello  speakHello;
       SpeakNihao speakNihao;  
       speakHello=new SpeakHello() ;  //�����߳�
       speakNihao=new SpeakNihao();   //�����߳�
       speakHello.start();            //�����߳� 
       speakNihao.start();           //�����߳�
       for(int i=1;i<=15;i++) {
          System.out.print("��Һ�"+i+"  ");
       }  
   }
}
