
//Ygor da Cruz Boueri de Souza
import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String f = scan.nextLine();
        String[] v = f.split(" ");

        System.out.println(v.length);

        scan.close();
    }
}