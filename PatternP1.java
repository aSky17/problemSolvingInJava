/*
        *
        **
        ***
        ****
        *****
        ****
        ***
        **
        *
*/
public class PatternP1 {
    static int n = 5;
    public static void main(String[] args) {
        for(int i = 1;i<=2*n;i++)
        {
            int toatlRowsInColumn = i>n? (2*n-i):i;
            for(int j = 1;j<=toatlRowsInColumn;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
