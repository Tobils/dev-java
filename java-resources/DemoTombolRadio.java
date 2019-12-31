 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;

 public class DemoTombolRadio extends DemoKotakPeriksa{
 // Mendeklarasikan tombol-tombol radio
 private JRadioButton jrbMerah, jrbHijau, jrbBiru;

 public static void main(String[] args) {
 DemoTombolRadio frame = new DemoTombolRadio();
 frame.setSize(500, 200);
 frame.setLocationRelativeTo(null); // Pusat frame
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setTitle("DemoTombolRadio");
 frame.setVisible(true);
 }

 public DemoTombolRadio() {
 // Menciptakan suatu panel baru untuk memuat kotak-kotak periksa
 JPanel jpRadioButtons = new JPanel();
 jpRadioButtons.setLayout(new GridLayout(3, 1));
 jpRadioButtons.add(jrbMerah = new JRadioButton("Merah"));
 jpRadioButtons.add(jrbHijau = new JRadioButton("Hijau"));
 jpRadioButtons.add(jrbBiru = new JRadioButton("Biru"));
 add(jpRadioButtons, BorderLayout.WEST);

 // Menciptakan sekelompok tombol-radio untuk mengelompokkan tiga tombol
 ButtonGroup group = new ButtonGroup();
 group.add(jrbMerah);
 group.add(jrbHijau);
 group.add(jrbBiru);

 // Menetapkan mnemonik papankunci
 jrbMerah.setMnemonic('E');
 jrbHijau.setMnemonic('J');
 jrbBiru.setMnemonic('U');

 // Meregistrasikan listener untuk tombol radio
 jrbMerah.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 panelPesan.setForeground(Color.red);
 }
 });
 jrbHijau.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 panelPesan.setForeground(Color.green);
 }
 });
 jrbBiru.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 panelPesan.setForeground(Color.blue);
 }
 });

 // Menetapkan warna pesan awal menjadi biru
 jrbBiru.setSelected(true);
 panelPesan.setForeground(Color.blue);
 }
 }