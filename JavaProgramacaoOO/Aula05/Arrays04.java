/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula05;

/**
 *
 * @author Diego
 */
public class Arrays04 {
    public static void main(String args[]) {
  //Cria o array que pode armazenar 3 pessoas:
    Pessoa listaPessoas[] = new Pessoa[3];

    //Pessoa 1
    listaPessoas[0] = new Pessoa();
    listaPessoas[0].nome = "Fulano";
    listaPessoas[0].idade = 20;
    listaPessoas[0].email = "fulano@teste.com.br";

    //Pessoa 2
    listaPessoas[1] = new Pessoa();
    listaPessoas[1].nome = "Beltrano";
    listaPessoas[1].idade = 30;
    listaPessoas[1].email = "beltrano@teste.com.br";

    //Pessoa 3
    listaPessoas[2] = new Pessoa();
    listaPessoas[2].nome = "Sicrano";
    listaPessoas[2].idade = 40;
    listaPessoas[2].email = "sicrano@teste.com.br";

    //Mostrar na tela os dados das pessoas, usando while:
    int i = 0;
    while (i <= 2) {
      System.out.println("Dados da pessoa " + (i + 1) + ":");
      System.out.println("\t" + listaPessoas[i].nome);
      System.out.println("\t" + listaPessoas[i].idade);
      System.out.println("\t" + listaPessoas[i].email);
      i++;
    }
  }
}
