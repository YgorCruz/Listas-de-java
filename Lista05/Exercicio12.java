import java.util.Scanner;

class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int id;
        double pprod, reajuste;

        System.out.print("Digite o código do produto ");
        id = scan.nextInt();

        System.out.print("Digite o preco do produto ");
        pprod = scan.nextDouble();

        if (id == 1) {
            reajuste = (pprod * 0.10) + pprod;

            System.out.println("Procedencia : Norte\nPreco do frete :" + pprod * 0.10 + "\nPreco final : " + reajuste);

        } else if (id == 2 || id == 5 || id == 9) {
            reajuste = (pprod * 0.03) + pprod;

            System.out.println("Procedencia : Sul\nPreco do frete :" + pprod * 0.03 + "\nPreco final : " + reajuste);

        } else if (id == 3 || id >= 10 && id <= 15) {
            reajuste = (pprod * 0.012) + pprod;

            System.out.println("Procedencia : Leste\nPreco do frete :" + pprod * 0.012 + "\nPreco final : " + reajuste);

        } else if (id == 7 || id == 20) {
            reajuste = (pprod * 0.073) + pprod;

            System.out.println("Procedencia : Oeste\nPreco do frete :" + pprod * 0.073 + "\nPreco final : " + reajuste);

        } else {
            reajuste = (pprod * 0.222) + pprod;

            System.out.println(
                    "Procedencia : Importado\nPreco do frete :" + pprod * 0.222 + "\nPreco final : " + reajuste);

        }
    }
}