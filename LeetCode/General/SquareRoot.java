package programs.leetcode.general;

public class SquareRoot {

	public static void main(String[] args) {
		int x = 121;
		System.out.println("Square Root of " + x + " : " + squareRoot(x));
	}

	public static int squareRoot(int x) {
		if (x == 0 || x == 1) {
			return x;
		}
		int left = 0;
		int right = x;
		int result = 0;
		while (left <= right) {
			int mid = left + (right-left) / 2;
			if (mid<= x/mid ) {
				result = mid;
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		return result;
	}

}

// To prevent overflow : Use Equivalents

// y^2 <= x is same as y <= x/y
// (x+y)/2 = (2x-x+y)/2 = 2x/2 + (y-x)/2 = x - (x-y)/2 

