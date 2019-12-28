//Ygor da Cruz Boueri de Souza
import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio30 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Quantidade de termos do vetor: ");
      int n = sc.nextInt();
      float j;
      int k = 0;
      ArrayList<Float> num = new ArrayList<Float>();
      ArrayList<Float> avg = new ArrayList<Float>();
      ArrayList<Float> res = new ArrayList<Float>();

      System.out.println("Entre com " + n + " termos: ");
      for (int i = 0; i < n; i++) {
         j = sc.nextFloat();
         num.add(j);
      }
      n = num.size() - 1;
      j = 0;
      while (k < n) {
         avg.add((num.get(k++)+num.get(k))/2);
      }

      for (int i = 0; i < num.size(); i++) {
         if (i < num.size()-1) {
            res.add(num.get(i));
            res.add(avg.get(i));
         } else {
            res.add(num.get(i));
         }
      }

      System.out.println(res);

      sc.close();
   }
}