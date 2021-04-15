package Aula06;
import java.util.Scanner;
//Exceções de pós-compilação
//Erro na console: Digite um número inteiro: abc
//O erro é mostrado em vermelho e há dicas de onde ele ocorreu.

public class Teste03 {
    public static void main(String[] args) {
        int x;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        x = leitor.nextInt();
        System.out.println("Você digitou: " + x);
        leitor.close();
    }
}
