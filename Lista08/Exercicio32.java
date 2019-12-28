//Ygor da Cruz Boueri de Souza
import java.util.Scanner;
import java.util.Arrays;

public class Exercicio32 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Entre com uma frase: ");
      String text = sc.nextLine(); 
      String[] str = text.split("\\s");
      
      System.out.println("Quantidade de palavras: " + str.length);

      System.out.println(Arrays.toString(str));

      Arrays.sort(str);

      System.out.println(Arrays.toString(str));

      sc.close();
   }
}