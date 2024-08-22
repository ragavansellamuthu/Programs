package programs.leetcode.array;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		char[] s = { 'h', 'e', 'l', 'l', 'o' };
		reverse(s);
		System.out.println("Reversed String : " + Arrays.toString(s));
	}

	private static void reverse(char[] s) {
		int n = s.length;
		char temp = ' ';
		for (int i = 0; i < n/2; i++) {
			temp = s[i];
			s[i]= s[n-1-i];
			s[n-1-i]=temp;
		}
	}

}
