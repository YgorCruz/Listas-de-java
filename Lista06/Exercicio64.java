import java.util.Scanner;
// Ygor da Cruz Boueri de Souza

public class Exercicio64 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int quant = sc.nextInt();
      int a = 0;
      int b = sc.nextInt();
      int c = sc.nextInt();

      System.out.println("0");
      for (int i = 0; i <= quant; i++) {
         System.out.println(c);
         c = a + b;
         a = b;
         b = c;
      }
   }
}