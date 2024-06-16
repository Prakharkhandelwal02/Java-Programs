
package stringpractice;


public class RegularExpression 
{
            public static void main(String[] args)
            {
                    String str1= "%";
                    System.out.println(str1.matches("."));
                    
                    String str2="a";
                    System.out.println(str2.matches("[abc]"));
                    
                     String str3="p";
                    System.out.println(str3.matches("[^abc]"));
                    
                     String str4="%";
                    System.out.println(str4.matches("[a-zA-Z0-9]"));
                    
                    String str5 = "a2";
                    System.out.println(str5.matches("[a-z][0-9]"));
                    
                    String str6 = "a";
                    System.out.println(str6.matches("a|b"));
                    
                    String str7 = "abc";
                    System.out.println(str7.matches("abc"));
                    
                    String str8 = "a";
                    System.out.println(str8.matches("\\W"));  // ( \\ will considered as single \ in java for regular expression)
                    
                    String str9 = "1";
                    System.out.println(str9.matches("\\d"));
                    
                    String str10 = " ";
                    System.out.println(str10.matches("\\s"));
                    
             }
 
    
}
