//Ygor da Cruz Boueri de Souza
import java.util.Scanner;

class Exercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i;

        do {
            System.out.print("Digite um número ");
            i = scan.nextInt();
        } while (i < 0);

        for (int c = 1; c <= i; c++) {
            System.out.println(c);
        }
        scan.close();
    }
}