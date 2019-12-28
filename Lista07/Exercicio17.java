
//Ygor da Cruz Boueri de Souza
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean t = true;
        String fr1 = "",fr2="";
        System.out.print("Digite uma frase: ");
        fr1 = scan.nextLine();

        System.out.print("Digite outra frase: ");
        fr2 = scan.nextLine();

        if (fr1.length() == fr2.length()) {
            for (int c = 0; c < fr1.length(); c++) {
                if (fr1.charAt(c) != fr2.charAt(c)) {
                    t = false;
                }
            }
        } else {
            t = false;
        }
        if (t == false) {
            System.out.print("Não são iguais");
        } else {
            System.out.println("São iguais");
        }

        scan.close();
    }
}