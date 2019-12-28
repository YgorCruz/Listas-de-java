
//Ygor da Cruz Boueri de Souza
import java.util.Scanner;

class Exercicio38 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;

        do {

            n = scan.nextInt();

            if (n == 0) {

                break;

            }

        } while (n < 0);

        if (n > 0) {

            for (int cont = 0; cont <= n; cont++) {
                if (cont == 0) {
                    System.out.print(cont + ",");
                } else {
                    System.out.print((cont - 1) + "/" + cont + ",");
                }

            }

            System.out.println();

        }
    }
}