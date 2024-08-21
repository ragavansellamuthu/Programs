package programs.leetcode.string;

public class ValidPalindrome {

	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));
	}

	private static boolean isPalindrome(String s) {
		if (s.length() == 1) {
			return true;
		}
		s=s.toLowerCase();
		int i = 0;
		int j = s.length() - 1;
		while (i <= j) {
			while (i<j && !isAlphaNumeric(s.charAt(i))) {			
				i++;
			}
			while (i<j && !isAlphaNumeric(s.charAt(j))) {
				j--;
			}
			char left = s.charAt(i);
			char right = s.charAt(j);
			if (left != right) {
				return false;
			}
			i++;
			j--;
		}

		return true;
	}

	private static boolean isAlphaNumeric(char c) {
		return ((c >= 97 && c <= 122) || (c >= 48 && c <= 57)) ; 
	}

}
