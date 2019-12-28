//Ygor da Cruz Boueri de Souza
import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio17 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int j = 2;
      short count = 0;
      ArrayList<Integer> arr = new ArrayList<Integer>();

      while (arr.size() < n) {
         for (int i = j; i > 0; i--) {
            if (j%i == 0) {
               count++;
            } else if (j%i == 0 && count > 2) {
               break;
            }
         }
         if (count == 2) {
            arr.add(j);
         }
         count = 0;
         j++;
      }

      System.out.println(arr);

      sc.close();
   }
}