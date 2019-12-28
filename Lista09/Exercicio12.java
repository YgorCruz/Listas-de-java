//Ygor da Cruz Boueri de Souza
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Exercicio12 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Random rand = new Random();
      System.out.println("Quantidade de linhas e colunas: ");
      int x = sc.nextInt();
      // System.out.println("Quantidade de colunas: ");
      // int y = sc.nextInt();
      ArrayList<Integer> diagonal = new ArrayList<Integer>();
      int[][] n1 = new int[x][x];

      System.out.println("Diagonal resultante: ");
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

      for (int i = 0; i < x; i++) {
         for (int j = 0; j < x; j++) {
            if (i == j) {
               if (i-1 < 0) {
                  diagonal.add(n1[x-1][j]);
               } else {
                  diagonal.add(n1[i-1][j]);
               }
               
            }
         }
         
      }

      System.out.println(diagonal);
     
      sc.close();
   }
}