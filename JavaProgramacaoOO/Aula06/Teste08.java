package Aula06;
//Criando suas próprias exceções
//como como é possível utilizar a exceção criada anteriormente:
public class Teste08 {
    public static void main(String args[]) {
        int x;
        try {
            x = 12;
            if (x > 10)
            throw new MinhaExcecao(x);
        }
        catch (MinhaExcecao e) {
            System.out.println("Capturada: " + e);
        }
    }
}
