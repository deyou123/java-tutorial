public class Example15_1 { 
   public  static void main(String args[]) { //主线程
       SpeakHello  speakHello;
       SpeakNihao speakNihao;  
       speakHello=new SpeakHello() ;  //创建线程
       speakNihao=new SpeakNihao();   //创建线程
       speakHello.start();            //启动线程 
       speakNihao.start();           //启动线程
       for(int i=1;i<=15;i++) {
          System.out.print("大家好"+i+"  ");
       }  
   }
}
