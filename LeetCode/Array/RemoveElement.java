package programs.leetcode.array;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		int nums[] = {0,1,2,2,3,0,4,2};
		int val = 2 ;
		int frequency = removeElement(nums,val);
		System.out.println("Frequency : " + frequency);
		System.out.println("Array after removing " + val + " : " + Arrays.toString(nums));
	}

	private static int removeElement(int[] nums, int val) {
		int k = 0;
		for(int i=0;i<nums.length;i++) {
			if(val!=nums[i]) {
				nums[k++]=nums[i];
			}
		}
		return k;
	}

}
