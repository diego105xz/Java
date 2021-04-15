package Aula06;
import java.util.Scanner;
//Exceções de pré-compilação
//: Quando é preciso importar uma classe. (Classe Scanner)

public class Teste02 {
    public static void main(String[] args) {
        String texto;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o texto: ");
        texto = leitor.nextLine();
        System.out.println("Você digitou: " + texto);
        leitor.close();
    }
}
