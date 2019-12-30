 import java.util.*;

 public class UjiTreeSetDenganKomparator {
 public static void main(String[] args) {
 // Menciptakan suatu set tree untuk objek-objek geometri menggunakan komparator
 Set<ObjekGeometri> set =
 new TreeSet<ObjekGeometri>(new KomparatorObjekGeometri());
 set.add(new PersegiPanjang(4, 5));
 set.add(new Lingkaran(40));
 set.add(new Lingkaran(40));
 set.add(new PersegiPanjang(4, 1));

 // Menampilkan objek-objek geometri di dalam set tree
 System.out.println("Suatu set terurut yang memuat objek-objek geometri");
 for (ObjekGeometri elemen: set)
 System.out.println("luas = " + elemen.dapatLuas());
 }
 }