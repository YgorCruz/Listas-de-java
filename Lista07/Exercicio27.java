//Ygor da Cruz Boueri de Souza
import java.util.Random;
public class Exercicio27 {

   public static void main(String[] args) {
      Random rand = new Random();
      char[] randAlphaArray = new char[100];
      for (int i = 0; i < randAlphaArray.length; i++) {
         randAlphaArray[i] = (char)(rand.nextInt(26)+97);
      }
      String randString = new String(randAlphaArray);

      System.out.println(randString);
      
   }
}