package programs.leetcode.array;

import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		int[] digits = { 8, 9, 9 };
		System.out.println("Plus One : " + Arrays.toString(plusOne(digits)));
	}

	public static int[] plusOne(int[] digits) {
		for (int i = digits.length-1; i >= 0; i--) {
			if(digits[i]<9) {
				++digits[i];
				return digits;
			} else {
				digits[i]=0;
			}
		}
		int[] nums = new int[digits.length+1];
		nums[0]=1;
		return nums;
	}

}
