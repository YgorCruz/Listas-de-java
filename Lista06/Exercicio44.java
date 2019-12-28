
//Ygor da Cruz Boueri de Souza
import java.util.Scanner;

class Exercicio44 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = 1, n;

        n = scan.nextInt();

        for (int c = 1; c <= n; c++) {
            s *= c;

            System.out.println(s);
        }
        scan.close();
    }
}