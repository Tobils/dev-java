// package animals;

// public class Mamalia implements Animal
// {
//     public void eat(){
//         System.out.println("mamalia eats");
//     }

//     public void travel(){
//         System.out.println("mamalia travels");
//     }

//     public static void main(String[] args) {
//         Mamalia sapi = new Mamalia();
//         sapi.eat();
//         sapi.travel();
//     }
// }

package animals;
/* File name : MammalInt.java */

public class Mamalia implements Animal {

   public void eat() {
      System.out.println("Mammal eats");
   }

   public void travel() {
      System.out.println("Mammal travels");
   } 

   public int noOfLegs() {
      return 0;
} 