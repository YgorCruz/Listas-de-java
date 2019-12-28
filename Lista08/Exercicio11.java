//Ygor da Cruz Boueri de Souza
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio11 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = 5;
      int[] line1 = new int[n];
      int[] line2 = new int[n];
      int[] line3 = new int[n*2];
      int j = 0;

      System.out.println("array 1: ");
      for (int i = 0; i < n; i++) {
         line1[i] = sc.nextInt();
      }

      System.out.println("array 2: ");
      for (int i = 0; i < n; i++) {
         line2[i] = sc.nextInt();
      }

      for (int i = 1; i < n*2; i+=2) {
         line3[i] = line2[j];
         line3[i-1] = line1[j];
         j++;
      }
      System.out.println(Arrays.toString(line3));

      sc.close();
   }
}