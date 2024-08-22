package programs.leetcode.array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class IntersectionOfTwoArrays2 {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 2, 1 };
		int[] nums2 = { 2, 2 };
		System.out.println("Intersection : " + Arrays.toString(intersection(nums1, nums2)));
	}

	private static int[] intersection(int[] nums1, int[] nums2) {
		List<Integer> list = new LinkedList<Integer>();
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int i = 0;
		int j = 0;
		while (i < nums1.length && j < nums2.length) {
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
		for (i = 0; i < list.size(); i++) {
			intersection[i] = list.get(i);
		}
		return intersection;
	}

}
