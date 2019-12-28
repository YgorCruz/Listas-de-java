
//Ygor da Cruz Boueri de Souza
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int t = 0;

        System.out.print("Digite uma frase: ");
        String f = scan.nextLine();

        for (int c = 0; c < f.length(); c++) {
            for (int a = 97; a <= 122; a++) {

                if (f.charAt(c) == (char) a) {
                    t++;
                }
            }
        }

        System.out.println("Número de letras minusculas: " + t);
        scan.close();
    }
}