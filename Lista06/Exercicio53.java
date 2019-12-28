
//Ygor da Cruz Boueri de Souza

public class Exercicio53 {
   public static void main(String[] args) {

      int v[] = new int[250], cont = 0, e = 0;

      for (int c = 0; c < 250; c++) {

         if (c < 2) {
            v[c] = c;
         } else {

            if (v[c - 1] + v[c - 2] > 250) {
               break;
            } else {
               v[c] = v[c - 1] + v[c - 2];
            }

         }

         cont++;

      }
      v = new int[cont];
      for (int c = 0; c < cont; c++) {
         v[c] = (c < 2) ? c : v[c - 2] + v[c - 1];
      }
      while (e < v.length) {
         if (e > 0) {
            System.out.print(v[e] + ",");
         }
         if (e == (v.length - 1)) {
            System.out.print(v[e]);
         }
         e++;
      }
   }
}