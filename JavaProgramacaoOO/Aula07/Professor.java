package Aula07;

/**
 *
 * @author Diego
 */
public class Professor extends Pessoa {
    int matricula;
    float salario;

    public String retornaDadosProfessor() {
      String dados;

      //Pega os dados da classe herdada
      dados = super.retornaDados();

      //Acrescenta os dados do aluno:
      dados += "\tMatricula: " + matricula + "\n";
      dados += "\tSalario: " + salario + "\n";

      return dados;
    }
}
