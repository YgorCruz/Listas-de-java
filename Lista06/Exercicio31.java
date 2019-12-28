
//Ygor da Cruz Boueri de Souza
import java.util.Scanner;

class Exercicio31 {
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
                System.out.print(cont + ",");
            }
            System.out.println();
        }
    }
}