//Ygor da Cruz Boueri de Souza
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Exercicio25 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Quantidade de termos: ");
      int n = sc.nextInt();
      int par = 0;
      int impar = 0;
      ArrayList<Integer> arr = new ArrayList<Integer>();
      ArrayList<Integer> arrPar = new ArrayList<Integer>();
      ArrayList<Integer> arrImpar = new ArrayList<Integer>();
      

      System.out.println("Termos: ");
      for (int i = 0; i < n; i++) {
         arr.add(sc.nextInt());
      }

      for (int i = 0; i < n; i++) {
         if (arr.get(i)%2 == 0) {
            arrPar.add(arr.get(i));
         } else {
            arrImpar.add(arr.get(i));
         }
      }

      Collections.sort(arrImpar);
      Collections.sort(arrPar, Collections.reverseOrder());

      for (int i = 0; i < n; i++) {
         if (arr.get(i)%2 == 0) {
            arr.set(i, arrPar.get(par));
            par++;
         } else {
            arr.set(i, arrImpar.get(impar));
            impar++;
         }
      }


      System.out.println(arr);

      sc.close();
   }
}