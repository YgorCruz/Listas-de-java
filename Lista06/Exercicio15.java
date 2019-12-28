//Ygor da Cruz Boueri de Souza
import java.util.Scanner;

class Exercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cont, soma = 0, pn, sn;

        System.out.print("Digite o primeiro valor : ");
        pn = scan.nextInt();
        System.out.print("Digite o segundo valor : ");
        sn = scan.nextInt();

        if (sn > pn) {
            System.out.println("1");
            for (cont = pn; cont <= sn; cont++) {
                soma += cont;
            }
        } else {
            System.out.println("2");
            for (cont = sn; cont <= pn; cont++) {
                soma += cont;
            }
        }
        System.out.println("A soma dos inteiros � : " + soma);
        scan.close();
    }
}