//Ygor da Cruz Boueri de Souza
import java.util.Scanner;
import java.util.Random;
public class Exercicio21 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Random rand = new Random();
      System.out.println("Quantidade de linhas e colunas: ");
      int x = sc.nextInt();
      System.out.println("Numero para multiplicar a matriz: ");
      int m = sc.nextInt();
      int[][] n1 = new int[x][x];
      int[][] n2 = new int[x][x];

      System.out.println("Diagonal resultante 1: ");
      for (int i = 0; i < x; i++) {
         for (int j = 0; j < x; j++) {
            n1[i][j] = rand.nextInt(25);
            
            if (n1[i][j] < 10 && n1[i][j] > -10) {
               System.out.printf(" 0%d ",n1[i][j]);
            } else {
               System.out.printf(" %d ",n1[i][j]);
            }
         }
         System.out.println(" ");
      }

      System.out.println("Diagonal resultante 2: ");
      for (int i = 0; i < x; i++) {
         for (int j = 0; j < x; j++) {
            n2[i][j] = rand.nextInt(25);
            n1[i][j] += n2[i][j];
            n1[i][j] *= m;
            
            if (n2[i][j] < 10 && n2[i][j] > -10) {
               System.out.printf(" 0%d ",n2[i][j]);
            } else {
               System.out.printf(" %d ",n2[i][j]);
            }
         }
         System.out.println(" ");
      }

      System.out.println("Diagonal resultante 2: ");
      for (int i = 0; i < x; i++) {
         for (int j = 0; j < x; j++) {
            if (n1[i][j] < 10 && n1[i][j] > -10) {
               System.out.printf(" 0%d ",n1[i][j]);
            } else {
               System.out.printf(" %d ",n1[i][j]);
            }
         }
         System.out.println(" ");
      }

      sc.close();
   }
}