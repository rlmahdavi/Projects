import java.util.Scanner;
import java.lang.Math;

public class PrimeNumbers{
   private static int x = 1;

   public static void main(String[] args){
      Scanner keyboard = new Scanner(System.in);

      String cont = "";
      
      while (cont != "q"){
         System.out.println(nextPrime());
         System.out.print("Enter q to quit, or any other key to continue");
         cont = keyboard.nextLine();
      }
   }
   
   private static int nextPrime(){
      do {
         x++;
      }while(!isPrime(x));
      return x;
   }

   private static boolean isPrime(int x){
      for (int i = 2; i < x; i++){
         //standard optimization: don't look for anything >sqrt(x)
         if (Math.sqrt(x) < i) { return true; }
         if (x % i == 0) { return false; }
      }
      return true;
   }  
}