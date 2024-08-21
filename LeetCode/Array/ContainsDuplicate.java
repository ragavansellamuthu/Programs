package programs.leetcode.array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] nums = {1,2,3,1} ;
		if(containsDuplicate(nums)) {
			System.out.println("Duplicate Array");
		} else {
			System.out.println("Distinct Array");
		}
	}

	public static boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		for(int num : nums) {
			if(!set.add(num)) {
				return true;
			}
		}
		return false ;
	}
	
}
