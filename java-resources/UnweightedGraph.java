 import java.util.*;

 public class UnweightedGraph<V> extends AbstractGraph<V> {
 /** Menciptakan suatu graf dari tepi dan verteks yang disimpan di dalam array */
 public UnweightedGraph(int[][] tepi, V[] verteks) {
 super(tepi, verteks);
 }

 /** Menciptakan suatu graf dari tepi dan verteks yang disimpan di dalam list */
 public UnweightedGraph(List<Edge> tepi, List<V> verteks) {
 super(tepi, verteks);
 }

 /** Menciptakan suatu graf untuk verteks integer 0, 1, 2 dan tepi list */
 public UnweightedGraph(List<Edge> tepi, int jumlahVerteks) {
 super(tepi, jumlahVerteks);
 }

 /** Menciptakan suatu graf untuk verteks integer 0, 1, 2 dan tepi array */
 public UnweightedGraph(int[][] tepi, int jumlahVerteks) {
 super(tepi, jumlahVerteks);
 }
 }