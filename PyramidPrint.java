
package pyramidprint;
//import java.util.Scanner;
public class PyramidPrint {

  
    public static void main(String[] args) {
      //  Scanner sc = new Scanner (System.in);
        int i ;
        int j ;
        int k;
        int n=5;
        for(i=1;i<=n;i++)
        {
            for (j=1 ; j<=n-i ; j++) 
                System.out.print("  ");
               
         
            for (k=1; k<=i; k++)          
               System.out.print(" * ");
            
           System.out.println();
 
    }  
    }

}
