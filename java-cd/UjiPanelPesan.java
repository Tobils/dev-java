 import java.awt.*;
 import javax.swing.*;

 public class UjiPanelPesan extends JFrame {
 public UjiPanelPesan() {
 PanelPesan pesanPanel1 = new PanelPesan("JAVA itu Tangguh!");
 PanelPesan pesanPanel2 = new PanelPesan("C++ juga Penting");
 PanelPesan pesanPanel3 = new PanelPesan("Pemrograman itu Perlu");
 PanelPesan pesanPanel4 = new PanelPesan("Saya suka Pemrograman");
 pesanPanel1.setFont(new Font("SansSerif", Font.ITALIC, 20));
 pesanPanel2.setFont(new Font("Courier", Font.BOLD, 20));
 pesanPanel3.setFont(new Font("Times", Font.ITALIC, 20));
 pesanPanel4.setFont(new Font("Californian FB", Font.PLAIN, 20));
 pesanPanel1.setBackground(Color.RED);
 pesanPanel2.setBackground(Color.CYAN);
 pesanPanel3.setBackground(Color.GREEN);
 pesanPanel4.setBackground(Color.WHITE);
 pesanPanel1.tetapkanDitengah(true);

 setLayout(new GridLayout(2, 2));
 add(pesanPanel1);
 add(pesanPanel2);
 add(pesanPanel3);
 add(pesanPanel4);
 }

 public static void main(String[] args) {
 UjiPanelPesan frame = new UjiPanelPesan();
 frame.setSize(300, 200);
 frame.setTitle("UjiPanelPesan");
 frame.setLocationRelativeTo(null); // Pusat frame
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setVisible(true);
 }
 }