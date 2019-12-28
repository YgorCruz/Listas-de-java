import java.util.Scanner;
class Exercicio09{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sh,ht;

        System.out.print("Digite as horas trabalhadas no mês: ");
        ht = scan.nextInt();

        System.out.print("Digite o salario por hora: ");
        sh = scan.nextInt();

        if(ht/4<=40){
            System.out.println("O salário é: "+(ht*sh));
        }else{
            System.out.println("O salário é: "+((sh*1.5)*ht));
        }
    }
}