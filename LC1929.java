import java.util.Arrays;

public class LC1929 {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        int[] ans = func(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int[] func(int nums[])
    {
        int CONST = 1001;
        for(int i = 0;i<nums.length;i++)
        {
            int a = nums[i];
            int b = nums[a]%CONST;
            nums[i] = a+b*CONST;
        }
        for(int i = 0;i<nums.length;i++)
        {
            nums[i] /= CONST;
        }
        return nums;
    }
}
