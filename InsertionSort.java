import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {9,65,-1,4,0,8,0,-4 };
        System.out.println("Array before sorting: "+Arrays.toString(arr));
        insertion(arr);
        System.out.println("Array after sorting: "+Arrays.toString(arr));
    }
    static void insertion(int[] arr)
    {
        for(int i = 0;i<arr.length-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
                else{
                    break;
                }
            }
        }
    }
}
