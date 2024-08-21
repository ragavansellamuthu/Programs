package programs.leetcode.string;

import java.util.Arrays;

public class ValidAnagram {

	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";
		if (isAnagram(s, t)) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not an Anagram");
		}
	}

//	Sort : (Preferable)

	private static boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		} else {
			char[] a = s.toCharArray();
			char[] b = t.toCharArray();
			Arrays.sort(a);
			Arrays.sort(b);
			return Arrays.equals(a, b);
		}
	}

//	If the strings contain only alphabets

	private static boolean isAnagram1(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		} else {
			int[] frequencies = new int[26];
			for (int i = 0; i < s.length(); i++) {
				int index1 = s.charAt(i) - 97;
				int index2 = t.charAt(i) - 97;
				frequencies[index1]++;
				frequencies[index2]--;
			}

			for (int frequency : frequencies) {
				if (frequency != 0) {
					return false;
				}
			}
			return true;
		}
	}

//  Why not StringBuilder ? 
//  indexOf      - O(n)
//  deleteCharAt - O(n)

	private static boolean isAnagram2(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		} else {
			StringBuilder builder = new StringBuilder(t);
			for (int i = 0; i < s.length(); i++) {
				char temp = s.charAt(i);
				int index = builder.indexOf(String.valueOf(temp));
				if (index == -1) {
					return false;
				}
				builder.deleteCharAt(index);
			}
			return true;
		}
	}

}
