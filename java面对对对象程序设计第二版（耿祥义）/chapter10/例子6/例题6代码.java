Example10_6.java 
public class Example10_6 {
   public static void main(String args[]) {
       WindowNumber win=new WindowNumber();
   }
}
WindowNumber.java 
import java.awt.*;
import javax.swing.*;
import static javax.swing.JFrame.*;
public class WindowNumber extends JFrame { 
   JTextField text;
   PoliceListen listener;
   public WindowNumber() {
      init();
      setBounds(100,100,150,150);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   void init() {
      setLayout(new FlowLayout());
      text=new JTextField(10);          
      listener=new PoliceListen();
      text.addActionListener(listener); //text是事件源,listener是监视器
      add(text);
   }
}
PoliceListen.java 
import java.awt.event.*;
public class PoliceListen implements ActionListener { 
   public void actionPerformed(ActionEvent e) {
      int n=0,m=0;
      String str=e.getActionCommand();
      try{  n=Integer.parseInt(str);
           m=n*n;
           System.out.println(n+"的平方是:"+m);
      }
      catch(Exception ee) {
          System.out.println(ee.toString());
      }
    }
}
