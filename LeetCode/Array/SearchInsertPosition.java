package programs.leetcode.array;

public class SearchInsertPosition {

	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 6 };
		int target = 7;
		System.out.println("Search Insert Position : " + searchIndex(nums, target));
	}

	public static int searchIndex(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			if (target <= nums[i]) {
				return i;
			}
		}
		return nums.length;
	}

}
