
//Ygor da Cruz Boueri de Souza
import java.util.Scanner;

class Exercicio43 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;

        for (int c = 1; c <= 7; c++) {
            int s = 1;
            n = scan.nextInt();
            for (int t = 1; t <= n; t++) {
                s *= t;
            }
            System.out.println(s);
        }
        scan.close();
    }
}