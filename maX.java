public class maX {
    public static void main(String[] args) {
        int arr[] = {23,465,23,656,5323,353};
        System.out.print("Array = ");
        for(int i = 0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        max(arr);
    }
    static void max(int arr[])
    {
        int max = arr[0];
        for(int i = 0;i< arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.println("");
        System.out.println("Maximun in the array is: "+max);
    }
}
