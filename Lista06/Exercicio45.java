
//Ygor da Cruz Boueri de Souza
import java.util.Scanner;

class Exercicio45 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Variaveis
        int v[];
        int s = 1, n;

        // Código
        n = scan.nextInt();
        v = new int[n+1];
        
        //Ordem Crescente
        for (int c = 1; c <= n; c++) {
            s *= c;
            v[c] = s;
        }
        //Ordem decrecente
        for (int i = n; i >0; i--) {
            
            System.out.print(v[i]+",");
            
        }
        System.out.println();
        scan.close();
    }
}