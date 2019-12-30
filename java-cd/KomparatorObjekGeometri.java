 import java.util.Comparator;

 public class KomparatorObjekGeometri
 implements Comparator<ObjekGeometri>, java.io.Serializable{
 public int compare(ObjekGeometri o1, ObjekGeometri o2){
 double luas1 = o1.dapatLuas();
 double luas2 = o2.dapatLuas();

 if (luas1 < luas2)
 return -1;
 else if (luas1 == luas2)
 return 0;
 else
 return 1;
 }
 }