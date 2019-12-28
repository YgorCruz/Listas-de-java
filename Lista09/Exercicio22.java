//Ygor da Cruz Boueri de Souza
import java.util.ArrayList;
import java.util.Scanner;
public class Exercicio22 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Quantidade de linhas e colunas: ");
      int x = sc.nextInt();
      ArrayList<Integer> prime = new ArrayList<Integer>();
      int[][] n1 = new int[x][x];
      int countPrime = 2;
      int count = 0;

      do {
         for (int i = 1; i <= countPrime; i++) {
            if (countPrime%i == 0) {
               count++;
            } else if (count > 2) {
               break;
            }
         }
         if (count == 2) {
            prime.add(countPrime);
         }
         count = 0;
         countPrime++;
      } while (prime.size() < x*x);

      count = 0;

      System.out.println("Matriz: ");
      for (int i = 0; i < x; i++) {
         for (int j = 0; j < x; j++) {
            n1[i][j] = prime.get(count);
            count++;
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