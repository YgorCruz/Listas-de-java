import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Fernando Ramos de Paula Marques
 */
public class Ex29 {

   public static void main(String[] args) {
      //Scanner sc = new Scanner(System.in);
      Random rand = new Random();
      char[] randAlphaArray = new char[100];
      for (int i = 0; i < randAlphaArray.length; i++) {
         randAlphaArray[i] = (char)(rand.nextInt(26)+97);
      }
      String randString = new String(randAlphaArray);

      System.out.println(randString);
      
   }
}