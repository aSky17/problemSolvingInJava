public class CeilingInArray {


    public static void main(String[] args) {
        int[] arr = {2,5,7,9,10,11,15,17,19,39,50};
        int target = -3;
        int ans = ceil(arr,target);
        System.out.println(ans);
    }

    static int ceil(int arr[],int target){
        int start = 0;
        int end = arr.length-1;
        if(target>arr[end]){
            return -1;
        }


        while(start<=end)
        {
            int mid = start + (end-start)/2;

            if(target<arr[mid]){
                end = mid - 1;
            }
            else if(target>arr[mid]){
                start = mid + 1;
            }
            else{
                return arr[mid];
            }
        }
        return arr[start];
    }
}
