//Ygor da Cruz Boueri de Souza
import java.util.Scanner;
import java.util.Random;
public class Exercicio06 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Random rand = new Random();
      System.out.println("Quantidade de linhas: ");
      int x = sc.nextInt();
      System.out.println("Quantidade de colunas: ");
      int y = sc.nextInt();
      int n;
      int[] m = {-1, -1};
      int[][] n1 = new int[x][y];
      
      
      for (int i = 0; i < x; i++) {
         for (int j = 0; j < y; j++) {
            n1[i][j] = rand.nextInt(25);
         }
      }

      System.out.println("Escolha um numero: ");
      n = sc.nextInt();

      System.out.println("Matriz resultante: ");
      for (int i = 0; i < x; i++) {
         for (int j = 0; j < y; j++) {
            if (n1[i][j] < 10 && n1[i][j] > -10) {
               System.out.printf(" 0%d ",n1[i][j]);
            } else {
               System.out.printf(" %d ",n1[i][j]);
            }
            if (n == n1[i][j]) {
               m[0] = i;
               m[1] = j;
            }
         }
         System.out.println(" ");
      }
      if (m[0] != -1 && m[1] != -1) {
         System.out.println("Numero encontrado em: x = " + m[0] + ", y = " + m[1]);
      } else
      System.out.println("Numero NAO encontrado");
     
      sc.close();
   }
}