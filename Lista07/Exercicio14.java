
//Ygor da Cruz Boueri de Souza
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String f = scan.nextLine();

        System.out.println(f.replace('a', '*'));
        scan.close();
    }
}