//Ygor da Cruz Boueri de Souza
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;
public class Exercicio27 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Random rand = new Random();
      System.out.println("Quantidade de linhas e colunas: ");
      int x = sc.nextInt();
      ArrayList<Integer> order = new ArrayList<Integer>();
      int[][] n1 = new int[x][x];
      int swap;

      Collections.sort(order);

      System.out.println("Matriz: ");
      for (int i = 0; i < x; i++) {
         for (int j = 0; j < x; j++) {
            n1[i][j] = rand.nextInt(300);
            System.out.print(" " + n1[i][j]);
         }
         System.out.println(" ");
      }

      for (int i = 0; i < x; i++) {
         for (int test = 0; test < x-1; test++) {
            for (int j = 0; j < x-1; j++) {
               if (n1[j][i] > n1[j+1][i]) {
                  swap = n1[j+1][i];
                  n1[j+1][i] = n1[j][i];
                  n1[j][i] = swap;   
               }
            }
         }
      }
         System.out.println();
      System.out.println("Matriz: ");
      for (int i = 0; i < x; i++) {
         for (int j = 0; j < x; j++) {
            System.out.print(" " + n1[i][j]);
         }
         System.out.println(" ");
      }
      sc.close();

   }
}