package Aula04;
/**
 *
 * @author Diego
 */
public class NumeroImpar {
    public static void main(String[] args) {
    int i = 0;
    while(i <= 10) {
      if (i % 2 != 0) //Verifica se o resto da divisão por 2 é diferente de zero.
      System.out.println(i); //Imprime a variável de controle
      i++; //Incrementa a variável de controle
    }
  }
}
