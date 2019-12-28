//Ygor da Cruz Boueri de Souza
import java.util.Scanner;

class Exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cont, soma = 0;

        System.out.print("Digite o primeiro valor : ");
        int pn = scan.nextInt();
        System.out.print("Digite o primeiro valor : ");
        int sn = scan.nextInt();

        for (cont = pn; cont <= sn; cont++) {
            soma += cont;
        }
        System.out.println("A soma dos inteiros é : "+soma);
        scan.close();
    }
}