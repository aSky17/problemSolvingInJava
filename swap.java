public class swap
{
    public static void main(String[] args) {
        int[] arr = {3,65,54,376,356,35};
        System.out.println("Array before swapping");
        for(int i = 0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        swap(arr, 3, 5);
        System.out.println("Array after swapping");
        for(int i = 0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
    static void swap(int arr[], int indexOne, int indexTwo)
    {
            int temp = arr[indexOne];
            arr[indexOne] = arr[indexTwo];
            arr[indexTwo] = temp;
    }
}
