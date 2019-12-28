import java.util.Scanner;

class Exercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota01, nota02;

        System.out.print("Digite a primeira nota: ");
        nota01 = scan.nextInt();
        System.out.print("Digite a segunda nota: ");
        nota02 = scan.nextInt();

        if (((nota01 + nota02) / 2) >= 6) {
            System.out.println("Aprovado\nMedia: "+((nota01 + nota02) / 2));
        } else {
            System.out.println("Reprovado\nMedia: "+((nota01 + nota02) / 2));
        }
    }
}