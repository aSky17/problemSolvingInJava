import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr1 = {5,6,3,2,7,7,7,7,56,32,4,2,12};
        int[] arr = {3,1,5,4,2};
        System.out.println("Unsorted array: "+ Arrays.toString(arr));
        int[] ans = bubble(arr);
        System.out.println("Sorted array: "+ Arrays.toString(arr));


        // Test stability
//        boolean isStable = isStableSort(arr, ans); // forcefully had to store it in a new array coz of this
//        System.out.println("Is the sort stable? " + isStable);

    }

    static int[] bubble(int[] arr){
        boolean swapped;
        for(int i = 0;i<arr.length-1;i++)
        {
            swapped = false;
            for(int j = 1;j<arr.length-i;j++)
            {
                //swap if the previous item is greater than the current element
                if(arr[j-1]>arr[j])
                {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }

            }
            if(swapped==false){
                return arr;
            }
        }
        return arr;
    }
//    static boolean isStableSort(int[] original, int[] sorted) {
//        for (int i = 0; i < sorted.length - 1; i++) {
//            for (int j = i + 1; j < sorted.length; j++) {
//                for (int k = 0; k < original.length - 1; k++) {
//                    for (int l = k + 1; l < original.length; l++) {
//                        if (original[k] == original[l] && original[k] == sorted[j] && original[l] == sorted[i]) {
//                            // If the order of equal elements is different in the sorted array, it's not stable
//                            if (i > j || (i == j && k > l)) {
//                                return false;
//                            }
//                        }
//                    }
//                }
//            }
//        }
//        return true;
//    }
}


