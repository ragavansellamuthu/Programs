package programs.leetcode.general;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

	public static void main(String[] args) {
		int n = 19;
		if (isHappy(n)) {
			System.out.println("Happy Number");
		} else {
			System.out.println("Not a Happy Number");
		}
	}

	private static boolean isHappy(int n) {
		Set<Integer> sumSet = new HashSet<Integer>();
		int sum = 0 ;
		while (n > 0) {
			int temp = n % 10;
			sum += temp * temp;
			n /= 10;
			if (n == 0) {
				if(sum==1) {
					return true;
				} else if (sumSet.contains(sum)) {
					return false;
				} else {
					sumSet.add(sum);
					n = sum ; 
					sum = 0;
				}
			}
		}

		return false;
	}

}
