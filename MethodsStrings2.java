package stringpractice;

public class MethodsStrings2
{
    public static void main(String[] args)
    {
        String str = new String ("Java program");
        String str1 = "Java program";
        String str2 = "Java Program";
        
        System.out.println(str==str1);
        System.out.println (str1.equalsIgnoreCase(str2));
    }
}
