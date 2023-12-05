/*

*   *   * 
  * * *   
* * * * * 
  * * *   
*   *   * 
 
 */
public class Star6 {
    
    public static void main(String[] args) {
       /* for(int i=0;i<5;i++){
            for(int j=0;j<=i+i;j++){
                if(j<5){
                if(j==0||j==i+i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                }
                else{
                    
                }
            }
            System.out.println();
        }
    }
    */
    for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 5 / 2 || j == 5 / 2 || i == j || i + j == 5 - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Two spaces for spacing
                }
            }
            System.out.println(); // Move to the next line after each row
        }
}
}