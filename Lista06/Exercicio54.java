
// Ygor da Cruz Boueri de Souza
import java.util.Scanner;

public class Exercicio54 {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      int i, f, v[];

      System.out.print("Digite o termo inicial: ");
      i = scan.nextInt();
      System.out.print("Digite o termo final: ");
      f = scan.nextInt();
      v = new int[f + 1];

      for (int c = 0; c <= f; c++) {
         v[c] = (c < 2) ? (c) : (v[c - 2] + v[c - 1]);
      }
      for (int c = i; c <= f; c++) {
         if (c == f)
            System.out.print(v[c - 1]);
         else
            System.out.print(v[c - 1] + ",");
      }
      scan.close();
   }
}