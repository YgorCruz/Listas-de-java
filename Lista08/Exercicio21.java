//Ygor da Cruz Boueri de Souza
import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio21 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      ArrayList<Integer> arr = new ArrayList<Integer>();

      for (int i = 0; i < 10; i++) {
         arr.add(sc.nextInt());
         if (arr.get(i)%2 != 0) {
            arr.set(i, arr.get(i)*2);
         }
      }

      System.out.println(arr);

      sc.close();
   }
}