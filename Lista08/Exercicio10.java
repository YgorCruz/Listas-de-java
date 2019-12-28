//Ygor da Cruz Boueri de Souza
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio10 {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = 5;
      int[] line1 = new int[n];
      int[] line2 = new int[n];
      int[] line3 = new int[n*2];

      System.out.println("array 1: ");
      for (int i = 0; i < n; i++) {
         line1[i] = scan.nextInt();
      }

      System.out.println("array 2: ");
      for (int i = 0; i < n; i++) {
         line2[i] = scan.nextInt();
      }

      for (int i = 0; i < n*2; i++) {
         line3[i] = i>=5?line2[i-5]:line1[i];
      }
      

      System.out.println(Arrays.toString(line3));

      scan.close();
   }
}