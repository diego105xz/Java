package Aula05;

/**
 *
 * @author Diego
 */
public class Arrays03 {
    public static void main(String[] args) {
    String nomesCompletos[][] = new String[3][3];
    //Pessoa 1:
    nomesCompletos[0][0] = "Carlos"; //Primeira linha, primeira coluna
    nomesCompletos[0][1] = " Drummond"; //Primeira linha, segunda coluna
    //Pessoa 2:
    nomesCompletos[1][0] = "Clarice"; //Segunda linha, primeira coluna
    nomesCompletos[1][1] = " Lispector"; //Segunda linha, segunda coluna
    //Pessoa 3:
    nomesCompletos[2][0] = "Jorge"; //Terceira linha, primeira coluna
    nomesCompletos[2][1] = " Amado"; //Terceira linha, segunda coluna
    //Impressão dos nomes com os sobrenomes:
    for(int i = 0; i <= 2; i ++){
      System.out.print("Nome armazenado na linha " + i + ": ");
      //Pega a posição i (linha), a coluna do nome (0) e concatena com a coluna sobrenome (1)
      System.out.println(nomesCompletos[i][0] + nomesCompletos[i][1]);
    }
  }
}
