 import java.awt.*;
 import javax.swing.*;

 public class UjiBangunPanel extends JFrame {
 public UjiBangunPanel() {
 setLayout(new GridLayout(2, 3, 5, 5));
 add(new BangunPanel(BangunPanel.GARIS));
 add(new BangunPanel(BangunPanel.PERSEGIPANJANG));
 add(new BangunPanel(BangunPanel.BUNDAR_PERSEGIPANJANG));
 add(new BangunPanel(BangunPanel.OVAL));
 add(new BangunPanel(BangunPanel.PERSEGIPANJANG, true));
 add(new BangunPanel(BangunPanel.BUNDAR_PERSEGIPANJANG, true));
 }

 public static void main(String[] args) {
 UjiBangunPanel frame = new UjiBangunPanel();
 frame.setSize(400, 200);
 frame.setTitle("UjiBangunPanel");
 frame.setLocationRelativeTo(null); // Pusat frame
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setVisible(true);
 }
 }