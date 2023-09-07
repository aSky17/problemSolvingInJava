import java.util.*;

public class PetersonNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        peterson(num);
    }

    static int factorial(int temp1)
    {
        int prod = 1;
        for(int i = temp1;i>=1;i--)
        {
            prod = prod*i;
        }
        return prod;
    }
    static void peterson(int num)
    {
        int temp = num;
        int temp1 = num;
        int sum = 0;

        while(num>0)
        {
            temp = num%10;
            sum += factorial(temp);
            num = num/10;
        }
        if(temp1==sum)
        {
            System.out.println("Number is Peterson");
        }
        else {
            System.out.println("Number is not peterson");
        }
    }
}
