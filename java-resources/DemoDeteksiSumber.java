 import javax.swing.*;
 import java.awt.event.*;

 public class DemoDeteksiSumber extends JFrame {
 // Menciptakan empat tombol
 private JButton jbtBaru = new JButton("Baru");
 private JButton jbtBuka = new JButton("Buka");
 private JButton jbtSimpan = new JButton("Simpan");
 private JButton jbtTampil = new JButton("Tampil");

 public DemoDeteksiSumber() {
 // Menciptakan suatu panel untuk memuat tombol-tombol
 JPanel panel = new JPanel();
 panel.add(jbtBaru);
 panel.add(jbtBuka);
 panel.add(jbtSimpan);
 panel.add(jbtTampil);

 add(panel);

 // Menciptakan suatu listener
 ButtonListener listener = new ButtonListener();

 // Register listener with buttons
 jbtBaru.addActionListener(listener);
 jbtBuka.addActionListener(listener);
 jbtSimpan.addActionListener(listener);
 jbtTampil.addActionListener(listener);
 }

 class ButtonListener implements ActionListener {
 public void actionPerformed(ActionEvent e) {
 if (e.getSource() == jbtBaru)
 System.out.println("Proses Baru");
else if (e.getSource() == jbtBuka)
 System.out.println("Proses Buka");
else if (e.getSource() == jbtSimpan)
 System.out.println("Proses Simpan");
else if (e.getSource() == jbtTampil)
 System.out.println("Proses Tampil");
 }
 }

 /** Metode utama */
 public static void main(String[] args) {
 JFrame frame = new DemoDeteksiSumber();
 frame.setTitle("DemoDeteksiSumber");
 frame.setLocationRelativeTo(null); // Pusat frame
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 frame.setVisible(true);
 }
 }
