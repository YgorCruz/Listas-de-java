import java.util.Scanner;

class Exercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ano;

        System.out.print("Digite seu ano de nascimento: ");
        ano = scan.nextInt();

        if ((2019-ano)>18) {
            System.out.println("Podera votar");
        } else {
            System.out.println("Não podera votar");
        }
    }
}