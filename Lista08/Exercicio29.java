//Ygor da Cruz Boueri de Souza
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Exercicio29 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Random rand = new Random();
      System.out.println("Quantidade de termos do vetor random (>= 10): ");
      int n = sc.nextInt();
      int m = 10;
      int j;
      ArrayList<Integer> guess = new ArrayList<Integer>();

      for (int i = 0; i < n; i++) {
         j = rand.nextInt(500);
         if (guess.indexOf(j) == -1) {
            guess.add(j); 
         }
      }

      Collections.sort(guess);

      System.out.println("Voce tem 10 chances para acertar o numero");
      for (int i = 0; i < m; i++) {
         j = sc.nextInt();
         if (guess.indexOf(j) != -1) {
            System.out.println("ACERTOU!");
            System.out.println("Index do numero: " + guess.indexOf(j));
            System.out.println(guess);
            break;
         }
      }

      System.out.println("FIM DO PROGRAMA");

      sc.close();
   }
}