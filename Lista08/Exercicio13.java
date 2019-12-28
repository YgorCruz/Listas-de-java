//Ygor da Cruz Boueri de Souza
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio13 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = 5;
      int m = 10;
      int[] line1 = new int[n];
      int[] line2 = new int[m];
      int[] line3 = new int[n+m];

      System.out.println("array 1: ");
      for (int i = 0; i < n; i++) {
         line1[i] = sc.nextInt();
      }

      System.out.println("array 2: ");
      for (int i = 0; i < m; i++) {
         line2[i] = sc.nextInt();
      }

      for (int i = 0; i < n+m; i++) {
         line3[i] = i>=5?line2[i-5]:line1[i];
      }
      

      System.out.println(Arrays.toString(line3));

      sc.close();
   }
}