//Ygor da Cruz Boueri de Souza
import java.util.Scanner;
class ADivisivelPorB{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um valor para a : ");
        int a = scan.nextInt();
        System.out.print("Digite um valor para b : ");
        int b = scan.nextInt();

        if(a>=0 && a<=1000){
            if(b>=0 && b<=20){
                System.out.print((a % b == 0) ? "E divisivel" : "Nao e divisivel");
            }
        }
        else{
            System.out.print("Valores invalidos");
        }
    }
}