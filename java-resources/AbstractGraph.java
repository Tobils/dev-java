 import java.util.*;

 public abstract class AbstractGraph<V> implements Graph<V> {
 protected List<V> verteks; // Menyimpan verteks-verteks
 protected List<List<Integer>> tetangga; // List kebertetanggaan

 /** Menciptakan suatu graf dari semua tepi dan verteks yang disimpan di dalam array */
 protected AbstractGraph(int[][] tepi, V[] verteks) {
 this.verteks = new ArrayList<V>();
 for (int i = 0; i < verteks.length; i++)
 this.verteks.add(verteks[i]);

 createAdjacencyLists(tepi, verteks.length);
 }

 /** Menciptakan suatu graf dari semua tepi dan verteks yang disimpan di dalam List */
 protected AbstractGraph(List<Edge> tepi, List<V> verteks) {
 this.verteks = verteks;
 createAdjacencyLists(tepi, verteks.size());
 }

 /** Menciptakan suatu graf untuk verteks-verteks integer 0, 1, 2 dan list tepi */
 protected AbstractGraph(List<Edge> tepi, int jumlahVerteks) {
 verteks = new ArrayList<V>(); // Menciptakan verteks
 for (int i = 0; i < jumlahVerteks; i++) {
 verteks.add((V)(new Integer(i))); // verteks adalah {0, 1, ...}
 }
 createAdjacencyLists(tepi, jumlahVerteks);
 }

 /** Menciptakan suatu graf dari verteks-verteks integer 0, 1, dan array tepi */
 protected AbstractGraph(int[][] tepi, int jumlahVerteks) {
 verteks = new ArrayList<V>(); // Menciptakan verteks
 for (int i = 0; i < jumlahVerteks; i++) {
 verteks.add((V)(new Integer(i))); // verteks adalah {0, 1, ...}
 }
 createAdjacencyLists(tepi, jumlahVerteks);
 }

 /** Menciptakan list kebertetanggaan untuk setiap verteks */
 private void createAdjacencyLists(
 int[][] tepi, int jumlahVerteks) {
 // Menciptakan suatu list berantai
 tetangga = new ArrayList<List<Integer>>();
 for (int i = 0; i < jumlahVerteks; i++) {
 tetangga.add(new ArrayList<Integer>());
 }

 for (int i = 0; i < tepi.length; i++) {
 int u = tepi[i][0];
 int v = tepi[i][1];
 tetangga.get(u).add(v);
 }
 }

 /** Menciptakan list kebertetanggaaan untuk setiap verteks */
 private void createAdjacencyLists(
 List<Edge> tepi, int jumlahVerteks) {
 // Menciptakan suatu list berantai
 tetangga = new ArrayList<List<Integer>>();
 for (int i = 0; i < jumlahVerteks; i++) {
 tetangga.add(new ArrayList<Integer>());
 }

 for (Edge tepi1: tepi) {
 tetangga.get(tepi1.u).add(tepi1.v);
 }
 }

 /** Mengembalikan jumlah verteks di dalam graf */
 public int getSize() {
 return verteks.size();
 }

 /** Mengembalikan verteeks-verteks di dalam graf */
 public List<V> getVertices() {
 return verteks;
 }

 /** Mengembalikan objek untuk verteks tertentu */
 public V getVertex(int indeks) {
 return verteks.get(indeks);
 }

 /** Mengembalikan indeks untuk objek verteks tertentu */
 public int getIndex(V v) {
 return verteks.indexOf(v);
 }

 /** Mengembalikan tetangga-tetangga verteks dengan indeks tertentu */
 public List<Integer> getNeighbors(int indeks) {
 return tetangga.get(indeks);
 }

 /** Mengembalikan derajat untuk verteks tertentu */
 public int getDegree(int v) {
 return tetangga.get(v).size();
 }

 /** Mengembalikan matriks kebertetanggaan */
 public int[][] getAdjacencyMatrix() {
 int[][] matriksKebertetanggaan = new int[getSize()][getSize()];

 for (int i = 0; i < tetangga.size(); i++) {
 for (int j = 0; j < tetangga.get(i).size(); j++) {
 int v = tetangga.get(i).get(j);
 matriksKebertetanggaan[i][v] = 1;
 }
 }

 return matriksKebertetanggaan;
 }

 /** Menampilkan matriks kebertetanggaan */
 public void printAdjacencyMatrix() {
 int[][] matriksKebertetanggaan = getAdjacencyMatrix();
 for (int i = 0; i < matriksKebertetanggaan.length; i++) {
 for (int j = 0; j < matriksKebertetanggaan[0].length; j++) {
 System.out.print(matriksKebertetanggaan[i][j] + " ");
 }

 System.out.println();
 }
 }

 /** Menampilkan semua tepi */
 public void printEdges() {
 for (int u = 0; u < tetangga.size(); u++) {
 System.out.print("Verteks " + u + ": ");
 for (int j = 0; j < tetangga.get(u).size(); j++) {
 System.out.print("(" + u + ", " +
 tetangga.get(u).get(j) + ") ");
 }
 System.out.println();
 }
 }

 /** Edge sebagai kelas inner di dalam kelas AbstractGraph */
 public static class Edge {
 public int u; // Verteks awal dari tepi
 public int v; // Verteks akhir dari tepi

 /** Menciptakan suatu tepi untuk (u, v) */
 public Edge(int u, int v) {
 this.u = u;
 this.v = v;
 }
 }

 /** Mendapatkan suatu pohon DFS mulai dari vertkes v */
 /** Akan didiskusikan pada bagian 12.6 */
 public Tree dfs(int v) {
 List<Integer> urutanPencarian = new ArrayList<Integer>();
 int[] orangtua = new int[verteks.size()];
 for (int i = 0; i < orangtua.length; i++)
 orangtua[i] = -1; // Menginisialisasi orangtua[i] dengan -1

 // Menandai verteks yang dikunjungi
 boolean[] isVisited = new boolean[verteks.size()];

 // Mencari secara rekursif
 dfs(v, orangtua, urutanPencarian, isVisited);

 // Menghasilkan suatu pohon pencarian
 return new Tree(v, orangtua, urutanPencarian);
 }

 /** Metode rekursif untuk pencarian DFS */
 private void dfs(int v, int[] orangtua, List<Integer> urutanPencarian,
 boolean[] isVisited) {
 // Menyimpan verteks yang dikunjungi
 urutanPencarian.add(v);
 isVisited[v] = true; // Verteks v dikunjungi

 for (int i : tetangga.get(v)) {
 if (!isVisited[i]) {
 orangtua[i] = v; // Orangtua dari verteks i adalah v
 dfs(i, orangtua, urutanPencarian, isVisited); // Pencarian rekursif
 }
 }
 }

 /** Memulai pencarian bfs dari verteks v */
 /** Akan didiskusikan dalam bagian 12.7 */
 public Tree bfs(int v) {
 List<Integer> urutanPencarian = new ArrayList<Integer>();
 int[] orangtua = new int[verteks.size()];
 for (int i = 0; i < orangtua.length; i++)
 orangtua[i] = -1; // Menginisialisasi orangtua[i] dengan -1

 java.util.LinkedList<Integer> antrian =
 new java.util.LinkedList<Integer>(); // list digunakan sebagai suatu antrian
 boolean[] isVisited = new boolean[verteks.size()];
 antrian.offer(v); // Membuat v sebagai antrian
 isVisited[v] = true; // Menandainya karena dikunjungi

 while (!antrian.isEmpty()) {
 int u = antrian.poll(); // Membongkar antrian ke u
 urutanPencarian.add(u); // Mencari u
 for (int w : tetangga.get(u)) {
 if (!isVisited[w]) {
 antrian.offer(w); // // Membuat w sebagai antrian
 orangtua[w] = u; // Orangtua dari w adalah u
 isVisited[w] = true; // Menandainya karena dikunjungi
 }
 }
 }

 return new Tree(v, orangtua, urutanPencarian);
 }

 /** Tree sebagai kelas inner di dalam kelas AbstractGraph */
 /** Akan didiskusikan pada bagian 12.5 */
 public class Tree {
 private int akar; // Akar pohon
 private int[] orangtua; // Menyimpan orangtua untuk setiap verteks
 private List<Integer> urutanPencarian; // Menyimpan urutan pencarian

 /** Menciptakan suatu pohon dengan akar, orangtua, dan urutanPencarian */
 public Tree(int akar, int[] orangtua, List<Integer> urutanPencarian) {
 this.akar = akar;
 this.orangtua = orangtua;
 this.urutanPencarian = urutanPencarian;
 }

 /** Menciptakan suatu pohon dengan akar dan orangtua
   * tanpa urutan yang ditentukan */
 public Tree(int akar, int[] orangtua) {
 this.akar = akar;
 this.orangtua = orangtua;
 }

 /** Mengembalikan akar dari pohon */
 public int getRoot() {
 return akar;
 }

 /** Memuat orangtua dari verteks v */
 public int getParent(int v) {
 return orangtua[v];
 }

 /** Mengembalikan suatu array yang memuat urutan pencarian */
 public List<Integer> getSearchOrders() {
 return urutanPencarian;
 }

 /** Mengembalikan jumlah verteks yang ditemukan */
 public int getNumberOfVerticesFound() {
 return urutanPencarian.size();
 }

 /** Mengembalikan jalur verteks dari suatu indeks verteks ke akar */
 public List<V> getPath(int indeks) {
 ArrayList<V> jalur = new ArrayList<V>();

 do {
 jalur.add(verteks.get(indeks));
 indeks = orangtua[indeks];
 }
 while (indeks != -1);

 return jalur;
 }

 /** Menampilkan suatu jalur dari akar ke verteks v */
 public void printPath(int indeks) {
 List<V> jalur = getPath(indeks);
 System.out.print("Suatu jalur dari " + verteks.get(akar) + " ke " +
 verteks.get(indeks) + ": ");
 for (int i = jalur.size() - 1; i >= 0; i--)
 System.out.print(jalur.get(i) + " ");
 }

 /** Menampilkan keseluruhan pohon */
 public void printTree() {
 System.out.println("Akar adalah: " + verteks.get(akar));
 System.out.print("Tepi-tepi: ");
 for (int i = 0; i < orangtua.length; i++) {
 if (orangtua[i] != -1) {
 // Menampilkan suatu tepi
 System.out.print("(" + verteks.get(orangtua[i]) + ", " +
 verteks.get(i) + ") ");
 }
 }
 System.out.println();
 }
 }
 }
