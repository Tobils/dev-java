 public interface Graph<V> {
 /** Mengembalikan jumlah verteks di dalam graf */
 public int getSize();

 /** Mengembalikan verteks-verteks di dalam graf */
 public java.util.List<V> getVertices();

 /** Mengembalikan objek untuk indeks verteks tertentu */
 public V getVertex(int index);

 /** Mengembalikan indeks untuk objek verteks tertentu */
 public int getIndex(V v);

 /** Mengembalikan tetangga-tetangga verteks dengan indeks tertentu */
 public java.util.List<Integer> getNeighbors(int index);

 /** Mengembalikan derajat suatu verteks tertentu */
 public int getDegree(int v);

 /** Mengembalikan matriks kebertetanggaan */
 public int[][] getAdjacencyMatrix();

 /** Menampilkan matriks kebertetanggaan */
 public void printAdjacencyMatrix();

 /** Menampilkan tepi-tepi */
 public void printEdges();

 /** Mendapatkan pohon pencarian depth-first */
 public AbstractGraph<V>.Tree dfs(int v);

 /** Mendapatkan pohon pencarian breadth-first */
 public AbstractGraph<V>.Tree bfs(int v);
 }