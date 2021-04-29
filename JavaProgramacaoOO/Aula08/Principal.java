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
public class Principal {
    public static void main(String args[]) {
    VeiculoCarga vc1 = new VeiculoCarga();
    VeiculoPassageiro vp1 = new VeiculoPassageiro();    
    
    vc1.chassi = "Ford";
    vc1.placa = "FTG52597";
    vc1.combustivel = "Dissel";
    vc1.cargaMax = "14.000Kg";
    vc1.qdeEixos = "2";
        
    //idem para professor...
    vp1.chassi = "chevrolet";
    vp1.placa = "CHT5697";
    vp1.combustivel = "Flex";
    vp1.qdePassageiros = "5";
    vp1.cambioAutomatico = "Sim";
    

    //Imprimir os dados do aluno a1
    System.out.println("Dados Veiculo de Carga: ");
    System.out.println(vc1.retornaDadosVeiculoCarga());

    //Imprimir os dados do professor p1    
    System.out.println("Dados Veiculo Passageiro: ");
    System.out.println(vp1.retornaDadosVeiculoPassageiro());
    
  }
}
