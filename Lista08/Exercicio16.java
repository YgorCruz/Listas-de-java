//Ygor da Cruz Boueri de Souza
import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio16 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      ArrayList<Integer> arr = new ArrayList<Integer>();

      arr.add(0);
      arr.add(1);
      System.out.println("init: " + arr);

      for (int i = 0; i < n; i++) {
         arr.add(arr.get(i) + arr.get(i+1));      
      }

      

      System.out.println(arr);
      
      sc.close();
   }
}