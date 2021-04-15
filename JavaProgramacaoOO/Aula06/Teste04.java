package Aula06;
import java.util.InputMismatchException; //trata o tipo de dado informado
import java.util.Scanner;

//Exemplo: Tratamento da exceção tipo de dado de entrada

public class Teste04 {
    public static void main(String[] args) {
        int x;
        Scanner leitor = new Scanner(System.in);
        try {
            System.out.print("Digite um número inteiro: ");
            x = leitor.nextInt();
            System.out.println("Você digitou: " + x);
            leitor.close();
        }
        catch (InputMismatchException IME) { //tipo diferente de inteiro
            System.out.println("O valor informado não é inteiro!");
        }
        System.out.println("\n\n\tO programa pode continuar...!");
    }
}
