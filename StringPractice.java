
package stringpractice;
import java.util.Scanner;

public class StringPractice {
/*
  
    public static void main(String[] args) 
    {
        String str1="Java ";
        String str2=new String ("Java ");
         System.out.println(str1 ==str2);
       // String str2=new String("JAVA ");
        
        //char c[]= {'H','e','l','l','o'};
        //String pq = new String(c,1,3);
        
       // byte b[]= {65,66,67,68};
        //String pq1 = new String(b,1,4);
        
        //System.out.println(pq1);
    }*/
   



    public static void main(String[] args)
    {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
       int l =   A.length();
        int c = B.length();
        int p = l + c;
        System.out.println(p);
        
        int s = A.compareTo(B);
        if (s<0)
        {
            System.out.println("No");
        }
            else
        { 
            System.out.println("Yes");
        }
        
}
}