/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula08;

/**
 *
 * @author Diego
 */
public class VeiculoPassageiro extends Veiculo {
    String qdePassageiros, cambioAutomatico, cor;


    public String retornaDadosVeiculoPassageiro() {
      String dados;
    
      dados = super.retornaDados();

      //Acrescenta os dados do aluno:
      dados += "\tQuantidade de Passageiros: " + String.valueOf(qdePassageiros) + "\n";
      dados += "\tCambio automatico: " + cambioAutomatico + "\n";

      return dados;
    }
}
