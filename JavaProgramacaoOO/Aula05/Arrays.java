package Aula05;

/**
 *
 * @author Diego
 */
public class Arrays {
     
  public static void main(String[] args) {
    String nomes[] = new String[3];
    //atribui valor a cada posição do array, de 0 a 2
    nomes[0] = "Fulano";
    nomes[1] = "Beltrano";
    nomes[2] = "Sicrano";
    //para acessar cada posição, podemos usar um laço, de 0 a 2
    for (int i = 0; i <= 2; i++) {
      System.out.println("Na posição " + i + " do array, temos: " + nomes[i]);
    }
  }
}

