 public abstract class GenericMatrix<E extends Number> {
 /** Metode abstrak untuk menjumlahkan dua elemen dari matriks */
 protected abstract E add(E o1, E o2);

 /** Metode abstrak untuk mengalikan dua elemen dari matriks */
 protected abstract E multiply(E o1, E o2);

 /** Metode abstrak untuk mendefinisikan nol untuk elemen matriks */
 protected abstract E zero();

 /** Menjumlahkan dua matriks */
 public E[][] addMatrix(E[][] matrix1, E[][] matrix2){
 // Memeriksa batas dua matriks
 if ((matrix1.length != matrix2.length) ||
 (matrix1[0].length != matrix2.length)) {
 throw new RuntimeException(
 "Matriks tidak memiliki dimensi yang sama");
 }

 E[][] result =
 (E[][])new Number[matrix1.length][matrix1[0].length];

 // Melakukan penjumlahan
 for (int i = 0; i < result.length; i++)
 for (int j = 0; j < result[i].length; j++) {
 result[i][j] = add(matrix1[i][j], matrix2[i][j]);
 }

 return result;
 }

 /** Mengalikan dua matriks */
 public E[][] multiplyMatrix(E[][] matrix1, E[][] matrix2){
 // Memeriksa batas
 if (matrix1[0].length != matrix2.length) {
 throw new RuntimeException(
 "Matriks tidak memiliki dimensi yang sama");
 }

 // Menciptakan matriks result
 E[][] result =
 (E[][])new Number[matrix1.length][matrix2[0].length];

 // Melakukan perkalian dua matriks
 for (int i = 0; i < result.length; i++) {
 for (int j = 0; j < result[0].length; j++) {
 result[i][j] = zero();

 for (int k = 0; k < matrix1[0].length; k++) {
 result[i][j] = add(result[i][j],
 multiply(matrix1[i][k], matrix2[k][j]));
 }
 }
 }

 return result;
 }

 /** Menampilkan matriks, operator, dan hasil */
 public static void printResult(
 Number[][] m1, Number[][] m2, Number[][] m3, char op){
 for (int i = 0; i < m1.length; i++) {
 for (int j = 0; j < m1[0].length; j++)
 System.out.print(" " + m1[i][j]);

 if (i == m1.length / 2)
 System.out.print( " " + op + " " );
 else
 System.out.print( " " );

 for (int j = 0; j < m2.length; j++)
 System.out.print(" " + m2[i][j]);

 if (i == m1.length / 2)
 System.out.print( " = " );
 else
 System.out.print( " " );

 for (int j = 0; j < m3.length; j++)
 System.out.print(m3[i][j] + " ");

 System.out.println();
 }
 }
 }