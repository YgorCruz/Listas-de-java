
//Ygor da Cruz Boueri de Souza
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cont = 0;
        System.out.print("Digite uma frase: ");
        String f = scan.next();
        char l = 'a';
        for (int c = 0; c < f.length(); c++) {
            if (f.toLowerCase().charAt(c) == l) {//toLowerCase - tudo em minisculo
                cont++;
            }
        }

        System.out.println(cont);

        scan.close();
    }
}