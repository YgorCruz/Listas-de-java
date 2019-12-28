//Ygor da Cruz Boueri de Souza
import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio23 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int j;
      ArrayList<Integer> arr = new ArrayList<Integer>();

      for (int i = 0; i < n; i++) {
         j = sc.nextInt();
         if (j%2 == 0) {
            arr.add(j);
         }
      }
      System.out.println(arr);

      sc.close();
   }
}