//Ygor da Cruz Boueri de Souza
import java.util.Scanner;

class Exercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número");
        int i = scan.nextInt();

        for(int c = 1;c<=i;c++){
        System.out.println(c);
        }
        scan.close();
    }
}