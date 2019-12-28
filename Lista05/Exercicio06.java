import java.util.Scanner;
class Exercicio06{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1,num2;

        System.out.print("Digite o primeiro numero: ");
        num1 = scan.nextInt();
        System.out.print("Digite o segundo numero: ");
        num2 = scan.nextInt();

        if(num1 > num2){
            System.out.println(num1+" é maior que "+num2);
        }else{
            System.out.println(num2+" é maior que "+num1);
        }
    }
}