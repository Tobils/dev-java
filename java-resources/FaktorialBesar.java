 import java.math.*;

 public class FaktorialBesar {
 public static void main(String[] args) {
 System.out.println("50! adalah \n" + faktorial(50));
 }

 public static BigInteger faktorial(long n) {
 BigInteger result = BigInteger.ONE;
 for (int i = 1; i <= n; i++)
 result = result.multiply(new BigInteger(i + ""));

 return result;
 }
 }