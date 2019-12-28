import java.util.Scanner;

class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;

        System.out.print("Digite um numero: ");
        numero = scan.nextInt();

        if (numero >= 0) {
            System.out.println("É positivo");
        } else {
            System.out.println("É negativo");
        }
    }
}