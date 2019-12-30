 public class PalindromeRekursifMenggunakanSubstring {
 public static boolean apaPalindrome(String s) {
 if (s.length() <= 1) // Kasus basis
 return true;
 else if (s.charAt(0) != s.charAt(s.length() - 1)) // Kasus basis
 return false;
 else
 return apaPalindrome(s.substring(1, s.length() - 1));
 }

 public static void main(String[] args) {
 System.out.println("Apakah mama suatu palindrome? "
 + apaPalindrome("mama"));
 System.out.println("Apakah papa suatu palindrome? "
 + apaPalindrome("papa"));
 System.out.println("Apakah a suatu palindrome? " + apaPalindrome("a"));
 System.out.println("Apakah aba suatu palindrome? " +
 apaPalindrome("aba"));
 System.out.println("Apakah ab suatu palindrome? " + apaPalindrome("ab"));
 }
 }