
//Ygor da Cruz Boueri de Souza
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int e = 0;

        System.out.print("Digite uma frase: ");
        String f = scan.nextLine();

        for (int c = 0; c < f.length(); c++) {
            if (f.charAt(c) == (char) 32) {
                e++;
            }
        }

        System.out.println("Número de espaços: " + e);
        scan.close();
    }
}