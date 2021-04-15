package Aula03;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class CalculadoraIMC {
   public static void main(String[] args) {
        //Declaracao do scanner:
        Scanner leitor = new Scanner(System.in);
        //Declaracao das variaveis que serao utilizadas:
        float peso, altura, imc;
        //Informacao de instrucoes para o usuário:
        System.out.print("Informe o PESO: ");
        //le e armazena o valor do peso:
        peso = leitor.nextFloat(); //Le um valor de ponto flutuante
        //le e armazena o valor da altura:
        System.out.print("Informe a ALTURA: ");
        altura = leitor.nextFloat(); //Le um valor de ponto flutuante
        //calcula:
        imc = peso / (altura * altura);
        //Imprime o resultado
        System.out.println("\n\tO IMC desta pessoa é " + imc + "\n\n");
    }
 
}
