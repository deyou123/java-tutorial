import java.net.*;
import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;
public class Shanghai {
   public static void main(String args[]) {
      ShanghaiFrame shanghaiWin=new ShanghaiFrame();
   }
} 
class ShanghaiFrame extends JFrame implements Runnable,ActionListener
{  JTextField out_message=new JTextField(10);
   JTextArea in_message=new JTextArea(); 
   JButton send=new JButton("����");
   ShanghaiFrame() {
       setTitle("�����Ϻ�");
       setSize(400,200);
       setVisible(true);
       send.addActionListener(this);
       JPanel pSouth=new JPanel();
       pSouth.add(out_message);
       pSouth.add(send); 
       add(pSouth,"South");
       add(new JScrollPane(in_message),"Center");
       validate();
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       Thread thread=new Thread(this);
       thread.start();//�̸߳���������ݰ�
   }
   public void actionPerformed(ActionEvent event) { //�����Ť�������ݰ�
      byte buffer[]=out_message.getText().trim().getBytes();
      try{  InetAddress address=InetAddress.getByName("127.0.0.1");
            DatagramPacket data_pack=
                       new DatagramPacket(buffer,buffer.length, address,888);
            DatagramSocket mail_data=new DatagramSocket();
            mail_data.send(data_pack);
      }
      catch(Exception e){}     
   } 
   public void run() {    //   �������ݰ�
      DatagramPacket pack=null;
      DatagramSocket mail_data=null;
      byte data[]=new byte[8192];
      try{  pack=new DatagramPacket(data,data.length);
             mail_data=new DatagramSocket(666);
      }
      catch(Exception e){} 
      while(true) {  
        if(mail_data==null) break;
        else
          try{ mail_data.receive(pack); 
               String message=new String(pack.getData(),0,pack.getLength());
               in_message.append("�յ������ǣ�"+message+"\n");
          }
          catch(Exception e){}
      } 
   }
}
