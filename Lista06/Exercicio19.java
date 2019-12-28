//Ygor da Cruz Boueri de Souza
import java.util.Scanner;

class Exercicio19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String r;
        char opc;
        int cont = 0;
        double valor=0;
        do{
            System.out.print("Digite o valor da mercadoria : ");
            valor += scan.nextDouble();
            System.out.print("MAIS MERCADORIAS ? (S/N)");
            r = scan.next();

            cont++;
        } while (r.equalsIgnoreCase("s"));
        System.out.println("A média da mercadoria é de : "+valor/cont+"\nHá "+cont+" itens no estoque");
    }
}