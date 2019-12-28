
//Ygor da Cruz Boueri de Souza
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio7 {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int[] line1 = new int[n];

      for (int i = 0; i < line1.length; i++) {
         line1[i] = scan.nextInt();
      }

      Arrays.sort(line1);

      System.out.println(line1[0] + " " + line1[line1.length - 1]);
      scan.close();
   }
}