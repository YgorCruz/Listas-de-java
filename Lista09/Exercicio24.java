
//Ygor da Cruz Boueri de Souza
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.Collections;

public class Exercicio24 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Random rand = new Random();
      System.out.println("Quantidade de linhas e colunas: ");
      int x = sc.nextInt();
      ArrayList<Integer> order = new ArrayList<Integer>();
      int[][] n1 = new int[x][x];
      int count = 0;

      for (int i = 0; i < x * x; i++) {
         order.add(rand.nextInt(500));
      }

      Collections.sort(order);

      System.out.println("Matriz: ");
      for (int i = 0; i < x; i++) {
         for (int j = 0; j < x; j++) {
            n1[i][j] = order.get(count);
            count++;
            if (n1[i][j] < 10 && n1[i][j] > -10) {
               System.out.printf(" 0%d ", n1[i][j]);
            } else {
               System.out.printf(" %d ", n1[i][j]);
            }
         }
         System.out.println(" ");
      }

      sc.close();
   }
}