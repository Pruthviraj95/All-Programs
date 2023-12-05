/*

    |*
    |* *
    |*   *
    |* *
    |*

*/

public class Star8 {
    public static void main(String[] args)  {
        int z=3;
        for(int i=0;i<5;i++){
            for(int j=0;j<=i+i;j++){
                if(i<4){
                    if(j==0||j==i+i){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
                  System.out.println();
    }
        for(int i=0;i<5;i++){
            for(int j=0;j<6-z;j++){
                    z=5;
                    if(j==0||j==2){

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
