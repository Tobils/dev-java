 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;

 public class DemoBatangPenggeser extends JFrame {
 // Menciptakan batang penggeser horisontal dan vertikal
 private JScrollBar jscbHort =
 new JScrollBar(JScrollBar.HORIZONTAL);
 private JScrollBar jscbVert =
 new JScrollBar(JScrollBar.VERTICAL);

 // Menciptakan suatu PanelPesan
 private PanelPesan panelPesan =
 new PanelPesan("JAVA itu Tangguh!");

 public static void main(String[] args) {
 DemoBatangPenggeser frame = new DemoBatangPenggeser();
 frame.setTitle("DemoBatangPenggeser");
 frame.setLocationRelativeTo(null); // Pusat frame
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.pack();
 frame.setVisible(true);
 }

 public DemoBatangPenggeser() {
 // Manambahkan batang penggeser dan panel pesan pada frame
 setLayout(new BorderLayout());
 add(panelPesan, BorderLayout.CENTER);
 add(jscbVert, BorderLayout.EAST);
 add(jscbHort, BorderLayout.SOUTH);

 // Register listener for the scroll bars
 jscbHort.addAdjustmentListener(new AdjustmentListener() {
 public void adjustmentValueChanged(AdjustmentEvent e) {
 // getValue() dan getMaximumValue() mengembalikan int, tetapi
 // untuk kepresisian yang lebih baik, digunakan double
 double nilai = jscbHort.getValue();
 double nilaiMaksimum = jscbHort.getMaximum();
 double Xbaru = (nilai * panelPesan.getWidth() /
 nilaiMaksimum);
 panelPesan.tetapkanKoordinatX((int)Xbaru);
 }
 });
 jscbVert.addAdjustmentListener(new AdjustmentListener() {
 public void adjustmentValueChanged(AdjustmentEvent e) {
 // getValue() dan getMaximumValue() mengembalikan int, tetapi
 // untuk kepresisian yang lebih baik, digunakan double
 double nilai = jscbVert.getValue();
 double nilaiMaksimum = jscbVert.getMaximum();
 double Ybaru = (nilai * panelPesan.getHeight() /
 nilaiMaksimum);
 panelPesan.tetapkanKoordinatY((int)Ybaru);
 }
 });
 }
 }