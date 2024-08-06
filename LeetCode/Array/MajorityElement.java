package programs.leetcode.array;

import java.util.Arrays;

public class MajorityElement {

	public static void main(String[] args) {
		int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
		System.out.println("Majority Element : " + findMajority(nums));
	}

	private static int  findMajority(int[] nums) {
		Arrays.sort(nums);
		return nums[nums.length/2];
	}

}
