��1��������Car���Person��ֱ����ͨ��
Person.java
public abstract class Person {
   public abstract String getMess(); 
}

Car.java
public class Car {
   Person person;    //��ϼ�ʻԱ
   public void setPerson(Person p) {
      person = p;
   }
   public void show() {
      if(person==null) {
        System.out.println("Ŀǰû�˼�ʻ����.");
      }
      else {
        System.out.println("Ŀǰ��ʻ��������:");
        System.out.println(person.getMess());
      }
   }
}
��2������������MainClass.java����ͨ����������������
MainClass.java
public class MainClass {
   public static void main(String arg[]) {
      Car car =new Car();
      int i=1;
      while(true) {
         try{
           car.show();
           Thread.sleep(2000);  //ÿ��2000���������ʻԱ
           Class cs=Class.forName("Driver"+i);
           Person p=(Person)cs.newInstance();
      //���û�е�i����ʻԱ������catch,�����˼�ʻ��ǰ��ʻԱ������ʻ:
           car.setPerson(p);      //������ʻԱ
           i++; 
         }
         catch(Exception exp){
           i++;
         }
         if(i>10) i=1;          //���10����ʻԱ�ֻ�����
      }
   }
}
��3������һ���裬��Ҫ��ֹ�������ڣ�2���������������ĳ���(ģ�ⲻͣ��)�������༭������Person������࣬����������ֱ�����Driver1��Driver2��Driver10��˳������⣩��������Driver��׺һ��������10�������������磺
Driver3.java
public class Driver3 extends Person {
   public String getMess(){
      return "������ʻԱ";
   }
}
�ڱ༭������������Driver1��Driver2�� ��Driver10��Person�������ʱ��Ҫ����ע��ڣ�2���������������ĳ��������Ч���ı仯(�۲����������ļ�ʻԱ)�����������Ч����ͼ9.24��ʾ�⣨�������Ч�����ܺ�����Ĳ�ͬ����
