package Aula07;

/**
 *
 * @author Diego
 */
public class Principal {

  public static void main(String args[]) {
    Aluno a1 = new Aluno();
    Professor p1 = new Professor();    
    
    //Podemos acessar diretamente
    //os atributos da classe Pessoa.
    //Porque aluno a1 é um Objeto da classe Aluno
    //que herda da classe Pessoa.
    a1.nome = "Pedro Silva";
    a1.ra = 1234567890;
    a1.cpf = "001.002.003-00";
    a1.rg = "999999-X";
    a1.curso = "TADS";
    a1.endereco = "Rua A, 10";
    a1.telFixo = "(11) 1111-1111";
    a1.telCelular = "(11) 9999-9999";
    
    //idem para professor...
    p1.nome = "Carlos Campos";
    p1.matricula = 90020;
    p1.salario = 1200.00F;
    p1.cpf = "000.000.000-10";
    p1.rg = "111111-Y";
    p1.endereco = "Avenida B, 20";
    p1.telFixo = "(11) 0000-0000";
    p1.telCelular = "(11) 88888-8888";    

    //Imprimir os dados do aluno a1
    System.out.println("Dados do aluno: ");
    System.out.println(a1.retornaDadosAluno());

    //Imprimir os dados do professor p1    
    System.out.println("Dados do professor: ");
    System.out.println(p1.retornaDadosProfessor());
    
  }

}
