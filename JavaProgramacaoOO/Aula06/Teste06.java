package Aula06;
//Exemplo: Multi catch

public class Teste06 {
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
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: " + e.getMessage());  
        }
    }
}
