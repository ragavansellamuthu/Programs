package programs.leetcode.general;

public class ClimbingStairs {

	public static void main(String[] args) {
		int n = 5; 
		System.out.println("Solution : " + solution(n));
	}
	
	public static int solution( int n) {
		int previous = 0 ; 
		int current = 1 ; 
		while(n-->0) {		
			current += previous ;
			previous = current-previous ; 
		}
		return current ; 
	}
	
}

/* 
 * n=1 : 1
 * n=2 : 11,2
 * n=3 : 111,12,21
 * n=4 : 1111,112,121,211,22
 * n=5 : 11111,1112,1121,1211,2111,122,221,212
 * n=6 : 111111,11112,11121,11211,12111,21111,1122,2211,1221,2112,1212,2121,222
 *
 * Number of Steps VS Number of Solutions : 
 * 
 * 1:1
 * 2:2
 * 3:3
 * 4:5
 * 5:8
 * 6:13
 * 
 * */
