import java.util.Scanner;

public class AutomorphicNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        boolean ans  = automorphic(num);
        System.out.println(ans);
    }
    static boolean automorphic(int num)
    {
        int square = num*num;
        while(num>0) {
            if (num % 10 != square % 10) {
                return false;
            }
            num = num / 10;
            square = square / 10;
        }
        return true;
    }
}
