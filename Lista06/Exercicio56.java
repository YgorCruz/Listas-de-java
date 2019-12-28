
// Ygor da Cruz Boueri de Souza
import java.util.Scanner;

public class Exercicio56 {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int num = scan.nextInt();
      int sum = 0;

      for (int i = 1; i <= (num / 2) + 1; i++) {
         if (num % i == 0)
            sum += i;
      }
      if (sum == num)
         System.out.println("Eh perfeito");
      else
         System.out.println("Nao");
      scan.close();
   }
}