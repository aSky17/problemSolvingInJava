public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {-23,-21,0,23,54,67,89,123,987};
        int target = 67;
        int ans = binarySearch(arr,target);
        System.out.println("Element found at index: "+ans);
    }
    static int binarySearch(int arr[], int target){

        int start = 0;
        int end = arr.length-1;


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
                return mid;
            }
        }
        return -1;
    }
}
