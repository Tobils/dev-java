 public class UjiHapusPohonBiner {
 public static void main(String[] args) {
 BinaryTree<String> pohon = new BinaryTree<String>();
 pohon.insert("Gaby");
 pohon.insert("Marolop");
 pohon.insert("Taruli");
 pohon.insert("Adam");
 pohon.insert("Joni");
 pohon.insert("Poltak");
 pohon.insert("Dani");
 printTree(pohon);

 System.out.println("\nSetelah menghapus Gaby:");
 pohon.delete("Gaby");
 printTree(pohon);

 System.out.println("\nSetelah menghapus Adam:");
 pohon.delete("Adam");
 printTree(pohon);

 System.out.println("\nSetelah menghapus Marolop:");
 pohon.delete("Marolop");
 printTree(pohon);
 }

 public static void printTree(BinaryTree pohon) {
 // Menjelajah pohon
 System.out.print("Inorder (terurut): ");
 pohon.inorder();
 System.out.print("\nPostorder: ");
 pohon.postorder();
 System.out.print("\nPreorder: ");
 pohon.preorder();
 System.out.print("\nJumlah simpul adalah " + pohon.getSize());
 System.out.println();
 }
 }