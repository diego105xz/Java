package Aula07;

/**
 *
 * @author Diego
 */
public class Aluno extends Pessoa {
    int ra;
    String curso;

    public String retornaDadosAluno() {
      String dados;

      //Pega os dados da classe herdada
      dados = super.retornaDados();

      //Acrescenta os dados do aluno:
      dados += "\tRA: " + ra + "\n";
      dados += "\tCurso: " + curso + "\n";

      return dados;   
    }
}
