package Aula04;
import java.util.Scanner;
/**
 *
 * @author Diego
 */
public class SwitchCase {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Informe um valor inteiro: ");
        int a = tec.nextInt();
        switch (a) {
          case 0:
            System.out.println("A variável recebeu o valor 0");
          break;
          case 1:
            System.out.println("A variável recebeu o valor 1");
          break;
          case 2:
            System.out.println("A variável recebeu o valor 2");
          break;
          default:
          System.out.println("A variável recebeu um valor diferente de 0, 1, 2");
        }
    }
}
