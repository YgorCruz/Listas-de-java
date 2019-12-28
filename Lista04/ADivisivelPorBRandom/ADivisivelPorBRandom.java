//Ygor da Cruz Boueri de Souza
class ADivisivelPorBRandom {
    public static void main(String[] args) {
        int a, b;

        a = (int) (Math.random() * 100);
        b = (int) (Math.random() * 20);

        if (a % b == 0) {
            System.out.println("É divisível");
        } else {
            System.out.println("Não é divisível");
        }
    }
}