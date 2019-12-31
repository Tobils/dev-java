 public class DemoTipeTerkekang {
 public static void main(String[] args ) {
 PersegiPanjang persegipanjang = new PersegiPanjang(2, 2);
 Lingkaran lingkaran = new Lingkaran(2);

 System.out.println("Luas sama? " +
 DemoTipeTerkekang.<ObjekGeometri>luasSama(persegipanjang, lingkaran));
 }

 public static <E extends ObjekGeometri> boolean luasSama(
 E objek1, E objek2) {
 return objek1.dapatLuas() == objek2.dapatLuas();
 }
 }
