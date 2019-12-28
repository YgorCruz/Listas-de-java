import java.util.Scanner;

class Exercicio08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cmc, trm;

        System.out.print("Digite o horario de começo do jogo: ");
        cmc = scan.nextInt();
        System.out.print("Digite o horario de termino do jogo: ");
        trm= scan.nextInt();

        if (trm>cmc) {
            System.out.println("O jogo durou "+(trm-cmc)+"h");
        } else {
            System.out.println("O jogo durou "+((trm+24)-cmc)+"h");
        }
    }
}