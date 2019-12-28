
//Ygor da Cruz Boueri de Souza
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int v[] = new int[26], t = 0;

        System.out.print("Digite uma frase: ");
        String f = scan.nextLine();

        for (int tam = 'a'; tam <= 'z'; tam++) {

            if (tam == 'a' || tam == 'e' || tam == 'i' || tam == 'o' || tam == 'u') {
                continue;
            } else {
                v[tam - 97] = tam;
            }
        }

        for (int cont = 0; cont < f.length(); cont++) {

            for (int teste = 0; teste < v.length; teste++) {
                if (f.toLowerCase().charAt(cont) == v[teste]) {
                    t++;
                }

            }
        }

        System.out.println("Número de consoantes: " + t);

        scan.close();
    }
}