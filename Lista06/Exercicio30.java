//Ygor da Cruz Boueri de Souza
class Exercicio30 {
    public static void main(String[] args) {
        for (int cont = 1; cont <= 10; cont++) {

            System.out.print(cont + ", ");

            for (int c = 1; c <= (cont*2); c++) {
                if (cont % 2 == 0) {
                    if (c % 2 == 0) {
                        System.out.print(c + " ");
                    }
                } else {
                    if (c % 2 != 0) {
                        System.out.print(c + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}