package programs.leetcode.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		int[] nums1 = { 4, 9, 5 };
		int[] nums2 = { 9, 4, 9, 8, 4 };
		System.out.println("Intersection : " + Arrays.toString(intersection(nums1, nums2)));
	}
	
//	Less RunTime 
	
	private static int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet<Integer>();
		for(int num : nums1) {
			set.add(num);
		}
		Set<Integer> intersection = new HashSet<Integer>();
		for(int num : nums2) {
			if(set.contains(num)) {
				intersection.add(num);
			}
		}
		int[] solution = new int[intersection.size()];
		int i = 0 ;
		for(int num : intersection ) {
			solution[i++] =  num;
		}
		return solution;
	}
	
//	Less Memory

	private static int[] intersection1(int[] nums1, int[] nums2) {
		List<Integer> list = new LinkedList<Integer>();
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int i = 0;
		int j = 0;
		while (i < nums1.length && j < nums2.length) {
			while (i < nums1.length - 1 && nums1[i] == nums1[i + 1]) {
				i++;
			}
			while (j < nums2.length - 1 && nums2[j] == nums2[j + 1]) {
				j++;
			}
			if (nums1[i] == nums2[j]) {
				list.add(nums1[i]);
				i++;
				j++;
			} else if (nums1[i] < nums2[j]) {
				i++;
			} else {
				j++;
			}
		}
		int[] intersection = new int[list.size()];
		for(i = 0 ; i < list.size();i++ ) {
			intersection[i] = list.get(i);
		}
		return intersection ;
	}

}
