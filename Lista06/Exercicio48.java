
//Ygor da Cruz Boueri de Souza
import java.util.Scanner;

class Exercicio48 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i, c, d = 0, n = scan.nextInt();

        // Até 100
        for (i = 1; i <= n; i++) {
            // Teste
            for (c = 1; c <= i; c++) {
                if (i % c == 0) {
                    d++;
                }
            }
            // Validação
            if (d == 2) {
                System.out.println(i);
            }
            d = 0;
        }
        scan.close();
    }
}