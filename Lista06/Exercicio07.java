//Ygor da Cruz Boueri de Souza
import java.util.Scanner;

class Exercicio07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i;

        do {
            System.out.print("Digite um número ");
            i = scan.nextInt();
        } while (i < 1 || i > 10);

        for (int c = 1; c <= i; c++) {
            System.out.println(i+"*"+c+" = "+i*c);
        }
        scan.close();
    }
}