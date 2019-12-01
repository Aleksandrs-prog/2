import java.util.Scanner;
class solutionone
{
    public static boolean Palindrome(String s)
    {  
        if(s.length() == 0 || s.length() == 1)
            return true; 
        if(s.charAt(0) == s.charAt(s.length()-1))
        return Palindrome(s.substring(1, s.length()-1));
        return false;
    }

    public static void main(String[]args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Ievadiet vardu:");
        String string = scn.nextLine();
        if(Palindrome(string))
            System.out.println(string + " palindroms");
        else
            System.out.println(string + " nav palindroms");
    }
}