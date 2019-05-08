import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Example17_2 extends Applet implements ActionListener {
   AudioClip clip;
   Button buttonPlay,
          buttonLoop,
          buttonStop;
   public void init() {
      clip=getAudioClip(getCodeBase(),"ding.Wav");
      buttonPlay=new Button("开始播放");
      buttonLoop=new Button("循环播放");
      buttonStop=new Button("停止播放");
      buttonPlay.addActionListener(this);
      buttonStop.addActionListener(this);
      buttonLoop.addActionListener(this); 
      add(buttonPlay);
      add(buttonLoop);
      add(buttonStop);   
   } 
   public void stop() {
      clip.stop();
   }
   public void actionPerformed(ActionEvent e) {
      if(e.getSource()==buttonPlay)
         clip.play();
      else if(e.getSource()==buttonLoop)
         clip.loop();
      if(e.getSource()==buttonStop)
         clip.stop();
   }
}
