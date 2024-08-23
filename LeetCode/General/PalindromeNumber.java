package programs.leetcode.general;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num = 121;
		if (isPalindromeNumber(num)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
	}

	private static boolean isPalindromeNumber(int num) {
		int n = num;
		int rev = 0;
		while (n > 0) {
			int remainder = n % 10;
			rev = rev*10 + remainder;
			n /= 10;
		}
		return num==rev;
	}

}
