 public class UjiObjekGeometri {
 /** Main method */
 public static void main(String[] args) {
 // Menciptakan dua objek geometri
 ObjekGeometri geoObjek1 = new Lingkaran(5);
 ObjekGeometri geoObjek2 = new PersegiPanjang(5, 3);

 System.out.println("Dua objek memiliki luas sama? " +
 luasSama(geoObjek1, geoObjek2));

 // Menampilkan lingkaran
 tampilObjekGeometri(geoObjek1);

 // Menampilkan persegi-panjang
 tampilObjekGeometri(geoObjek2);
 }

 /** Suatu metode untuk membandingkan luas dua objek geometri */
 public static boolean luasSama(ObjekGeometri geoObjek1,
 ObjekGeometri geoObjek2){
 return geoObjek1.dapatLuas() == geoObjek2.dapatLuas();
 }

 /** Suatu metode untuk menampilkan suatu objek geometri */
 public static void tampilObjekGeometri(ObjekGeometri objek){
 System.out.println();
 System.out.println("Luas adalah " + objek.dapatLuas());
 System.out.println("Keliling adalah " + objek.dapatKeliling());
 }
 }