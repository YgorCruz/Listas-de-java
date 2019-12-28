
//Ygor da Cruz Boueri de Souza
import java.util.Scanner;

class Exercicio41 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int s=1;
        for(int c=1;c<=n;c++){
            s*=c;
        }
        System.out.println(s);
    }
}