//Ygor da Cruz Boueri de Souza
import java.util.Scanner;

public class Exercicio8 {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = 5;
      int[] line1 = new int[n];
      int sum = 0;
      
      for (int i = 0; i < n; i++) {
         line1[i] = scan.nextInt();
         if (line1[i] % 2 != 0) {
            sum += line1[i];
         }
      }

      System.out.println(sum == 0? "nao digitou numeros impares":sum);
      scan.close();
      
   }
}