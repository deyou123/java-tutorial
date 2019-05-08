import java.io.*;
public class Example12_5 {
   public static void main(String args[]) {
      byte [] b="ÄãºÃ,½üÀ´Ã¦Âð?".getBytes();
      try{  
          FileOutputStream out=new FileOutputStream("hello.txt");
          out.write(b);
          out.write(b,0,b.length); 
      }
      catch(IOException e) {
          System.out.println("Error "+e);
      }
  }
}
