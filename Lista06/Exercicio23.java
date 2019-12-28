//Ygor da Cruz Boueri de Souza
import java.util.Scanner;

class Exercicio23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double salario = 0, maior = 0;
        int filhos = 0, cont = 0, menor = 0, media = 0;

        while (salario >= 0) {
            System.out.print("Digite seu salário : ");
            salario = scan.nextDouble();

            if (salario >= 0) {
                cont++;

                System.out.print("Digite a quantidade de filhos : ");
                filhos += scan.nextInt();

                media += salario;

                if (salario > maior) {
                    maior = salario;
                }
                if (salario >= 0 && salario <= 150) {
                    menor++;
                }
            }

        }
        System.out.println("\n\n\n\n");

        System.out.println("\n\nMédia de sálario da população : " + (media / cont) + "\nMédia do número de filhos : "
                + (filhos / cont) + "\nMaior salário dos habitantes : " + (maior)
                + "\nPercentual de pessoas com salário menor que R$ 150,00 : " + ((menor * 100) / cont)+"%");

    }
}