
//Ygor da Cruz Boueri de Souza
import java.util.Scanner;

public class Exercicio51 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int quant = sc.nextInt();
      int a = 0;
      int b = 1;
      int c = 1;

      System.out.println("0");
      for (int i = 0; i <= quant; i++) {
         System.out.println(c);
         c = a + b;
         a = b;
         b = c;
      }
      sc.close();
   }
}