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
public class VeiculoCarga extends Veiculo {
    String cargaMax, qdeEixos, cor;


    public String retornaDadosVeiculoCarga() {
      String dados;

      dados = super.retornaDados();
      
      dados += "\tCarga Máxima: " + String.valueOf(cargaMax) + "\n";
      dados += "\tQuantidade de Eixos: " + qdeEixos + "\n";

      return dados;   
    }
}
