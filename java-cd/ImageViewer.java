 import java.awt.*;
 import javax.swing.*;

 public class ImageViewer extends JPanel{
 /** Memuat properti citra. */
 private java.awt.Image citra;

 /** Memuat nilai properti diregangkan. */
 private boolean diregangkan = true;

 /** Memuat nilai properti xKoordinat. */
 private int xKoordinat;

 /** Memuat nilai properti yKoordinat. */
 private int yKoordinat;

 /** Menciptakan ImageViewer kosong */
 public ImageViewer() {
 }

 /** Menciptakan suatu ImageViewer dengan objek Image tertentu */
 public ImageViewer(Image citra) {
 this.citra = citra;
 }

 protected void paintComponent(Graphics g){
 super.paintComponent(g);

 if (citra != null)
 if(apaDiregangkan())
 g.drawImage(citra, xKoordinat, yKoordinat,
 getWidth(), getHeight(), this);
 else
 g.drawImage(citra, xKoordinat, yKoordinat, this);
 }

 /** Mengembalikan nilai properti citra */
 public java.awt.Image getImage() {
 return citra;
 }

 /** Menetapkan suatu nilai baru untuk properti citra */
 public void tetapkanCitra(java.awt.Image citra) {
 this.citra = citra;
 repaint();
 }

 /** Mengembalikan nilai properti diregangkan */
 public boolean apaDiregangkan() {
 return diregangkan;
 }

 /** Menetapkan suatu nilai baru untuk properti diregangkan */
 public void tetapkanDiregangkan(boolean diregangkan) {
 this.diregangkan = diregangkan;
 repaint();
 }

 /** Mengembalikan nilai properti xKoordinat */
 public int dapatXKoordinat() {
 return xKoordinat;
 }

 /** Menetapkan suatu nilai baru untuk properti xKoordinat */
 public void tetapkanXKoordinat(int xKoordinat) {
 this.xKoordinat = xKoordinat;
 repaint();
 }

 /** Mengembalikan nilai properti yKoordinat */
 public int dapatYKoordinat() {
 return yKoordinat;
 }

 /** Menetapkan suatu nilai baru untuk properti yKoordinat */
 public void tetapkanYKoordinat(int yKoordinat) {
 this.xKoordinat = yKoordinat;
 repaint();
 }
 }