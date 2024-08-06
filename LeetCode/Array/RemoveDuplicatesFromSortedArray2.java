package programs.leetcode.array;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray2 {

	public static void main(String[] args) {
		int nums[] = {0,0,1,1,1,1,2,3,3};
		System.out.println("Element Count : " + removeDuplicates(nums));
		System.out.println("Array after removing duplicates : " + Arrays.toString(nums));
	}

	private static int  removeDuplicates(int[] nums) {
		int k = 2;
		for(int i=2;i<nums.length;i++) {
			if(nums[i]!=nums[k-2]) {
				nums[k++]=nums[i];
			}
		}
		return k ; 
	}

}
