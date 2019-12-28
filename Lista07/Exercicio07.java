
//Ygor da Cruz Boueri de Souza
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma frase:");
        String f = scan.nextLine();
        int v[] = new int[123];

        for (int c = 0; c < f.length(); c++) {
            for (int i = 97; i <= 122; i++) {
                if (f.toLowerCase().charAt(c) == (char) i) {
                    v[i]++;
                }
            }
        }
        for (int cont = 97; cont <= 122; cont++) {
            System.out.println((char) cont + "|" + v[cont]);
        }
        scan.close();

    }
}