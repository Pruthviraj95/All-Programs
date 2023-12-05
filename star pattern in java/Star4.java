/*
    |    *
    |   **
    |  * *
    | *  *
    |*****

 */
public class Star4 {
    public static void main(String[] args) {
      for(int i=0;i<5;i++){
        for(int j=5;j-i>0;j--){
            System.out.print(" ");
        }
        for(int j=0;j<=i;j++){
            if(i==4||j==0||i==j){
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
