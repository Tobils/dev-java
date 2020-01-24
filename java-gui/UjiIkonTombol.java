/**
 * Demo Objek Button
 */

 import javax.swing.*;

 public class UjiIkonTombol extends JFrame
 {
     public static void main(final String[] args) 
     {
        /**
         * membuat frame dan properties nya 
         * */    
        final JFrame frame = new UjiIkonTombol();
        String title = "IkonTombol";
        frame.setTitle(title);
        // frame.setSize(200,100);
        frame.setLocationRelativeTo(null); // pusat frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
     }

     public UjiIkonTombol()
     {
         ImageIcon overviewIkon = new ImageIcon("./img/overview.png");
         ImageIcon serviceIkon  = new ImageIcon("./img/service.png");
         ImageIcon supportIkon  = new ImageIcon("./img/support.png");

         JButton jbt = new JButton("silahkan di klik", overviewIkon);
         jbt.setPressedIcon(serviceIkon);
         jbt.setRolloverIcon(supportIkon);

         add(jbt);
     }
 }