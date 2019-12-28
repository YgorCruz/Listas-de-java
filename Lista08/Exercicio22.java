//Ygor da Cruz Boueri de Souza
import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio22 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      ArrayList<Integer> arr = new ArrayList<Integer>();

      for (int i = 0; i < n; i++) {
         arr.add(sc.nextInt());
      }
      System.out.println(arr);

      sc.close();
   }
}