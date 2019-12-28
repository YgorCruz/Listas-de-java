//Ygor da Cruz Boueri de Souza

import java.util.Scanner;

class Exercicio40 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, m, cont = 1;
        do {
            n = scan.nextInt();
            if (n == 0) {
                break;
            }
        } while (n < 0);
        if (n > 0) {
            if(n%2==0){
                m=n/2;
            }else{
                m = (n+1)/2;
            }
            for (int c = 1; c <= n; c++) {
                if (c <= m) {
                    System.out.print(c + ",");
                }else {
                    System.out.print((c - cont) + ",");
                    cont += 2;
                }
            }
            System.out.println();
        }
    }
}