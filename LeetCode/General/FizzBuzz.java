package programs.leetcode.general;

import java.util.Arrays;

public class FizzBuzz {

	public static void main(String[] args) {
		int n = 15 ; 
		System.out.println(Arrays.toString(fizzBuzz(n)));
	}
	
	private static String[] fizzBuzz(int n) {
		String[] answer = new String[n];
		for(int i = 1 ; i <= n ; i++) {
			if(i%3==0 && i%5==0) {
				answer[i-1] = "FizzBuzz";
			} else if ( i%3==0) {
				answer[i-1] = "Fizz";
			} else if (i%5==0) {
				answer[i-1] = "Buzz";
			} else {
				answer[i-1]=String.valueOf(i);
			}
		}
		return answer ; 
	}

}
