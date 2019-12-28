//Ygor da Cruz Boueri de Souza
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Exercicio20 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      ArrayList<Integer> arr = new ArrayList<Integer>();

      for (int i = 1; i < 10; i++) {
         arr.add(sc.nextInt());
      }
      Collections.sort(arr, Collections.reverseOrder());

      System.out.println(arr);

      sc.close();
   }
}