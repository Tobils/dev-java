 public class RasionalMatrix extends GenericMatrix<Rasional>{
 /** Mengimplementasikan metode add untuk menjumlahkan dua elemen rasional */
 protected Rasional add(Rasional r1, Rasional r2){
 return r1.add(r2);
 }

 /** Mengimplementasikan metode multiply untuk mengalikan
   * dua elemen rasional */
 protected Rasional multiply(Rasional r1, Rasional r2){
 return r1.multiply(r2);
 }

 /** Mengimplementasikan metode zero untuk menetapkan nol pada Rasional */
 protected Rasional zero(){
 return new Rasional(0,1);
 }
 }