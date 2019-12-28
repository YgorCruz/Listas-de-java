import java.util.Scanner;
class Exercicio01{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;

        System.out.print("Digite um numero");
        numero = scan.nextInt();

        if(numero > 10){
            System.out.println("É maior que 10");
        }else if(numero < 10){
        System.out.println("É menor que 10");
        }
    }
}