//Ygor da Cruz Boueri de Souza
import java.util.Scanner;
class Exercicio09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        int d = 0, f = 0;
        while (i < 10) {

            System.out.print("Digite um número ");
            int n = scan.nextInt();

            if (n >= 10 && n <= 20) {
                d++;
            } else {
                f++;
            }

            i++;
        }
        System.out.println(d + " Dentro do intervalo\n" + f + " Fora do intervalo");
        scan.close();
    }
}