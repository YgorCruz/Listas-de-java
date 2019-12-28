//Ygor da Cruz Boueri de Souza
import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio28 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Quantidade de termos (vetor1: >= 25 // vetor2: 2 <= m <= 5): ");
      int n = sc.nextInt();
      int m = sc.nextInt();
      int[] outChar = new int[n];
      int[] inChar = new int[m];
      String out = "";
      String in = "";
      int index = 0;
      ArrayList<Integer> indexList = new ArrayList<Integer>();
      
      System.out.println("vetor1: ");
      for (int i = 0; i < n; i++) {
         outChar[i] = sc.nextInt();
         out += Integer.toString(outChar[i]);
      
      }

      System.out.println("vetor2: ");
      for (int i = 0; i < m; i++) {
         inChar[i] = sc.nextInt();
         in += Integer.toString(inChar[i]);
      }

      System.out.println(out);
      System.out.println(in);

      while (index != -1) {
         index = out.indexOf(in, index);

         if (index != -1) {
            indexList.add(index);
            index++;
         }
      }

      System.out.println(indexList);

sc.close();
   }
}