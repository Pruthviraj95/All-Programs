/*
    |    *
    |   * *
    |  *   *
    | *     *
    |*********

 */

public class Star5 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j=0;j<5-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i+i;j++){
                if(j==i+i||i==4||j==0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
