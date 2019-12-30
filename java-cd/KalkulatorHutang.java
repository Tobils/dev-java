 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;
 import javax.swing.border.TitledBorder;

 public class KalkulatorHutang extends JFrame {
 // Menciptakan bidang teks untuk suku bunga,
 // tahun, jumlah pinjaman, pembayaran bulanan, dan pembayaran total
 private JTextField jtfSukuBungaTahunan = new JTextField();
 private JTextField jtfJumlahTahun = new JTextField();
 private JTextField jtfJumlahPinjaman = new JTextField();
 private JTextField jtfPembayaranBulanan = new JTextField();
 private JTextField jtfPembayaranTotal = new JTextField();

 // Menciptakan suatu tombol Hitung Pembayaran
 private JButton jbtHitungHutang = new JButton("Hitung Pembayaran");

 public KalkulatorHutang() {
 // Panel p1 untuk memua label dan bidang teks
 JPanel p1 = new JPanel(new GridLayout(5, 2));
 p1.add(new JLabel("Suku Bunga Tahunan"));
 p1.add(jtfSukuBungaTahunan);
 p1.add(new JLabel("Jumlah Tahun"));
 p1.add(jtfJumlahTahun);
 p1.add(new JLabel("Jumlah Pinjaman"));
 p1.add(jtfJumlahPinjaman);
 p1.add(new JLabel("Pembayaran Bulanan"));
 p1.add(jtfPembayaranBulanan);
 p1.add(new JLabel("Pembayaran Total"));
 p1.add(jtfPembayaranTotal);
 p1.setBorder(new
 TitledBorder("Masukkan jumlah pinjaman, suku bunga, dan jumlah tahun"));

 // Panel p2 untuk memuat tombol
 JPanel p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
 p2.add(jbtHitungHutang);

 // Menambah panel ke frame
 add(p1, BorderLayout.CENTER);
 add(p2, BorderLayout.SOUTH);

 // Register listener
 jbtHitungHutang.addActionListener(new ButtonListener());
 }

 /** Menangani tombol Hitung Pembayaran */
 private class ButtonListener implements ActionListener {
 public void actionPerformed(ActionEvent e) {
 // Mendapatkan nilai-nilai dari bidang teks
 double bunga =
 Double.parseDouble(jtfSukuBungaTahunan.getText());
 int tahun =
 Integer.parseInt(jtfJumlahTahun.getText());
 double jumlahPinjaman =
 Double.parseDouble(jtfJumlahPinjaman.getText());

 // Menciptakan suatu objek hutang
 Hutang hutang = new Hutang(bunga, tahun, jumlahPinjaman);

 // Menghitung pembayaran bulanan dan pembayaran total
 jtfPembayaranBulanan.setText(String.format("%.2f",
 hutang.dapatPembayaranBulanan()));
 jtfPembayaranTotal.setText(String.format("%.2f",
 hutang.dapatPembayaranTotal()));
 }
 }

 public static void main(String[] args) {
 KalkulatorHutang frame = new KalkulatorHutang();
 frame.pack();
 frame.setTitle("KalkulatorHutang");
 frame.setLocationRelativeTo(null); // Pusat frame
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setVisible(true);
 }
}