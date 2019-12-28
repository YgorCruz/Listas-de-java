//Ygor da Cruz Boueri de Souza
import java.util.Scanner;
import java.util.Random;
public class Exercicio04 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Random rand = new Random();
      int x = sc.nextInt();
      int y = sc.nextInt();
      int n = sc.nextInt();
      int[][] num = new int[x][y];
      
      for (int i = 0; i < x; i++) {
         for (int j = 0; j < y; j++) {
            num[i][j] = rand.nextInt(n);
         }
      }

      for (int i = 0; i < x; i++) {
         for (int j = 0; j < y; j++) {
            if (num[i][j] < 10 && num[i][j] > -10) {
               System.out.printf(" 0%d ",num[i][j]);
            } else {
               System.out.printf(" %d ",num[i][j]);
            }
         }
         System.out.println(" ");
      }
      
      sc.close();
   }
}