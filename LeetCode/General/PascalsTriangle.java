package programs.leetcode.general;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

	public static void main(String[] args) {
		int numRows = 5 ; 
		System.out.println("Pascal's Triangle : " + generate(numRows));
	}
	
	private static List<List<Integer>> generate(int numRows){
		List<List<Integer>> solution = new ArrayList<>();
		for(int i = 1 ; i <= numRows ; i++ ) {
			List<Integer> row = new ArrayList<Integer>();
			for(int j = 1 ; j <= i ; j++) {
				if(j==1 || j==i) {
					row.add(1);
				} else {					
				    row.add(solution.get(i-2).get(j-1)+solution.get(i-2).get(j-2));
				}
			}
			solution.add(row);
		}
		return solution;
	}
	
}



