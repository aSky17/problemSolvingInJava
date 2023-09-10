import java.util.Scanner;

public class SunnyNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        sunny(num);

    }
    static void sunny(int num)
    {
        int numPlusOne = num+1;
        double squareRoot = Math.sqrt(numPlusOne);
        if(squareRoot==(numPlusOne/squareRoot))
        {
            System.out.println("Number is sunny");
        }
        else {
            System.out.println("Number is cloudy");
        }

    }

}
