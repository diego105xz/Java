package Aula04;
/**
 *
 * @author Diego
 */
public class Fatorial {
    public static void main (String args[]) {
        int fat = 5;
        int resul = fat;
        while (fat > 1) {
          resul *=(fat-1);
          fat--; //
        }
        System.out.println(resul);
    }
}
