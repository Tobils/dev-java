 import java.awt.*;
 import javax.swing.*;
 import javax.swing.event.*;

 public class DemoSlider extends JFrame {
 // Menciptakan slider horisontal dan vertikal
 private JSlider jsldHort = new JSlider(JSlider.HORIZONTAL);
 private JSlider jsldVert = new JSlider(JSlider.VERTICAL);

 // Menciptakan suatu PanelPesan
 private PanelPesan panelPesan =
 new PanelPesan("JAVA itu Tangguh!");

 public static void main(String[] args) {
 DemoSlider frame = new DemoSlider();
 frame.setTitle("DemoSlider");
 frame.setLocationRelativeTo(null); // Pusat frame
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.pack();
 frame.setVisible(true);
 }

 public DemoSlider() {
 // Menambahkan slider dan panel pesan pada frame
 setLayout(new BorderLayout(5, 5));
 add(panelPesan, BorderLayout.CENTER);
 add(jsldVert, BorderLayout.EAST);
 add(jsldHort, BorderLayout.SOUTH);

 // Menetapkan properti-properti slider
 jsldHort.setMaximum(50);
 jsldHort.setPaintLabels(true);
 jsldHort.setPaintTicks(true);
 jsldHort.setMajorTickSpacing(10);
 jsldHort.setMinorTickSpacing(1);
 jsldHort.setPaintTrack(false);
 jsldVert.setInverted(true);
 jsldVert.setMaximum(10);
 jsldVert.setPaintLabels(true);
 jsldVert.setPaintTicks(true);
 jsldVert.setMajorTickSpacing(10);
 jsldVert.setMinorTickSpacing(1);

 // Meregistrasi listener untuk slider
 jsldHort.addChangeListener(new ChangeListener() {
 /** Menangani aksi pengubahan scroll-bar */
 public void stateChanged(ChangeEvent e) {
 // getValue() dan getMaximumValue() mengembalikan int, 
 // tetapi untuk kepresisian lebih baik, digunakan double
 double nilai = jsldHort.getValue();
 double nilaiMaksimum = jsldHort.getMaximum();
 double Xbaru = (nilai * panelPesan.getWidth() /
 nilaiMaksimum);
 panelPesan.tetapkanKoordinatX((int)Xbaru);
 }
 });
 jsldVert.addChangeListener(new ChangeListener() {
 /** Menangani aksi pengubahan scroll-bar */
 public void stateChanged(ChangeEvent e) {
 // getValue() dan getMaximumValue() mengembalikan int, 
 // tetapi untuk kepresisian lebih baik, digunakan double
 double nilai = jsldVert.getValue();
 double nilaiMaksimum = jsldVert.getMaximum();
 double Ybaru = (nilai * panelPesan.getHeight() /
 nilaiMaksimum);
 panelPesan.tetapkanKoordinatY((int) Ybaru);
 }
 });
 }
 }