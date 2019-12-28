//Ygor da Cruz Boueri de Souza
import java.util.Scanner;
public class Exercicio01 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int x = 4;
      int y = 5;
      int[][] num = new int[x][y];
      
      for (int i = 0; i < x; i++) {
         for (int j = 0; j < y; j++) {
            num[i][j] = sc.nextInt();
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