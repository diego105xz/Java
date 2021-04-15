package Aula04;
/**
 *
 * @author Diego
 */
public class Fatorial02 {
   public static void main (String args[]) {
        int fat = 5;
        int resul = 1;
        for(int i = fat; i > 1; i--) {
          resul *= fat; 
          fat--;
        }
        System.out.println(resul);
    } 
}
