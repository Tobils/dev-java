 public class TestRasionalMatrix {
 public static void main(String[] args) {
 // Menciptakan dua array Rasional m1 dan m2
 Rasional[][] m1 = new Rasional[3][3];
 Rasional[][] m2 = new Rasional[3][3];
 for (int i = 0; i < m1.length; i++)
 for (int j = 0; j < m1[0].length; j++) {
 m1[i][j] = new Rasional(i + 1, j + 5);
 m2[i][j] = new Rasional(i + 1, j + 6);
 }

 // Mencitpakan suatu instans dari RasionalMatrix
 RasionalMatrix rationalMatrix = new RasionalMatrix();

 System.out.println("\nm1 + m2 adalah ");
 GenericMatrix.printResult(
 m1, m2, rationalMatrix.addMatrix(m1, m2), '+');

 System.out.println("\nm1 * m2 adalah ");
 GenericMatrix.printResult(
 m1, m2, rationalMatrix.multiplyMatrix(m1, m2), '*');
 }
 }