package Aula01;
import java.util.Scanner;
/**
 *
 * @author Diego
 */
public class Pergunta {
    public static void main(String[] args) {
        String texto;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o texto: ");
        texto = leitor.nextLine();
        System.out.println("Você digitou: " + texto);
        leitor.close();
    }

}
