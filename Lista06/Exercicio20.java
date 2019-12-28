//Ygor da Cruz Boueri de Souza
import java.util.Scanner;

class Exercicio20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, maior = 0, menor = 0;
        for (int n = 1; n <= 5; n++) {
            if (n == 1) {
                System.out.print("Digite um número : ");
                num = scan.nextInt();

                maior = num;
            } else if (n == 2) {
                System.out.print("Digite outro número  : ");
                num = scan.nextInt();
                if (num > maior) {
                    maior = num;
                } else {
                    menor = num;
                }
            } else {
                System.out.print("Digite outro número : ");
                num = scan.nextInt();
                if (num > maior) {
                    maior = num;
                } else if (num < menor) {
                    menor = num;
                }
            }
        }
        System.out.println("O maior número é : " + maior + "\nO menor número é : " + menor);
    }
}