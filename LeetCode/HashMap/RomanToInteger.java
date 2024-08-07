package programs.leetcode.hashmap;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static void main(String[] args) {
		String roman = "MCMXCIV";
		System.out.println("Number Format : " + num(roman));
	}
	
	public static int num(String roman) {
		int num = 0 ; // 5 | 4 | 104 | 94 | 1094 | 994 | 1994
		Map<Character,Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		int previous = 0 ; 
		 for (int i = roman.length() - 1; i >= 0; i--) {
	            char c = roman.charAt(i);
	            int current = map.get(c);
	            if (current < previous) {
	                num -= current;
	            } else {
	                num += current;
	            }
	            previous = current ;
	        }
		
		return num;
	}

}

//Roman numerals are usually written largest to smallest from left to right.
//However, the numeral for four is not IIII.
//Instead, the number four is written as IV. Because the one is before the five we subtract it making four. 
//The same principle applies to the number nine, which is written as IX. 
//There are six instances where subtraction is used:

//I can be placed before V (5) and X (10) to make 4 and 9. 
//X can be placed before L (50) and C (100) to make 40 and 90. 
//C can be placed before D (500) and M (1000) to make 400 and 900.

