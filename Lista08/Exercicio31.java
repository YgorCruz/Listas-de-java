//Ygor da Cruz Boueri de Souza
import java.util.Scanner;
import java.util.Arrays;

public class Exercicio31 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Quantidade de termos do vetor (<= 10): ");
      int n = sc.nextInt();
      String[] str = new String[n];
      
      System.out.println("Entre com os nomes: ");
      
      for (int i = 0; i < n; i++) {
         str[i] = sc.next();
         System.out.println(str[i]);
      }
      
      Arrays.sort(str);

      System.out.println(Arrays.toString(str));

      sc.close();
   }
}