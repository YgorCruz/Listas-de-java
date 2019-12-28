import java.util.Scanner;

class Exercicios11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        String opc;
        char tst;
        double operacao = 0;
        System.out.print("Digite o primeiro numero: ");
        num1 = scan.nextInt();
        System.out.print("Digite o segundo numero: ");
        num2 = scan.nextInt();
        System.out.print("Digite um operacao : (+,-,*,/)");
        opc = scan.next();
        tst = opc.charAt(0);

        switch (opc) {
        case "+":
            operacao = num1 + num2;
            break;
        case "-":
            operacao = num1 - num2;
            break;
        case "/":
            operacao = num1 / num2;
            break;
        case "*":
            operacao = num1 * num2;
            break;
        }
        System.out.println("O resultado da operacao e : " + operacao);

    }
}