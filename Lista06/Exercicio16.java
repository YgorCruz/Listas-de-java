//Ygor da Cruz Boueri de Souza
class Exercicio16 {
    public static void main(String[] args) {
        int soma = 0,i=1;
        for (int cont = 15; cont <= 100; cont++) {
            soma +=cont;
            i++;
        }

        System.out.println("A média aritmética dos numeros inteiros é de : "+soma/i);
    }
}