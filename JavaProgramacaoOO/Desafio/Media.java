package Desafio;
import java.util.Scanner;
/**
 *
 * @author Diego
 */
public class Media {
    public static void main(String[] args) {
        int qtdeAlunos, i, idade=0;
        float media = 0, somaIdades=0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantidade de alunos na turma: ");
        qtdeAlunos = teclado.nextInt();
        for (i=0; i<qtdeAlunos; i++) {
          System.out.print("Informe a idade do " + (i+1) + "o. aluno: ");
          idade = teclado.nextInt();
          somaIdades += idade;
        }
        teclado.close();
        media = somaIdades/qtdeAlunos;
        System.out.println("Qtde Alunos " + qtdeAlunos);
        System.out.println("Soma Idades " + somaIdades);
        System.out.println("A idade media dos alunos e " + media);
    }
}
