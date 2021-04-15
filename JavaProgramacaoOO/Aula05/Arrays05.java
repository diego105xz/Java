/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula05;
import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class Arrays05 {
    public static void main(String args[]) {
    //Criando a lista do tipo pessoa
    ArrayList<Pessoa> listaPessoas = new ArrayList<>();

    //Cria um objeto de "Pessoa" para podemos adiciona-lo a lista
    Pessoa pessoaLocal = new Pessoa();
    pessoaLocal.nome = "Fulano";
    pessoaLocal.idade = 20;
    pessoaLocal.email = "fulano@teste.com.br";

    //Adiciona a pessoa a lista:
    listaPessoas.add(pessoaLocal);

    //Reaproveita a variável local para acrescentar outra pessoa
    pessoaLocal = new Pessoa(); //"reseta" a variável para poder ser reutilizada
    pessoaLocal.nome = "Beltrano";
    pessoaLocal.idade = 30;
    pessoaLocal.email = "beltrano@teste.com.br";

    //Acrescenta
    listaPessoas.add(pessoaLocal);

    //Mais uma pessoa
    pessoaLocal = new Pessoa(); //"reseta" a variável para poder ser reutilizada
    pessoaLocal.nome = "Sicrano";
    pessoaLocal.idade = 40;
    pessoaLocal.email = "Sicrano@teste.com.br";

    //Acrescenta
    listaPessoas.add(pessoaLocal);

    //Percorrendo a lista com um laço e acessando seus ítens
    for (int i = 0; i <= listaPessoas.size() - 1; i++) {
    System.out.println("Imprimindo dados da posição: " + i);
    System.out.println("\t- Nome: " + listaPessoas.get(i).nome);
    System.out.println("\t- Idade: " + listaPessoas.get(i).idade);
    System.out.println("\t- E-Mail: " + listaPessoas.get(i).email);
    System.out.println("------------------");
  }

    //Para remover, é preciso percorrer a lista, procurando o nome
    //quando for encontrado, guardar o índice que corresponde ao nome.
    int posicaoRemovida = -1; //Variável auxiliar para remoção; um número qualquer
    for (int j = 0; j < listaPessoas.size(); j++) {
      if (listaPessoas.get(j).nome.equals("Beltrano")) { //Se encontrar...
        posicaoRemovida = j; // Atribui à variável o valor do ÍNDICE
        break; //se já encontrou, o loop pode parar
      }
    }

    //Verifica se a variável auxiliar foi alterara.
    //Se sim, remove o elemento da lista.
    if (posicaoRemovida != -1) {
      listaPessoas.remove(posicaoRemovida); //Remove na posição encontrada
      System.out.println(" >> O Beltrano estava na posição " + posicaoRemovida);
    }

    //Para ter certeza da remoção, vamos percorrer e imprimir a lista novamente
    //apenas com os nomes agora.
    System.out.println("Imprimindo os nomes da lista, após a remoçao do Beltrano: ");
    for (int k = 0; k < listaPessoas.size(); k++) {
      System.out.println("\t" + k + " - " + listaPessoas.get(k).nome);
    }
  }
}
