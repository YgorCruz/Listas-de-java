//Ygor da Cruz Boueri de Souza
import java.util.Scanner;
import java.util.Random;
public class Exercicio09 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Random rand = new Random();
      System.out.println("Quantidade de linhas e colunas: ");
      int x = sc.nextInt();
      // System.out.println("Quantidade de colunas: ");
      // int y = sc.nextInt();
      int[][] n1 = new int[x][x];

      System.out.println("Diagonal resultante: ");
      for (int i = 0; i < x; i++) {
         
            n1[i][i] = rand.nextInt(25);
            
            if (n1[i][i] < 10 && n1[i][i] > -10) {
               System.out.printf(" 0%d ",n1[i][i]);
            } else {
               System.out.printf(" %d ",n1[i][i]);
            }
         
         System.out.println(" ");
      }

      sc.close();
     
   }
}