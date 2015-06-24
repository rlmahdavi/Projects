import java.util.Scanner;

public class StringReverser{
   public static void main(String[] args){
      Scanner keyboard = new Scanner(System.in);
      String input = keyboard.nextLine();
      System.out.println(reverseString(input));
      System.out.println(reverseInPlace(input));
      
   }

   private static String reverseString(String input){
      String reversed = "";
      for (int i = input.length() - 1; i >= 0; i--){
         reversed += input.charAt(i);
      }
      return reversed;
   }

   //this seems kinda pointless since java doesn't let you set invidivual chars in a string
   private static String reverseInPlace(String input){
      char temp; //for swapping
      char[] inputArray = input.toCharArray(); //java strings are not arrays of chars
      
      //swap first with last, then work inward
      for (int i = 0; i < input.length()/2; i++){ //only go to middle
         temp = inputArray[i];
         inputArray[i] = inputArray[input.length() - i - 1];
         inputArray[input.length() - i - 1] = temp;
      }
      
      String output = new String(inputArray);
      return output;
   }

}