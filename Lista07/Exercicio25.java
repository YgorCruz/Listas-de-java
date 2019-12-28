//Ygor da Cruz Boueri de Souza
import java.util.Scanner;
public class Exercicio25 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      char[] pw = str.toCharArray();
      String symbolStr = "!@#$%&*()+";

      int alpha = 0;
      int num = 0;
      int symbol = 0;

      if (pw.length < 10) {
         System.out.println("senha reprovada - X");
      } else {
         for (int i = 0; i < pw.length; i++) {
            if ((pw[i] >= 'a' && pw[i] <= 'z') || (pw[i] >= 'A' && pw[i] <= 'Z')) alpha++;
            else if (pw[i] >= '0' && pw[i] <= '9') num++;
            else if (symbolStr.indexOf(pw[i]) != -1) symbol++;
         }
         if (alpha >= 3 && num >= 3 && symbol >= 2) {
            System.out.println("senha aprovada - O");
         } else {
            System.out.println("senha reprovada - X");
         }
      }
sc.close();
   }
}