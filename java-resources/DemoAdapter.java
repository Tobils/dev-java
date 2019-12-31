 import java.awt.event.*;
 import javax.swing.JFrame;

 public class DemoAdapter extends JFrame {
 public static void main(String[] args) {
 DemoAdapter frame = new DemoAdapter();
 frame.setSize(220, 80);
 frame.setLocationRelativeTo(null); // Pusat frame
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setTitle("DemoAdapter");
 frame.setVisible(true);
 }

 public DemoAdapter() {
 addWindowListener(new WindowAdapter() {
 public void windowActivated(WindowEvent event) {
 System.out.println("Jendela diaktivasi");
 }
 });
 }
 }