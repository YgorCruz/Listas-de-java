
//Ygor da Cruz Boueri de Souza
import java.util.Scanner;

class Exercicio08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        int neg = 0;
        while (i < 10) {

            System.out.print("Digite um número ");
            int n = scan.nextInt();

            if (n % 2 != 0) {
                System.out.println("Negativo");
                neg++;
            }

            i++;
        }
        System.out.println(neg + " número Negativo");
        scan.close();
    }
}