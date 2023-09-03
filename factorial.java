import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to calculate factorial: ");
        int n = sc.nextInt();
        System.out.println("");
        factorial(n);

    }
    static void factorial(int n)
    {
        int prod = 1;
        for(int i = n;i>=1;i--)
        {
            prod = prod*i;
        }
        System.out.println("Factorial of "+n+" = "+prod);
    }
}
