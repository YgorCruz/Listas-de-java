
//Ygor da Cruz Boueri de Souza
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String f = scan.nextLine();

        int cont = 0;

        for (int c = 0; c < f.length(); c++)
            for (int i = 97; i <= 122; i++)
                if (f.charAt(c) == (char) i)
                    cont++;
        if(cont==f.length())
            System.out.println("Todos os caractéres são minusculos");
        else
            System.out.println("Deu ruim, tem maiusculo ai! ;)");
        scan.close();
    }
}