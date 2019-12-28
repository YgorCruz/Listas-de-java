import java.util.Scanner;

class Saudacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hora;
        String r;

        System.out.print("Deseja digitar uma hora (s/n)?");
        r = scan.next();

        if (r.equalsIgnoreCase("s")) {
            System.out.print("Digite uma hora: ");
            hora = scan.nextInt();
            if (hora >= 0 && hora <= 6) {
                System.out.println("Zzzzz");
            } else if (hora >= 7 && hora <= 11) {
                System.out.println("Bom dia");
            } else if (hora >= 12 && hora <= 17) {
                System.out.println("Boa tarde");
            } else if (hora >= 18 && hora <= 23) {
                System.out.println("Boa noite");
            }
        } else {
            hora = (int) (Math.random() * 10);
            if (hora >= 0 && hora <= 6) {
                System.out.println("Zzzzz");
            } else if (hora >= 7 && hora <= 11) {
                System.out.println("Bom dia");
            } else if (hora >= 12 && hora <= 17) {
                System.out.println("Boa tarde");
            } else if (hora >= 18 && hora <= 23) {
                System.out.println("Boa noite");
            }
        }

    }
}