 public class Rumah implements Cloneable, Comparable{
 private int id;
 private double luas;
 private java.util.Date kapanDibangun;

 public Rumah(int id, double luas) {
 this.id = id;
 this.luas = luas;
 kapanDibangun = new java.util.Date();
 }

 public int dapatId() {
 return id;
 }

 public double dapatLuas() {
 return luas;
 }

 public java.util.Date dapatKapanDibangun() {
 return kapanDibangun;
 }

 /** Mengoverride metode klon protected yang didefinisikan dalam
     kelas Object, dan memperkuat aksesibilitasnya */
 public Object clone() throws CloneNotSupportedException {
 return super.clone();
 }

 /** Mengimplementasikan metode compareTo yang didefinisikan dalam Comparable */
 public int compareTo(Object o) {
 if (luas > ((Rumah)o).luas)
 return 1;
 else if (luas < ((Rumah)o).luas)
 return -1;
 else
 return 0;
 }
 }