//Ygor da Cruz Boueri de Souza
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class Exercicio08 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Random rand = new Random();
      System.out.println("Quantidade de linhas: ");
      int x = sc.nextInt();
      System.out.println("Quantidade de colunas: ");
      int y = sc.nextInt();
      ArrayList<Integer> par = new ArrayList<Integer>();
      ArrayList<Integer> impar = new ArrayList<Integer>();
      int[][] n1 = new int[x][y];

      System.out.println("Matriz resultante: ");
      for (int i = 0; i < x; i++) {
         for (int j = 0; j < y; j++) {
            n1[i][j] = rand.nextInt(25);
            if (n1[i][j]%2 == 0) {
               par.add(n1[i][j]);
            }else {
               impar.add(n1[i][j]);
            }

            if (n1[i][j] < 10 && n1[i][j] > -10) {
               System.out.printf(" 0%d ",n1[i][j]);
            } else {
               System.out.printf(" %d ",n1[i][j]);
            }
         }
         System.out.println(" ");
      }

      System.out.println("Pares: " + par);
      System.out.println("Impares: " + impar);
     
      sc.close();
   }
}