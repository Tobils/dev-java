import javax.swing.*;
 import java.awt.event.*;

 public class DemoListenerSebagaiFrame extends JFrame 
 	implements ActionListener {
 		// Menciptakan empat tombol
 private JButton jbtBaru = new JButton("Baru");
 private JButton jbtBuka = new JButton("Buka");
 private JButton jbtSimpan = new JButton("Simpan");
 private JButton jbtTampil = new JButton("Tampil");

 public DemoListenerSebagaiFrame() {
 // Menciptakan suatu panel untuk memuat tombol-tombol
 JPanel panel = new JPanel();
 panel.add(jbtBaru);
 panel.add(jbtBuka);
 panel.add(jbtSimpan);
 panel.add(jbtTampil);

 add(panel);
 
 // Registrasi listener dengan tombol-tombol
 jbtBaru.addActionListener(this);
 jbtBuka.addActionListener(this);
 jbtSimpan.addActionListener(this);
 jbtTampil.addActionListener(this);
 }
 
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
 
 /** Metode utama */
 public static void main(String[] args) {
 JFrame frame = new DemoListenerSebagaiFrame();
 frame.setTitle("DemoListenerSebagaiFrame");
 frame.setLocationRelativeTo(null); // Pusat frame
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 frame.setVisible(true);
 }
 }
