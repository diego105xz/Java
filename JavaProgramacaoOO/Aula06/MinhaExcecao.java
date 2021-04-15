package Aula06;
//Criando suas próprias exceções
//Java permite definir suas próprias exceções gerando uma subclasse de Exception.


class MinhaExcecao extends Exception {
    private int n;
    // construtor
    MinhaExcecao(int n) {
        this.n = n;
    }
    public String toString() {
        return "Minha exceção: " + n;
    }
}
