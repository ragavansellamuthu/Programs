package programs.leetcode.array;

import java.util.Arrays;

public class HIndex {

	public static void main(String args[]) {
		int citations[] = { 3, 0, 6, 1, 5 }; 
		int h = hIndex(citations);
		if(h!=-1) {
			System.out.println("H-Index : " + h);
		} else {
			System.out.println("H-Index doesn't exist");
		}
		
	}

	public static int hIndex(int[] citations) {
		Arrays.sort(citations);
		int n = citations.length;
		for (int i = 0; i < n; i++) {
			int h = n - i;
			if (citations[i] >= h) {
				return h;
			}
		}
		return -1;
	}
}
