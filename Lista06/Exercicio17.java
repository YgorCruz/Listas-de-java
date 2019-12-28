
//Ygor da Cruz Boueri de Souza
import java.util.Scanner;

class Exercicio17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pn, sn;

        String opc;

        int media;

        do {

            System.out.print("Digite a primeira nota do aluno ");
            pn = scan.nextInt();
            System.out.print("Digite a segunda nota do aluno ");
            sn = scan.nextInt();

            media = (pn + sn) / 2;

            System.out.print("NOVO CALCULO ? (S/N)");
            opc = scan.next();

        } while (opc.equalsIgnoreCase("s"));
        
        scan.close();

    }
}