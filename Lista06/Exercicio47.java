//Ygor da Cruz Boueri de Souza

class Exercicio47 {
    public static void main(String[] args) {

        int i, c, d = 0;

        // Até 100
        for (i = 1; i <= 100; i++) {
            // Teste
            for (c = 1; c <= i; c++) {
                if (i % c == 0) {
                    d++;
                }
            }
            // Validação
            if (d == 2) {
                System.out.println(i);
            }
            d = 0;
        }
    }
}