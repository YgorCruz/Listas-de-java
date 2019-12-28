
//Ygor da Cruz Boueri de Souza
import java.util.Scanner;

class Exercicio34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, soma = 0;

        do {

            n = scan.nextInt();

            if (n == 0) {

                break;

            }

        } while (n < 0);

        if (n > 0) {

            for (int cont = 0; cont <= n; cont++) {

                soma += cont;

                System.out.print(soma + ",");

            }

            System.out.println();

        }

    }

}