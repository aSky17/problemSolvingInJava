public class miN
{
    public static void main(String[] args) {
        int arr[] = {23,465,23,656,5,353};
        System.out.print("Array = ");
        for(int i = 0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        min(arr);
    }

    static void min(int[] arr)
    {
        int min = arr[0];
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]<min)
          {
            min = arr[i];
          }
        }
        System.out.println("");
        System.out.println("Maximun in the array is: "+min);
    }
}
