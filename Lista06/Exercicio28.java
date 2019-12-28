//Ygor da Cruz Boueri de Souza
class Exercicio28 {
    public static void main(String[] args) {
        // Começo
        for (int c = 1; c <= 10; c++) {

            System.out.print(c + ", ");

            for (int j = 1; j <= 10; j++) {
                if (j <= c) {
                    continue;
                } else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();

        }
        // Fim
    }
}