package programs.leetcode.general;

public class PowerOfThree {

	public static void main(String[] args) {
		int n = 9;
		if (isPowerOfThree(n)) {
			System.out.println("Power of three");
		} else {
			System.out.println("Not a power of three");
		}
	}

//	Using Loop : 
		
//	public static boolean isPowerOfThree(int n) {
//		while (n>1) {
//			if (n % 3 != 0) {
//				return false;
//			} else {
//				n /= 3;
//			}
//		}
//		return n==1;
//	}
	
//	Using Recursion :
	
	public static boolean isPowerOfThree(int n) {
		if(n==1) {
			return true ;
		} else if (n==0 || n%3!=0) {
			return false;
		} else {
			return isPowerOfThree(n/3);
		}
	}

}
