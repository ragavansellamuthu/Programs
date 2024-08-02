package programs.leetcode.array;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		int nums1[] = { 3, 4, 5, 0, 0, 0, 0 };
		int nums2[] = { 1, 2, 6, 7 };
		merge(nums1, 3, nums2, 4);
		System.out.println(Arrays.toString(nums1));
	}

	private static void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = m - 1;
		int j = n - 1;
		int k = m + n - 1;
		while (j >= 0) {
			if (i >= 0 && nums1[i] > nums2[j]) {
				nums1[k--] = nums1[i--];
			} else {
				nums1[k--] = nums2[j--];
			}
		}
	}
}

