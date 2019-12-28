
//Ygor da Cruz Boueri de Souza
import java.util.Scanner;

public class Exercicio50 {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int init = scan.nextInt();
      int end = scan.nextInt();
      int divC;

      for (int i = init; i <= end; i++) {
         divC = 0;
         for (int k = 1; k <= i; k++) {
            if (i % k == 0) {
               divC++;
            }
         }
         if (divC == 2)
            System.out.println("primo: " + i);

      }
      scan.close();
   }
}