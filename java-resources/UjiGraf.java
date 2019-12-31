 public class UjiGraf {
 public static void main(String[] args) {
String[] verteks = {"Balige", "Parapat", "Raya", "Tebing", "Siantar", 
  "Perdagangan", "Sipirok", "Tanjung", "Binjai", "Medan", "Asahan", 
  "Kisaran"};

 // Array tepi untuk graf pada Gambar 12.1
int[][] tepi = {
{0, 1}, {0, 3}, {0, 4},
{1, 0}, {1, 2}, {1, 4},
{2, 1}, {2, 4}, {2, 5}, {2, 6},
{3, 0}, {3, 4}, {3, 5}, {3, 8}, {3, 9},
{4, 0}, {4, 1}, {4, 2}, {4, 3}, {4, 5}, 
{5, 2}, {5, 3}, {5, 4}, {5, 6}, {5, 9}, {5, 10},
{6, 2}, {6, 5}, {6, 7}, {6, 10},
{7, 6}, {7, 10}, {7, 11}, 
{8, 3}, {8, 9}, 
{9, 3}, {9, 5}, {9, 8}, {9, 10},
{10, 5}, {10, 6}, {10, 7}, {10, 9}, {10, 11},
{11, 7}, {11, 10}
};


 Graph<String> graf1 =
 new UnweightedGraph<String>(tepi, verteks);
 System.out.println("Jumlah verteks di dalam graf1: "
 + graf1.getSize());
 System.out.println("Verteks dengan indeks 1 adalah "
 + graf1.getVertex(1));
 System.out.println("Indeks untuk Siantar adalah " +
 graf1.getIndex("Siantar"));
 System.out.println("Tepi untuk graf1:");
 graf1.printEdges();
 System.out.println("Matriks kebertetanggaan untuk graf1:");
 graf1.printAdjacencyMatrix();

 // List yang memuat objek-objek tepi untuk graf pada Gambar 12.2a
 String[] nama = {"Palma", "Juita", "Maria", "Cinthia", "Widy"};
 java.util.ArrayList<AbstractGraph.Edge> tepiList
 = new java.util.ArrayList<AbstractGraph.Edge>();
 tepiList.add(new AbstractGraph.Edge(0, 2));
 tepiList.add(new AbstractGraph.Edge(1, 2));
 tepiList.add(new AbstractGraph.Edge(2, 4));
 tepiList.add(new AbstractGraph.Edge(3, 4));
 // Menciptakan suatu graf dengan 5 verteks
  Graph<String> graf2 = new UnweightedGraph<String>
 (tepiList, java.util.Arrays.asList(nama));
 System.out.println("Jumlah verteks di dalam graf2: "
 + graf2.getSize());
 System.out.println("Tepu untuk graf2:");
 graf2.printEdges();
 System.out.println("\nMatriks kebertetanggaan untuk graf2:");
 graf2.printAdjacencyMatrix();

 for (int i = 0; i < 5; i++)
 System.out.println("verteks " + i + ": " + graf2.getVertex(i));
 }
 }