 public class Rasional extends Number implements Comparable{
 // Bidang-bidang data untuk pembilang dan penyebut
 private long pembilang = 0;
 private long penyebut = 1;

 /** Menciptakan suatu angka rasional dengan properti default */
 public Rasional(){
 this(0, 1);
 }

 /** Menciptakan suatu rasional dengan pembilang and penyebut tertentu*/
 public Rasional(long pembilang, long penyebut){
 long gcd = gcd(pembilang, penyebut);
 this.pembilang = ((penyebut > 0) ? 1 : -1) * pembilang / gcd;
 this.penyebut = Math.abs(penyebut) / gcd;
 }

 /** Menemukan GCD atas dua angka */
 private static long gcd(long n, long d) {
 long n1 = Math.abs(n);
 long n2 = Math.abs(d);
 int gcd = 1;

 for (int k = 1; k <= n1 && k <= n2; k++) {
 if (n1 % k == 0 && n2 % k == 0)
 gcd = k;
 }

 return gcd;
 }

 /** Mengembalikan pembilang */
 public long dapatPembilang() {
 return pembilang;
 }

 /** Mengembalikan penyebut */
 public long dapatPenyebut() {
 return penyebut;
 }

 /** Menambahkan suatu angka rasional kepada rasional ini */
 public Rasional add(Rasional rasionalKedua){
 long n = pembilang * rasionalKedua.dapatPenyebut() +
 penyebut * rasionalKedua.dapatPembilang();
 long d = penyebut * rasionalKedua.dapatPenyebut();
 return new Rasional(n, d);
 }

 /** Mengurangi suatu angka rasional dari rasional ini */
 public Rasional subtract(Rasional rasionalKedua){
 long n = pembilang * rasionalKedua.dapatPenyebut()
 - penyebut * rasionalKedua.dapatPembilang();
 long d = penyebut * rasionalKedua.dapatPenyebut();
 return new Rasional(n, d);
 }

 /** Mengalikan suatu angka rasional dengan rasional ini */
 public Rasional multiply(Rasional rasionalKedua){
 long n = pembilang * rasionalKedua.dapatPembilang();
 long d = penyebut * rasionalKedua.dapatPenyebut();
 return new Rasional(n, d);
 }

 /** Membagi suatu angka rasional dari rasional ini */
 public Rasional divide(Rasional rasionalKedua){
 long n = pembilang * rasionalKedua.dapatPenyebut();
 long d = penyebut * rasionalKedua.pembilang;
 return new Rasional(n, d);
 }

 /** Mengoverride metode toString() */
 public String toString() {
 if (penyebut == 1)
 return pembilang + "";
 else
 return pembilang + "/" + penyebut;
 }

 /** Mengoverride metode equals dalam kelas Object */
 public boolean equals(Object parm1) {
 if ((this.subtract((Rasional)(parm1))).dapatPembilang() == 0)
 return true;
 else
 return false;
 }

 /** Mengimplementasikan metode abstrak intValue dalam java.lang.Number */
 public int intValue() {
 return (int)doubleValue();
 }

 /** Mengimplementasikan metode abstrak floatValue dalam java.lang.Number */
 public float floatValue() {
 return (float)doubleValue();
 }

 /** Mengimplementasikan metode abstrak doubleValue dalam java.lang.Number */
 public double doubleValue() {
 return pembilang * 1.0 / penyebut;
 }

 /** Mengimplementasikan metode abstrak longValue dalam java.lang.Number */
 public long longValue() {
 return (long)doubleValue();
 }

 /** Mengimplementasikan metode compareTo dalam java.lang.Comparable */
 public int compareTo(Object o) {
 if ((this.subtract((Rasional)o)).dapatPembilang() > 0)
 return 1;
 else if ((this.subtract((Rasional)o)).dapatPembilang() < 0)
 return -1;
 else
 return 0;
 }
  }