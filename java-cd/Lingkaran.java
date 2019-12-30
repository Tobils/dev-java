public class Lingkaran extends ObjekGeometri{
  private double radius;

  public Lingkaran() {
  }

  public Lingkaran (double radius) {
    this.radius = radius;
  }

  public Lingkaran(double radius, String warna, boolean terisi) {
    this.radius = radius;
    dapatWarna(warna);
    tetapkanTerisi(terisi);
  }

  /** Mengembalikan radius */
  public double dapatRadius() {
    return radius;
  }

  /** Menetapkan suatu radius baru */
  public void tetapkanRadius(double radius) {
    this.radius = radius;
  }

  /** Mengembalikan luas */
  public double dapatLuas() {
    return radius * radius * Math.PI;
  }

  /** Mengembalikan diameter */
  public double dapatDiameter() {
    return 2 * radius;
  }

  /** Mengembalikan keliling */
  public double dapatKeliling() {
    return 2 * radius * Math.PI;
  }

  /* Menampilkan informasi lingkaran */
  public void tampilLingkaran() {
  System.out.println("Lingkaran diciptakan pada "+ dapatTanggalDiciptakan()  
   + " dan radiusnya adalah " + radius);
  }
}