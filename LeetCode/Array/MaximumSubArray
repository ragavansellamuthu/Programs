package programs.leetcode.array;

public class MaximumSubArray {

	public static void main(String[] args) {
		int nums[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println("Maximum Contiguous Sum : " + largestSum(nums));
	}

	public static int largestSum(int[] nums) {
		int currentSum = nums[0];
		int maximumSum = nums[0] ; 
		for(int i=1;i<nums.length;i++) {
			if(currentSum + nums[i] > nums[i]) {
				currentSum += nums[i];
			} else  {
				currentSum = nums[i];
			}
			maximumSum = maximumSum > currentSum ? maximumSum : currentSum;
		}
		return maximumSum ;
	}

}

// Next Element : Last Element / First Element of the subArray.
