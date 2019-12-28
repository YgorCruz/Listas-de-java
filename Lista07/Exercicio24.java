//Ygor da Cruz Boueri de Souza
import java.util.Scanner;

public class Exercicio24 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      char[] numberList = str.toCharArray();
      int number = Character.getNumericValue(numberList[0]);
      int numberMax = Character.getNumericValue(numberList[0]);
      int count = 1;
      int countMax = 1;

      for (int i = 0; i < numberList.length; i++) {
         if (number == Character.getNumericValue(numberList[i])) {
            count++;
            if (countMax <= count){ 
               countMax = count;
               numberMax = number;
            }
            
         } else {
            number = Character.getNumericValue(numberList[i]);
            count = 1;
         }
      }
      System.out.println("Maior sequencia: " + countMax);
      System.out.println("Numero: " + numberMax);

      sc.close();

   }
}