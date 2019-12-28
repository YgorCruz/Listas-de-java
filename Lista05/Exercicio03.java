import java.util.Scanner;

class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int qnt;

        System.out.print("Digite quantas maças deseja: ");
        qnt = scan.nextInt();

        if (qnt < 12) {
            System.out.println("O valor é " + (qnt * 1.30));
        } else {
            System.out.println("O valor é " + (qnt * 1));
        }
    }
}
