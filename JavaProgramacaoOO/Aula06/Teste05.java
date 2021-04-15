package Aula06;
//Exemplo: Tentativas de divisão por zero e acesso à posição inexistente de um array.

public class Teste05 {
    public static void main(String args[]) {
        int a;
        int b[];
        int c = 1; // c = 0 provoca a Primeira Exceção
        try {
            a = 5 / c; // a > 5 provoca a Segunda Exceção
            System.out.println(a);
            b= new int[5];
            for (int i=0; i<a; i++) {
                b[i] = i;
                System.out.println(i);
            }
        }
        catch (ArithmeticException e) {
            System.out.println("Primeira exceção: divisão por zero " + e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Segunda exceção: índice fora do limite " + e);
        }
    }
}
