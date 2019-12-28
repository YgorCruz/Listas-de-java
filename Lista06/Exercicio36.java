
//Ygor da Cruz Boueri de Souza
import java.util.Scanner;

class Exercicio36 {
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

            for (int cont = 1; cont <= n; cont++) {
                if (cont == 1) {
                    System.out.print(cont + ",");
                } else {
                    System.out.print("1/"+cont+",");
                }

            }

            System.out.println();

        }
    }
}