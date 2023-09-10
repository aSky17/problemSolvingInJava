import java.util.Scanner;

public class TechNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        tech(num);
    }
    static void tech(int num)
    {

        int temp1 = num;
        double counter = 0;
        int numPartOne = 0;
        int numPartTwo = 0;
        while(num>0)
        {
            int temp = num%10;
            num = num/10;
            counter++;
        }
        if(counter%2==0)
        {
           numPartOne = (int) (temp1/Math.pow(10,(counter/2)));
           numPartTwo = (int) (temp1%Math.pow(10,(counter/2)));
           int sum = numPartOne+numPartTwo;
           int square = sum*sum;
           if(temp1==square)
           {
               System.out.println("A tech number");
           }
           else
           {
               System.out.println("Not a tech number");
           }

        }
        else
        {
            System.out.println("Not a tech number");
        }
    }
}
