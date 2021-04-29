package Aula07;

/**
 *
 * @author Diego
 */
public class Pessoa {
    String nome, rg, cpf, endereco, telFixo, telCelular;

    //monta e retornar uma String com os dados da Pessoa
    public String retornaDados() {
      String dados = "";
      dados += "Nome: " + nome + "\n";
      dados += "\tRG: " + rg + "\n";
      dados += "\tCPF: " + String.valueOf(cpf) + "\n";
      dados += "\tEndereco: " + endereco + "\n";
      dados += "\tTelefone fixo: " + telFixo + "\n";
      dados += "\tTelefone cel.: " + telCelular + "\n";
      return dados;
    }
}
