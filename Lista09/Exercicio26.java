//Ygor da Cruz Boueri de Souza
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;
public class Exercicio26 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Random rand = new Random();
      System.out.println("Quantidade de linhas e colunas: ");
      int x = sc.nextInt();
      ArrayList<Integer> order = new ArrayList<Integer>();
      int[][] n1 = new int[x][x];

      Collections.sort(order);

      System.out.println("Matriz: ");
      for (int i = 0; i < x; i++) {
         for (int j = 0; j < x; j++) {
            n1[i][j] = rand.nextInt(300);
            order.add(n1[i][j]);
         }
         Collections.sort(order);
         System.out.println(order);
         order.clear();
      }

      sc.close();
   }
}