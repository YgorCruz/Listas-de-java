//Ygor da Cruz Boueri de Souza
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio6 {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n;

      do {
         n = scan.nextInt();
      } while (n <= 0 || n > 15);
      
      int[] line1 = new int[n];
      int[] line2 = new int[n];
      int[] lineSaver = new int[n];

      for (int i = 0; i < line1.length; i++) {
         line1[i] = scan.nextInt();
      }

      for (int i = 0; i < line2.length; i++) {
         line2[i] = scan.nextInt();
         if (line1[i] == line2[i]) {
            lineSaver[i] = i;
         } else {
            lineSaver[i] = -1;
         }
      }

      System.out.println(Arrays.toString(lineSaver));
      scan.close();
   }
}