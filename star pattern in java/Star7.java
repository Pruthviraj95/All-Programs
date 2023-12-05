/*
 
* * * * * 
  *   *   
    *     
  *   *   
* * * * *

 */
public class Star7 {
    public static void main(String[] args) {
        printAsteriskPattern(5);
    }

    public static void printAsteriskPattern(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || j == i || j + i == size - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
