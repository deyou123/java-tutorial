public class Example9_8 {
    public static void main(String args[]) {
       byte d[]="abc������".getBytes();           
       System.out.println("����d�ĳ�����(һ������ռ�����ֽ�):"+d.length);
       String s=new String(d,3,2); //�������
       System.out.println(s);
       s=new String(d,7,2);
       System.out.println(s); //�������
    }
}
