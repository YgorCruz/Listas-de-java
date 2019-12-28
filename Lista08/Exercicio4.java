//Ygor da Cruz Boueri de Souza
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio4 {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n;

      do {
         n = scan.nextInt();
      } while (n <= 0 || n > 20);
      
      String[] str = new String[n];

      for (int i = 0; i < str.length; i++) {
         str[i] = scan.nextLine();
      }

      System.out.println(Arrays.toString(str));
      scan.close();
   }
}