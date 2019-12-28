//Ygor da Cruz Boueri de Souza
import java.util.Scanner;

class Exercicio22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num, maior = 0,media=0;
        for (int n = 1; n <= 10; n++) {
            if (n == 1) {
                System.out.print("Digite um número : ");
                num = scan.nextInt();

                maior = num;

                media += num;
            } else {
                System.out.print("Digite outro número : ");
                num = scan.nextInt();
                if (num > maior) {
                    maior = num;
                }
                media += num;
            }

        }
        System.out.println("O maior número é : "+maior+"\nA média aritmética dos números é : "+(media/10));
    }
}