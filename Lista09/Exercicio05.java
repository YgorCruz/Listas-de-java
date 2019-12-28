
//Ygor da Cruz Boueri de Souza
import java.util.Scanner;

public class Exercicio05 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Quantidade de linhas: ");
      int x = sc.nextInt();
      System.out.println("Quantidade de colunas: ");
      int y = sc.nextInt();
      int[][] n1 = new int[x][y];
      int[][] n2 = new int[x][y];

      System.out.println("Dados da Matriz 1: ");
      for (int i = 0; i < x; i++) {
         for (int j = 0; j < y; j++) {
            n1[i][j] = sc.nextInt();
         }
      }

      System.out.println("Dados da Matriz 2: ");
      for (int i = 0; i < x; i++) {
         for (int j = 0; j < y; j++) {
            n2[i][j] = sc.nextInt() + n1[i][j];
         }
      }

      for (int i = 0; i < x; i++) {
         for (int j = 0; j < y; j++) {
            if (n2[i][j] < 10 && n2[i][j] > -10) {
               System.out.printf(" 0%d ", n2[i][j]);
            } else {
               System.out.printf(" %d ", n2[i][j]);
            }
         }
         System.out.println(" ");
      }

      sc.close();
   }
}