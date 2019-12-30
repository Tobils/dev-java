import java.awt.*;
import javax.swing.*;
 
public class TampilPohonBiner extends JFrame {
 public TampilPohonBiner() {
 add(new KendaliPohon(new BinaryTree<Integer>()));
 }
 
 public static void main(String[] args) {
 KendaliPohon frame = new KendaliPohon(new BinaryTree<Integer>());
 frame.setTitle("TampilPohonBiner");
 frame.setSize(300, 350);
 frame.setLocationRelativeTo(null); // Pusat frame
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setVisible(true);
 }
}