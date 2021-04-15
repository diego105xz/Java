package Aula06;
//Podemos acrescentar a cláusula finally à estrutura try-catch. O bloco finally será sempre executado.

public class Teste07 {
    static public void main (String args[]) {
        int a, b, c;
        a = 2;
        b = 1;
        try {
            c = a / b;
        }
        catch (Exception e) {
            System.out.println("Tratando a exceção");
        }
        finally {
            System.out.println("Executando instruções do finally");
        }
        System.out.println("Prosseguindo após a exceção");
    }
}
