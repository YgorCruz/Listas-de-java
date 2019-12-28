//Ygor da Cruz Boueri de Souza
import java.util.Scanner;

class Exercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soma = 0;
        int i = 0   ;
        while (i < 10) {

            System.out.print("Digite um número ");
            int n = scan.nextInt();

            if (n < 40) {
                soma += n;
            }
            i++;
        }
        System.out.println("A soma dos números menores que 40 é  : " + soma);
        scan.close();
    }
}