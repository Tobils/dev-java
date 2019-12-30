 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;

 public class DemoBidangTeks extends DemoTombolRadio{
 private JTextField jtfPesan = new JTextField(10);

 /** Metode utama */
 public static void main(String[] args) {
 DemoBidangTeks frame = new DemoBidangTeks();
 frame.pack();
 frame.setTitle("DemoBidangTeks");
 frame.setLocationRelativeTo(null); // Pusat frame
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setVisible(true);
 }

 public DemoBidangTeks() {
 // Menciptakan panel baru untuk memuat label dan bidang teks
 JPanel jpTextField = new JPanel();
 jpTextField.setLayout(new BorderLayout(5, 0));
 jpTextField.add(
 new JLabel("Masukkan suatu pesan"), BorderLayout.WEST);
 jpTextField.add(jtfPesan, BorderLayout.CENTER);
 add(jpTextField, BorderLayout.NORTH);

 jtfPesan.setHorizontalAlignment(JTextField.RIGHT);

 // Meregistrasikan listener
 jtfPesan.addActionListener(new ActionListener() {
 /** Menangani ActionEvent */
 public void actionPerformed(ActionEvent e) {
 panelPesan.tetapkanPesan(jtfPesan.getText());
 jtfPesan.requestFocusInWindow();
 }
 });
 }
 }