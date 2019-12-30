 public class PalindromeRekursif {
 public static boolean apaPalindrome(String s) {
 return apaPalindrome(s, 0, s.length() - 1);
 }

 public static boolean apaPalindrome(String s, int rendah, int tinggi) {
 if (tinggi <= rendah)// Kasus basis
 return true;
 else if (s.charAt(rendah) != s.charAt(tinggi)) // Kasus basis
 return false;
 else
 return apaPalindrome(s, rendah + 1, tinggi - 1);
 }

 public static void main(String[] args) {
 System.out.println("Apakah mama adalah suatu palindrome? "
 + apaPalindrome("mama"));
 System.out.println("Apakah papa suatu palindrome? "
 + apaPalindrome("papa"));
 System.out.println("Apakah a suatu palindrome? " + apaPalindrome("a"));
 System.out.println("Apakah aba suatu palindrome? " + apaPalindrome("aba"));
 System.out.println("Apakah ab suatu palindrome? " + apaPalindrome("ab"));
 }
 }
