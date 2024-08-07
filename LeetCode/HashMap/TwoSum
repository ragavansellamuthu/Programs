package programs.leetcode.hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int nums[] =  {3,2,4};
		int target = 6 ;
		System.out.println("Indices : " + Arrays.toString(twoSum(nums,target)));
	}

	private static int[] twoSum(int[] nums, int target) {
		int[] solution = new int[2];
		Map<Integer,Integer> map = new HashMap<>(); 
		for(int i=0;i<nums.length;i++) {
			int compliment = target - nums[i];
			if(map.containsKey(nums[i])) {
				solution[0]=map.get(nums[i]);
				solution[1]=i;
			} else {
				map.put(compliment, i);
			}
		}
		return solution ;
	}

}
