package programs.leetcode.array;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int nums[] = {0,0,1,1,1,2,2,3,3,4};
		System.out.println("Distinct Element Count : " + removeDuplicates(nums));
		System.out.println("Array after removing duplicates : " + Arrays.toString(nums));
	}

	private static int  removeDuplicates(int[] nums) {
		int k=1;
		for(int i=1;i<nums.length;i++) {
			if(nums[k-1]!=nums[i]) {
				nums[k++]=nums[i];
			}
		}
		return k;
	}

}

