import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the number of col");
        int col = sc.nextInt();
        System.out.println("Enter the matrix");
        int[][] matrix = new int[rows][col];
        for (int i = 1;i<=rows;i++)
        {
            for(int j =1;j<=col;j++)
            {
                matrix[rows][col] = sc.nextInt();
            }
        }
        spiralOrder(matrix,rows,col);
    }
    static void spiralOrder(int[][] matrix,int rows, int col)
    {
        List<Integer> l1 = new ArrayList<>();
        for (int i = 1;i<=rows;i++)
        {
            for(int j =1;j<=col;j++)
            {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
