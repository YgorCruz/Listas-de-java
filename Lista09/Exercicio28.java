//Ygor da Cruz Boueri de Souza
import java.util.Scanner;
public class Exercicio28 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      
      System.out.println("Quantidade de elementos do vetor base: ");
      int n = sc.nextInt();
      int[] vetor = new int[n];
      System.out.println("Vetor base: ");
      for (int i = 0; i < n; i++) {
         vetor[i] = sc.nextInt();
      }

      System.out.println("Matriz Gerada: ");
      for (int i = 0; i < n; i++) {
         System.out.print(vetor[i] + ", ");
         for (int j = 1; j <= vetor[i]+1; j++) {
            System.out.print(j + " ");
         }
         System.out.println();
      }
      sc.close();

   }
}