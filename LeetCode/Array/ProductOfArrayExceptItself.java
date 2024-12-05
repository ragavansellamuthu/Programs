package programs.leetcode.array;

import java.util.Arrays;

public class ProductOfArrayExceptItself {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		System.out.println(Arrays.toString(getAnswer3(nums)));
	}

	public static int[] getAnswer(int[] nums) {
		int[] answer = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			int product = 1;
			for (int j = 0; j < nums.length; j++) {
				if (i != j) {
					product *= nums[j];
				}
			}
			answer[i] = product;
		}
		return answer;
	}

	public static int[] getAnswer1(int[] nums) {
		int[] answer = new int[nums.length];
		// answer[i] = left[i] * right[i] ;
		int[] left = new int[nums.length];
		int[] right = new int[nums.length];

		// left[i] = left[i-1] * nums[i-1];
		left[0] = 1;
		for (int i = 1; i < nums.length; i++) {
			left[i] = left[i - 1] * nums[i - 1];
		}

		// right[i] = right[i+1] * nums[i+1]
		right[nums.length - 1] = 1;
		for (int i = nums.length-2; i >= 0; i--) {
			right[i] = right[i + 1] * nums[i+1];
		}

		for (int i = 0; i < nums.length; i++) {
			answer[i] = left[i] * right[i];
		}

		return answer;
	}
	
	public static int[] getAnswer3(int[] nums) {
		int n = nums.length;
	    int[] answer = new int[n];
	    answer[0] = 1;
	    for (int i = 1; i < n; i++) {
	    	answer[i] = answer[i - 1] * nums[i - 1];
	    }
	    int right = 1;
	    for (int i = n - 1; i >= 0; i--) {
	    	// Now : right = right[i]
	    	//answer[i] = left[i] * right[i]; answer[i] = left[i]
	    	//answer[i] = answer[i]* right ; 
	    	answer[i] *= right;
	    	
	    	// Now : right = right[i-1]; after the loop ends or before the next iteration begins
	    	//right[i] = right[i+1]*nums[i+1]
	    	//right[i-1] = right[i-1+1]*nums[i-1+1]
	    	//right[i-1] = right[i] * nums[i]
	    	//right = right * nums[i] ; Assignment operator : right -> left
	        right *= nums[i];
	    }
	    return answer;
	}

}

