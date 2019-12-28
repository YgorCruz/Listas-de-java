
//Ygor da Cruz Boueri de Souza
import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String f = scan.nextLine();
        int n = 0;

        n = f.indexOf("ana",n);

        System.out.println(n);

        scan.close();
    }
}