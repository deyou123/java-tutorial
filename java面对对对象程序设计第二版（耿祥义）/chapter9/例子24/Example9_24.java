（1）将下列Car类和Person类分别编译通过
Person.java
public abstract class Person {
   public abstract String getMess(); 
}

Car.java
public class Car {
   Person person;    //组合驾驶员
   public void setPerson(Person p) {
      person = p;
   }
   public void show() {
      if(person==null) {
        System.out.println("目前没人驾驶汽车.");
      }
      else {
        System.out.println("目前驾驶汽车的是:");
        System.out.println(person.getMess());
      }
   }
}
（2）将下列主类MainClass.java编译通过，并运行起来。
MainClass.java
public class MainClass {
   public static void main(String arg[]) {
      Car car =new Car();
      int i=1;
      while(true) {
         try{
           car.show();
           Thread.sleep(2000);  //每隔2000耗秒更换驾驶员
           Class cs=Class.forName("Driver"+i);
           Person p=(Person)cs.newInstance();
      //如果没有第i个驾驶员就跳到catch,即无人驾驶或当前驾驶员继续驾驶:
           car.setPerson(p);      //更换驾驶员
           i++; 
         }
         catch(Exception exp){
           i++;
         }
         if(i>10) i=1;          //最多10个驾驶员轮换开车
      }
   }
}
（3）在这一步骤，不要终止在上述第（2）步骤运行起来的程序(模拟不停车)。继续编辑、编译Person类的子类，但子类的名字必须是Driver1，Driver2…Driver10（顺序可任意），即单词Driver后缀一个不超过10的正整数，例如：
Driver3.java
public class Driver3 extends Person {
   public String getMess(){
      return "美国驾驶员";
   }
}
在编辑，编译类名如Driver1，Driver2… …Driver10的Person类的子类时，要密切注意第（2）步骤运行起来的程序的运行效果的变化(观察汽车更换的驾驶员)。这里的运行效果如图9.24所示意（你的运行效果可能和这里的不同）。
