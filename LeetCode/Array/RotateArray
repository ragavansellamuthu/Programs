package programs.leetcode.array;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3 ; 
		rotate(nums,k);
		System.out.println("Array after " + k + " rotation : " + Arrays.toString(nums));
	}

	public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n; 
        reverse(nums, 0, n - 1); 
        reverse(nums, 0, k - 1); 
        reverse(nums, k, n - 1); 
    }

    private static void reverse(int[] nums, int start, int end) {
    	for(int i=start,j=end;i<j;i++,j--) {
    		int temp = nums[i];
    		nums[i]=nums[j];
    		nums[j]=temp;
    	}
    }
}
