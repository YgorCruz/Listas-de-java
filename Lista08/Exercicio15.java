//Ygor da Cruz Boueri de Souza
import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio15 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = 5;
      int m = 10;
      int[] line1 = new int[n];
      int[] line2 = new int[m];
      ArrayList<Integer> line3 = new ArrayList<Integer>();
      int j = 0;

      System.out.println("array 1: ");
      for (int i = 0; i < n; i++) {
         line1[i] = sc.nextInt();
      }

      System.out.println("array 2: ");
      for (int i = 0; i < m; i++) {
         line2[i] = sc.nextInt();
      }

      while (line3.size() < n+m) {
         if (j >= n) {
            line3.add(line2[j]);
         } else {
            line3.add(line1[j]);
            line3.add(line2[j]);
            
         }
         j++;
      }

      System.out.println(line3);
      
      sc.close();
   }
}