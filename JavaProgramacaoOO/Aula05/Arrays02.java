package Aula05;

/**
 *
 * @author Diego
 */
public class Arrays02 {
  
  public static void main(String[] args) {
    int x = 0;
    int maior[] = new int[10];
    maior[0] = 1;
    maior[1] = 2;
    maior[2] = 3;
    maior[3] = 4;
    maior[4] = 10;
    maior[5] = 6;
    maior[6] = 7;
    maior[7] = 8;
    maior[8] = 9;
    maior[9] = 5;
    for (int i = 0; i <= 9; i++) {
      if (maior[i] > x) {
        x = maior[i];
      }
    }
    System.out.println(x);
  }
}
