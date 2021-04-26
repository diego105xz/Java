package controller;

import java.io.Serializable;
import java.sql.Connection;

/**
 *
 * @author Diego
 */

//Essa classe controla o acesso ao banco de dados
//Teremos os seguintes métodos:
//inserir, pesquisar, editar, atualizar , pesquisar*
//pequisar (listar e listar todos)
public class Model implements Serializable{
    //Declarar as variáveis que usaremos ao longo desta classe
    
    //Variável que irá receber uma conexão do banco
    private Connection conexao = null;
    private String statusMessage;
    
    //Método da classe
    public void insert (Object aluno){
        this.statusMessage = "Inserido com Sucesso!";
    }
}
