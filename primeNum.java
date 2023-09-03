import java.util.Scanner;

public class primeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("");
        prime(num);
    }

    static void prime(int num)
    {
        int counter = 1;
        int i = 2;
        while(i!=num)
        {
            if(num%i==0)
            {
                counter++;
                break;
            }
            i++;
        }
        if(counter!=1)
        {
            System.out.println("Number is not prime");
        }
        else
        {
            System.out.println("Number is prime");
        }

    }
}

