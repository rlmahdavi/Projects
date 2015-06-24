import java.util.Scanner;
import java.util.ArrayList;

public class Fibo{
   public static void main(String[] args){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("How many terms should be displayed?");
      int term = keyboard.nextInt();
   
      ArrayList<Integer> sequence = new ArrayList<Integer>();
      sequence = fibonacci(sequence, term - 2, 1, 1); //term - 2 because first 2 terms are already displayed
      
      System.out.print("1 1 ");  //print terms 0 and 1
      for (Integer n: sequence){ //then print contents of the sequence
         System.out.print(n + " ");
      }
   }
   
   private static ArrayList<Integer> fibonacci(ArrayList<Integer> sequence, int term, int n_2, int n_1){
      if (term > 0){
         int n = n_2 + n_1;
         sequence.add(n);
         sequence = fibonacci(sequence, term - 1, n_1, n);
      }
      return sequence;
   }
}