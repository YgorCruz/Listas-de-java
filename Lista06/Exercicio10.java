//Ygor da Cruz Boueri de Souza
import java.util.Scanner;

class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soma = 0, i = 0;
        while (i < 10) {

            System.out.print("Digite um número ");
            int n = scan.nextInt();
            soma += n;
            i++;
        }
        System.out.println("A média aritmética dos valores é : " + soma / 10);
        scan.close();
    }
}