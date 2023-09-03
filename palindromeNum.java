import java.util.Scanner;

public class palindromeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("");
        palindrome(num);
    }
    static void palindrome(int num)
    {
        int temp = num;
        int sum = 0;
        while(temp>0)
        {
            int temp1 = temp % 10;
            sum = (sum*10) + temp1;
            temp = temp / 10;
        }
        if(sum == num)
        {
            System.out.println("Number is palindrome");
        }
        else
        {
            System.out.println("Number isn't palindrome");
        }
    }
}
