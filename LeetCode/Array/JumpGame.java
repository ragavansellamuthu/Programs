package programs.leetcode.array;

public class JumpGame {

	public static void main(String[] args) {
		int[] nums = { 2, 3, 1, 1, 4 };
		if (canJump(nums)) {
			System.out.println("Reachable");
		} else {
			System.out.println("Not Reachable");
		}
	}

	public static boolean canJump(int[] nums) {
		int reach = 0;
		for (int i = 0; i < nums.length; i++) {
			if (reach < i) {
				return false;
			} else if (reach >= nums.length) {
				return true;
			}
			reach = Math.max(reach, i + nums[i]);
		}
		return true;
	}

}
