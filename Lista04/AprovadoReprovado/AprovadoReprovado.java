//Ygor da Cruz Boueri de Souza
import java.util.Scanner;

class AprovadoReprovado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Digite um valor para a nota : ");
        int nota = scan.nextInt();
        
        if(nota >=0 && nota <=10){
        System.out.printf((nota < 6) ? "REPROVADO" : "APROVADO");
        }

    }
}