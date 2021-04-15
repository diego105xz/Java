package Aula06.Desafio;
import java.util.Scanner;
/**
 *
 * @author Diego
 */
public class Cinema {
    public static void main(String args[]) {
        int x;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite sua Idade: ");        
        try {
            x = leitor.nextInt();
            if (x < 16)
            throw new ExcecaoIdade(x);
        }
        catch (ExcecaoIdade e) {
            System.out.println("CLASSIFICAÇÃO INDICATIVA NÃO RECOMENDADO PARA MENOR DE 16 ANOS!!\n\n " + e );
        }
    }
}
