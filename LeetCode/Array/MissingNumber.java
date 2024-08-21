package programs.leetcode.array;

public class MissingNumber {

	public static void main(String[] args) {
		int nums[] = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		System.out.println("Missing Number : " + missingNumber(nums));
	}

	public static int missingNumber(int[] nums) {
		int n = nums.length;
		int sum = (n * (n + 1)) / 2;
		for (int num : nums) {
			sum -= num;
		}
		return sum;
	}

}
