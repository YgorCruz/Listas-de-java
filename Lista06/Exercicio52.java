
//Ygor da Cruz Boueri de Souza
import java.util.Scanner;

public class Exercicio52 {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int quant = scan.nextInt();
      int a = 0;
      int b = 1;
      int c = 1;

      for (int i = 0; i <= quant + 1; i++) {
         c = a + b;
         a = b;
         b = c;
         if (c == quant) {
            System.out.println("Fibonnaci");
         }
      }
      scan.close();
   }
}