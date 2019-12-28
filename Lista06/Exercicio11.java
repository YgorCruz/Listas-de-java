//Ygor da Cruz Boueri de Souza
import java.util.Scanner;

class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cont = 1, notas = 0;

        System.out.print("Digite quantos alunas há na sala : ");
        int a = scan.nextInt();

        while (cont <= a) {

            System.out.print("Digite quantos alunas há na sala : ");
            notas += scan.nextInt();

            cont++;
        }

        System.out.println("A média das notas é : " + notas / a);
        scan.close();
    }
}