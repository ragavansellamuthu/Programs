package programs.leetcode.array;

public class JumpGame2 {

	public static void main(String[] args) {
		int[] nums = { 2, 3, 1, 1, 4 };
		System.out.println("Minimum Jump : " + minimumJump(nums));
	}
	
	public static int minimumJump(int[] nums) {
        int jumps = 0;
        int farthest = 0;  
        int currentEnd = 0;  
        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
                if(currentEnd>=nums.length-1){
                    break;
                } 
            }
        }       
        return jumps;
	}

}
