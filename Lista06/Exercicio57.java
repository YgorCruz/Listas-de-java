
//Ygor da Cruz Boueri de Souza
import java.util.Scanner;

public class Exercicio57 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      int f, c = 0, loop = 0;
      boolean l = true;

      System.out.print("Digite o termo final da sequência: ");
      f = scan.nextInt();

      while (l == true) {

         c++;

         int t = 0;

         for (int cont = 1; cont <= c; cont++) {

            if (c % cont == 0) {

               t += cont;

            }

         }

         if (c != 1) {

            if (t == c) {

               System.out.print(c + ",");
               loop++;

            }
            if (loop == f) {
               break;
            }
            
         }

      }

      scan.close();

   }

}