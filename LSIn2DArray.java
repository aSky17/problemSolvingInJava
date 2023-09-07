// once u visit again try finding all numbers
import java.util.Arrays;

public class LSIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {24,34,2,43},
                {45,56,23,546,453,2345},
                {87,23},
                {53,43,65,27,29}};
        int target = 23;
        int ans[] = searching(arr, target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] searching(int[][] arr, int target)
    {
        for(int i = 0;i< arr.length;i++)
        {
            for(int j = 0;j< arr[i].length;j++)
            {
                if(arr[i][j]==target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

}
