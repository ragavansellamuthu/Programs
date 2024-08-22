package programs.leetcode.string;

public class FirstUniqueCharacter {

	public static void main(String[] args) {
		String s = "loveleetcode";
		int index = firstUniqueCharacter(s);
		if (index != -1) {
			System.out.println("Index : " + index);
		} else {
			System.out.println("No unique character exists");
		}
	}
	
//	Hint - Constraint (2) : s consists of only lowercase English letters.
	
	public static int firstUniqueCharacter(String s) {
		
		int[] frequency = new int[26] ; 
		for( char c : s.toCharArray()) {
			++frequency[c-'a'];
		}
		for(int i=0 ; i<s.length() ; i++) {
			if(frequency[s.charAt(i)-'a'] ==1) {
				return i ;
			}
		}
		return -1 ; 
	}

//	public static int firstUniqueCharacter(String s) {
//		Map<Character,Integer> map = new HashMap<Character,Integer>();
//		for(char c : s.toCharArray()) {
//			map.put(c, map.getOrDefault(c, 0) + 1);
//		}
//		for(int i=0 ; i<s.length() ; i++) {
//			if(map.get(s.charAt(i))==1) {
//				return i;
//			}
//		}
//		return -1;
//	}

}
