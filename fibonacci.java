import java.util.Scanner;
public class fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit of your fibonacci series: ");
        int limit = sc.nextInt();
        int a = 0;
        int b = 1;
        int nextNum = 0;
        System.out.print("Fibonacci Series: ");
        System.out.print(+a+" "+b+" ");
        for(int i = 2;i<limit;i++)
        {
            nextNum = a+b;
            System.out.print(nextNum+" ");
            a = b;
            b = nextNum;
        }

    }

}
