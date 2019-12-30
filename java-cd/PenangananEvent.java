 import javax.swing.*;
 import java.awt.event.*;

 public class PenangananEvent extends JFrame{
 public PenangananEvent() {
 // Menciptakan dua tombol
 JButton jbtOK = new JButton("OK");
 JButton jbtBatal = new JButton("Batal");

 // Menciptakan panel yang menampung tombol
 JPanel panel = new JPanel();
 panel.add(jbtOK);
 panel.add(jbtBatal);

 add(panel); // Menambahkan panel ke dalam frame

 // Mendaftarkan listener
 OKListenerClass listener1 = new OKListenerClass();
 CancelListenerClass listener2 = new CancelListenerClass();
 jbtOK.addActionListener(listener1);
 jbtBatal.addActionListener(listener2);
 }

 public static void main(String[] args) {
 JFrame frame = new PenangananEvent();
 frame.setTitle("Penanganan Event");
 frame.setSize(200, 150);
 frame.setLocation(200, 100);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setVisible(true);
 }
 }

 class OKListenerClass implements ActionListener{
 public void actionPerformed(ActionEvent e) {
 System.out.println("Tombol OK diklik");
 }
 }

 class CancelListenerClass implements ActionListener{
 public void actionPerformed(ActionEvent e) {
 System.out.println("Tombol Batal diklik");
 }
 }