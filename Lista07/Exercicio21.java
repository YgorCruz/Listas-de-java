
//Ygor da Cruz Boueri de Souza
import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String f = scan.nextLine();
        String[] v = f.split(" ");
        int c = 0;

        while (c < v.length) {
            System.out.println(v[c]);
            c++;

        }
        scan.close();
    }
}