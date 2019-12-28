//Ygor da Cruz Boueri de Souza
import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio9 {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = 5;
      int[] line1 = new int[n];
      ArrayList<Integer> lineList = new ArrayList<Integer>();

      for (int i = 0; i < n; i++) {
         line1[i] = scan.nextInt();
         if (line1[i] % 2 == 0) {
            lineList.add(line1[i]);
         }
      }
      

      System.out.println(lineList);

      scan.close();
   }
}