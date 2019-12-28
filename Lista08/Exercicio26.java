//Ygor da Cruz Boueri de Souza
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Exercicio26 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Quantidade de termos: ");
      int n = sc.nextInt();
      int pri = 0;
      int reg = 0;
      int count;
      ArrayList<Integer> arr = new ArrayList<Integer>();
      ArrayList<Integer> arrPrime = new ArrayList<Integer>();
      ArrayList<Integer> arrReg = new ArrayList<Integer>();
      

      System.out.println("Termos: ");
      for (int i = 0; i < n; i++) {
         arr.add(sc.nextInt());
      }

      for (int i = 0; i < n; i++) {
         count = 0;
         for (int j = 1; j <= arr.get(i); j++) {
            if (arr.get(i)%j == 0) {
               count++;
            } else if (count > 2) {
               break;
            }
         }
         if (count == 2) {
            arrPrime.add(arr.get(i));
         } else {
            arrReg.add(arr.get(i));
         }
      }

      Collections.sort(arrPrime);

      for (int i = 0; i < n; i++) {
         count = 0;
         for (int j = 1; j <= arr.get(i); j++) {
            if (arr.get(i)%j == 0) {
               count++;
            } else if (count > 2) {
               break;
            }
         }
         if (count == 2) {
            arr.set(i, arrPrime.get(pri));
            pri++;
         } else {
            arr.set(i, arrReg.get(reg));
            reg++;
         }
      }

      System.out.println(arr);

      sc.close();
   }
}