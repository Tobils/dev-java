 public class UjiPohonBiner {
 public static void main(String[] args) {
 // Menciptakan suatu pohon biner
 BinaryTree<String> pohon = new BinaryTree<String>();
 pohon.insert("Gaby");
 pohon.insert("Marolop");
 pohon.insert("Taruli");
 pohon.insert("Adam");
 pohon.insert("Joni");
 pohon.insert("Poltak");
 pohon.insert("Dani");

 // Menjelajah pohon
 System.out.print("Inorder (terurut): ");
 pohon.inorder();
 System.out.print("\nPostorder: ");
 pohon.postorder();
 System.out.print("\nPreorder: ");
 pohon.preorder();
 System.out.print("\nJumlah simpul " + pohon.getSize());

 // Mencari suatu elemen
 System.out.print("\nApakah Poltak di dalam pohon? " +
 pohon.search("Poltak"));

 // Mendapatkan suatu jalur dari akar ke Aurora
 System.out.print("\nSuatu jalur dari akar ke Poltak adalah: ");
 java.util.ArrayList<BinaryTree.TreeNode<String>> jalur
 = pohon.path("Poltak");
 for (int i = 0; jalur != null && i < jalur.size(); i++)
 System.out.print(jalur.get(i).elemen + " ");

 Integer[] angka = {2, 4, 3, 1, 8, 5, 6, 7};
 BinaryTree<Integer> intTree = new BinaryTree<Integer>(angka);
 System.out.print("\nInorder (terurut): ");
 intTree.inorder();
 }
 }