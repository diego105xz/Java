package Aula02;

/**
 *
 * @author Diego
 */
public class Matematica {
    //Atributos locais
    int a, b;
    //Construtor da classe, que recebe dois valores (x e y) e atribui
    //aos valores locais (a e b);
    public Matematica (int x, int y){
    a = x;
    b = y;
    }
    //Metodo de soma
    public int soma(){
    return a + b;
    }
    //Metodo de subtracao
    public int subtrai(){
    return a - b;
    }
    //Metodo de multiplicacao
    public int multiplica(){
    return a * b;
    }
    //Metodo de divisao
    public int divide(){
    return a / b;
    }
}
