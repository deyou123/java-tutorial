public class Example5_1 {
    public static void main(String args[]) {
        Son son=new Son();
        Grandson grandson=new Grandson();
        son.setWeight(62);
        son.setHand("һ˫����"); 
        grandson.setWeight(29);
        grandson.setHand("һ˫С��");
        grandson.setFoot("һ˫С��");
        System.out.println("��������:"+son.getWeight());
        System.out.println("��������:"+grandson.getWeight()); 
        System.out.println("���ӵ���:"+son.getHand());
        System.out.println("���ӵ���:"+grandson.getHand()); 
        System.out.println("���ӵĽ�:"+grandson.getFoot()); 
    }
}
