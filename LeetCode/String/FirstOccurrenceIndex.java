package programs.leetcode.string;

public class FirstOccurrenceIndex {

	public static void main(String[] args) {
		String haystack = "mississipipi";
		String needle = "issipi";
		System.out.println("First Occurrence Index : " + firstIndex(haystack, needle));
	}

//	Without using indexOf() :
	private static int firstIndex(String haystack, String needle) {
		int m = haystack.length();
		int n = needle.length();
		if (m >= n) {
			for (int i = 0; i <= m-n; i++) {
				if (haystack.charAt(i) == needle.charAt(0) && haystack.substring(i, i + n).equals(needle)) {
                    return i;
                }
			}
		}
		return -1;
	}

//	public static int firstIndex(String hayStack , String needle) {		
//		return hayStack.indexOf(needle) ; 
//	}

}
