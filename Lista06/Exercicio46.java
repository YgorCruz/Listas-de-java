
//Ygor da Cruz Boueri de Souza
import java.util.Scanner;

class Exercicio46 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt(), d = 0;

        for (int c = 1; c <= n; c++) {
            if (n % c == 0) {
                d++;
            }
        }
        if (d == 2) {
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo");
        }
        scan.close();
    }
}