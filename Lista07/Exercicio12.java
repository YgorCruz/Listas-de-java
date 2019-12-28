
//Ygor da Cruz Boueri de Souza
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int v[] = new int[5];
        v[0] = 'a';
        v[1] = 'e';
        v[2] = 'i';
        v[3] = 'o';
        v[4] = 'u';
        int t[] = new int[5];

        System.out.print("Digite uma frase: ");
        String f = scan.nextLine();

        for (int c = 0; c < f.length(); c++) {

            for (int i = 0; i < v.length; i++) {
                if (f.toLowerCase().charAt(c) == v[i]) {
                    t[i]++;
                }
            }

        }

        for (int c = 0; c < t.length; c++) {
            System.out.println((char)v[c] + "|" + t[c]);
        }
        scan.close();
    }
}