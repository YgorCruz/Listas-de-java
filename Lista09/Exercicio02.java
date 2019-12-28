//Ygor da Cruz Boueri de Souza
import java.util.Scanner;
import java.util.Random;
public class Exercicio02 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Random rand = new Random();
      int x = 6;
      int y = 3;
      int[][] num = new int[x][y];
      
      for (int i = 0; i < x; i++) {
         for (int j = 0; j < y; j++) {
            num[i][j] = rand.nextInt(100);
         }
      }

      for (int i = 0; i < x; i++) {
         for (int j = 0; j < y; j++) {
            System.out.printf(" %d ",num[i][j]);
         }
         System.out.println(" ");
      }
      
      sc.close();
   }
}