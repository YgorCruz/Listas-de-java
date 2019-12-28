import java.util.Scanner;

class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sf,vv;//sf=salario fixo - vv=valor das vendas
        double st;//st=salario atual
        System.out.print("Digite o salario fixo: ");
        sf = scan.nextInt();

        System.out.print("Digite o valor das vendas: ");
        vv = scan.nextInt();

        if(vv<=1500){
            st = (vv*0.03)+sf;
        }else{
            st = (vv*0.05)+sf;
        }
        System.out.println("O salário com o rejuste é de: "+st);
    }
}