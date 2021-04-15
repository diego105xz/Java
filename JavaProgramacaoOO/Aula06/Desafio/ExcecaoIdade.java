package Aula06.Desafio;

class ExcecaoIdade extends Exception {
    private int n;
    // construtor
    ExcecaoIdade(int n) {
        this.n = n;
    }
    public String toString() {
        return ("O USUÁRIO TEM " + (n)+ " ANOS." );
    }
}