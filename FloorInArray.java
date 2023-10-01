public class FloorInArray {
    public static void main(String[] args) {
        int[] arr = {2,5,7,9,10,11,15,17,19,39,50};
        int target = 0;
        int ans = floor(arr,target);
        System.out.println(ans);
    }
    static int floor(int arr[], int target){
        int start = 0;
        int end = arr.length-1;
        if(target<arr[start]){
            return -1;
        }
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            }
            if (target > arr[mid]) {
                start = mid + 1;
            }
            if (target == arr[mid]) {
                return arr[mid];
            }
        }
        return arr[end];
    }
}
