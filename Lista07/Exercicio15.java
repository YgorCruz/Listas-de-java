
//Ygor da Cruz Boueri de Souza
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String f = scan.nextLine();
        boolean t = false;
        for (int i = 0; i < f.length(); i++) {

            for (int c = 48; c <= 57; c++) {
                if (f.charAt(i) == (char) c) {
                    t=true;
                }
            }
        }
        if(t==true){
            System.out.println("Contem caracteres numéricos");
        }else{
            System.out.println("Não contem caracteres numéricos");
        }

        scan.close();
    }
}