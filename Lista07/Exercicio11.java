
//Ygor da Cruz Boueri de Souza
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int t = 0;

        System.out.print("Digite uma frase: ");
        String f = scan.nextLine();

        for (int c = 0; c < f.length(); c++) {
            if ((f.toLowerCase().charAt(c) == (char) 97) || (f.toLowerCase().charAt(c) == (char) 101)
                    || (f.toLowerCase().charAt(c) == (char) 105) || (f.toLowerCase().charAt(c) == (char) 111)
                    || (f.toLowerCase().charAt(c) == (char) 117)) {
                t++;
            }
        }

        System.out.println("Número de letras maiuscula: " + t);
        scan.close();
    }
}