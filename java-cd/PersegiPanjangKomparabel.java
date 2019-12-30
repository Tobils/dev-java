 public class PersegiPanjangKomparabel extends PersegiPanjang
 implements Comparable{
 /** Construct a ComparableRectangle with specified properties */
 public PersegiPanjangKomparabel(double lebar, double tinggi) {
 super(lebar, tinggi);
 }

 /** Implement the compareTo method defined in Comparable */
 public int compareTo(Object o){
 if (dapatLuas() > ((PersegiPanjangKomparabel)o).dapatLuas())
 return 1;
 else if (dapatLuas() < ((PersegiPanjangKomparabel)o).dapatLuas())
 return -1;
 else
 return 0;
 }
 }