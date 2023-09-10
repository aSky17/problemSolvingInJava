import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        boolean ans = isPalindrome(str);
        System.out.println(ans);
    }
    static boolean isPalindrome(String str)
    {

        str = str.toLowerCase();
        for(int i = 0;i<str.length();i++)
        {
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if(start != end)
            {
                return false;
            }
        }
        return true;
    }
}
