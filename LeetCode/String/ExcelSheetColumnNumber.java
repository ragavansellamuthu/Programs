package programs.leetcode.string;

public class ExcelSheetColumnNumber {

	public static void main(String[] args) {
		String titleNumber = "A";
		System.out.println("Excel Sheet Column Number : " + titleToNumber(titleNumber));
	}

	public static int titleToNumber(String columnTitle) {
		int number = 0;
		int length = columnTitle.length();
		for (int i = 0; i < length; i++) {
			number = number * 26 +  columnTitle.charAt(i) - 64 ; 
		}
		return number;
	}

}

// Idea : 

// 768 = 100(7) + 10(6) + 8(1) 
// 7 >> 7 * (10) + 6 = 76 >> 76 * (10) + 8  = 768 

// ZY  = 26(26) + 25 = 676 + 25 = 701
// Z = 26 >> Z * (26) + Y = ( 26 * 26 ) + 25 = 676 + 25 = 701

