//Ygor da Cruz Boueri de Souza
import java.util.Scanner;

class Exercicio18 {
    public static void main(String[] args) {
        int estoque;
        double valor=0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a quantidade de produtos que contem no estoque : ");
        estoque = scan.nextInt();

        for (int cont = 1; cont <= estoque; cont++) {
            valor += scan.nextDouble();
        }
        System.out.println("O media do valor dos produtos é : "+valor/estoque);
    }
}