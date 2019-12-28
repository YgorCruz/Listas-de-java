
//Ygor da Cruz Boueri de Souza
import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean t = false;
        System.out.print("Digite uma palavra: ");
        String f = scan.nextLine();
        int c = f.length() - 1;

        for (int i = 0; i < f.length(); i++) {

            if (f.toLowerCase().charAt(i) == f.toLowerCase().charAt(c))
                t = true;
            else
                t = false;

            c--;
        }
        System.out.println((t == true) ? "É um palindromo" : "Não é um palindromo");

        scan.close();
    }
}