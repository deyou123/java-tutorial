DangerException.java
public class DangerException extends Exception {
   final String message = "超重";
   public String warnMess() {
       return message;
   }
} 

CargoBoat.java
public class CargoBoat {
     int realContent;  //装载的重量
     int maxContent;   //最大装载量
     public void setMaxContent(int c) {
         maxContent = c;
     }
     public void loading(int m) throws DangerException {
       realContent += m;
       if(realContent>maxContent) {
          throw new DangerException(); 
       }
       System.out.println("目前装载了"+realContent+"吨货物");
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
           System.out.println("无法再装载重量是"+m+"吨的集装箱");       
      }
      finally {
          System.out.printf("货船将正点启航");
      }
  }
}



