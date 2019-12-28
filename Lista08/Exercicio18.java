//Ygor da Cruz Boueri de Souza
import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio18 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int j = 1;
      int fat = 1;
      ArrayList<Integer> arr = new ArrayList<Integer>();

      while (arr.size() < n) {
         for (int i = 1; i <= j; i++) {
            fat*=i;
         }
         arr.add(fat);
         fat = 1;
         j++;
      }

      System.out.println(arr);

      sc.close();
   }
}