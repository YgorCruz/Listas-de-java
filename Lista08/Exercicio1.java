//Ygor da Cruz Boueri de Souza
import java.util.Arrays;
import java.util.Scanner;
public class Exercicio1 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String[] str = new String[15];

      for (int i = 0; i < str.length; i++) {
         str[i] = sc.nextLine();
      }

      System.out.println(Arrays.toString(str));

      sc.close();
   }
}