import java.util.Scanner;

public class NarcissisticNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        boolean ans = NarcissisticNum(num);
        System.out.println(ans);
    }
    static boolean NarcissisticNum(int num)
    {
        int temp = num;
        int temp1 = num;
        int counter= 0;
        double sum = 0;
        while(temp>0)
        {
            temp = temp/10;
            ++counter;

        }
        for(int i = 0;i<counter+1;i++)
        {
            int last = temp1%10;
            sum = (sum)+Math.pow(last,counter);
            temp1 = temp1/10;
        }
        if(num==(int)sum)
        {
            return true;
        }
        return false;
    }
}
