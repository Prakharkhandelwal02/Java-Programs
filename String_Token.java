/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringToken;
    import java.io.*;
import java.util.*;
/**
 *
 * @author prakh
 */
public class String_Token {
    




    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
        String token[] = s.split("[^a-zA-Z]+");
        if(s.length()==0){
            System.out.println(0);
        }else{
         System.out.println(token.length);
        }
        for(String word : token )
         System.out.println(word);
        
        scan.close();
    }
}
    

