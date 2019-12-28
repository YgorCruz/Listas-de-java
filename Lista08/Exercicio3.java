//Ygor da Cruz Boueri de Souza
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio3 {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      String[] str = new String[n];

      for (int i = str.length-1; i >= 0; i--) {
         str[i] = scan.nextLine();
      }

      System.out.println(Arrays.toString(str));
      scan.close();
   }
}