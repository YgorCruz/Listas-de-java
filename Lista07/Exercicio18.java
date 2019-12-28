//Ygor da Cruz Boueri de Souza
import java.util.Scanner;
public class Exercicio18 {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.print("Digite a sequencia binária: ");
      String f = scan.nextLine();

      int c = 0;

      if (f.length() != 8) {
         System.out.print("Não é binario");
      }
      else {
         for (int i = 0; i < f.length(); i++) {
            if (f.charAt(i) == '0' || f.charAt(i) == '1') {
               c++;
            }
         }
         System.out.print((c==8)?"binario":"Não é binario");
      }
      scan.close();
      

   }
}