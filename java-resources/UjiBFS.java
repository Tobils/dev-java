 public class UjiBFS {
 public static void main(String[] args) {
 String[] verteks = {"Balige", "Parapat", "Raya", "Tebing", "Siantar", 
     "Perdagangan", "Sipirok", "Tanjung", "Binjai", "Medan", "Asahan", 
     "Kisaran"};

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

 Graph<String> graf =
 new UnweightedGraph<String>(tepi, verteks);
 AbstractGraph<String>.Tree bfs = graf.bfs(3);// 3 adalah Tebing

 java.util.List<Integer> urutanPencarian = bfs.getSearchOrders();
 System.out.println(bfs.getNumberOfVerticesFound() +
 " verteks-verteks dicari dalam urutan ini:");
 for (int i = 0; i < urutanPencarian.size(); i++)
 System.out.println(graf.getVertex(urutanPencarian.get(i)));

 for (int i = 0; i < urutanPencarian.size(); i++)
 if (bfs.getParent(i) != -1)
 System.out.println("orangtua dari " + graf.getVertex(i) +
 " adalah " + graf.getVertex(bfs.getParent(i)));
 }
 }