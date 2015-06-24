/*
Write a program that prints the numbers from 1 to 100
but for multiples of 3, print fizz and multiples of 5, print buzz
for both, print FizzBuzz
*/


public class FizzBuzz{
   public static void main(String[] args){
      for (int i = 1; i < 100; i++){
         String output = "";
         if (i % 3 == 0) { output = output.concat("Fizz"); }
         if (i % 5 == 0) { output = output.concat("Buzz"); }
         if (output == "") { output = output.concat(Integer.toString(i)); }
         System.out.print(output + " ");
      }
   }
}