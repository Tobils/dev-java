 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;

 public class DemoKotakPeriksa extends DemoTombol{
 // Menciptakan tiga kotak periksa untuk mengendalikan penampilan pesan
 private JCheckBox jchkDitengahkan = new JCheckBox("Ditengahkan");
 private JCheckBox jchkTebal = new JCheckBox("Tebal");
 private JCheckBox jchkMiring = new JCheckBox("Miring");

 public static void main(String[] args) {
 DemoKotakPeriksa frame = new DemoKotakPeriksa();
 frame.setTitle("DemoKotakPeriksa");
 frame.setSize(500, 200);
 frame.setLocationRelativeTo(null); // Pusat frame
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setVisible(true);
 }

 public DemoKotakPeriksa() {
 // Menetapkan kunci-kunci mnemonik
 jchkDitengahkan.setMnemonic('D');
 jchkTebal.setMnemonic('T');
 jchkMiring.setMnemonic('M');

 // Menciptakan suatu panel untuk memuak kotak-kota periksa
 JPanel jpCheckBoxes = new JPanel();
 jpCheckBoxes.setLayout(new GridLayout(3, 1));
 jpCheckBoxes.add(jchkDitengahkan);
 jpCheckBoxes.add(jchkTebal);
 jpCheckBoxes.add(jchkMiring);
 add(jpCheckBoxes, BorderLayout.EAST);

 // Meregistrasi listener dengan kotak periksa
 jchkDitengahkan.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 panelPesan.tetapkanDitengah(jchkDitengahkan.isSelected());
 }
 });
 jchkTebal.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 setNewFont();
 }
 });
 jchkMiring.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 setNewFont();
 }
 });
 }

 private void setNewFont() {
 // Menetapkan gaya font
 int fontStyle = Font.PLAIN;
 fontStyle += (jchkTebal.isSelected() ? Font.BOLD : Font.PLAIN);
 fontStyle += (jchkMiring.isSelected() ? Font.ITALIC : Font.PLAIN);

 // Menetapkan font untuk pesan
 Font font = panelPesan.getFont();
 panelPesan.setFont(
 new Font(font.getName(), fontStyle, font.getSize()));
 }
 }	