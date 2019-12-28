import java.util.Scanner;
class VerificaValorProduto{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int precoProduto1;
        int precoProduto2;

        System.out.println("Digite um valor para o produto 1");
        precoProduto1 = scan.nextInt();
        System.out.println("Digite um valor para o produto 2");
        precoProduto2 = scan.nextInt();

        if((precoProduto1>=1&&precoProduto1<=100)&&(precoProduto2>=1&&precoProduto2<=100)){
            if(precoProduto1<precoProduto2){
                System.out.println("O produto 1 é o mais barato");
            }
            else if(precoProduto1>precoProduto2){
                System.out.println("O produto 2 é o mais barato");
            }
            else{
                System.out.println("O preço dos dois produtos são iguais");
            }
        }else{
            System.out.println("Valores inseridos invalidos");
        }
    }
}