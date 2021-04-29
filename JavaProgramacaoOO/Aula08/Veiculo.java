package Aula08;

/**
 *
 * @author Diego
 */
public class Veiculo {
    String chassi, placa, combustivel;

    public String retornaDados() {
      String dados = "";
      dados += "Chassi: " + chassi + "\n";
      dados += "\tPlaca: " + String.valueOf(placa) + "\n";
      dados += "\tCombústivel: " + combustivel+ "\n";
      return dados;
    }
}
