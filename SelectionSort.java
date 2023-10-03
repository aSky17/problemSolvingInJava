import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int maxIndex(int arr[],int start,int last)
    {
        int max = start;
        for(int i = start;i<=last;i++)
        {
            if(arr[i]>arr[max])
            {
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static void selection(int[] arr){
        for(int i = 0;i<arr.length-1;i++)
        {
            int last = arr.length-1-i;
            int maxIndex = maxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

}
