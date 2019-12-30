 public class IntegerMatrix extends GenericMatrix<Integer>{
 /** Mengimplementasikan metode add untuk menjumlahkan dua elemen matriks */
 protected Integer add(Integer o1, Integer o2){
 return o1 + o2;
 }

 /** Mengimplementasikan metode multiply untuk mengalikan
   * dua elemen matriks */
 protected Integer multiply(Integer o1, Integer o2){
 return o1 * o2;
 }

 /** Mengimplementasikan metode zero untuk menetapkan nol pada Integer */
 protected Integer zero()
 {
 return 0;
 }
 }