public class Example5_14 {
   public static void main(String args[]) {
      China zhang; 
      Japan henlu;
      zhang=new China();   
      henlu=new Japan();  
      zhang.number=991898+Computable.MAX; 
      henlu.number=941448+Computable.MAX;
      System.out.println("number:"+zhang.number+"���"+zhang.f(100));
      System.out.println("number:"+henlu.number+"���"+henlu.f(100));
   }
}   

