package programs.leetcode.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {

		String brackets = "([}}])";

		if (isValid(brackets)) {
			System.out.println("Valid");
		} else {
			System.out.println("InValid");
		}

	}

	public static boolean isValid(String brackets) {

		if (brackets.length() % 2 != 0) {
			return false;
		}

		Map<Character, Character> map = new HashMap<>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');

		Stack<Character> openBrackets = new Stack<Character>();

		for (char bracket : brackets.toCharArray()) {
			if (map.containsKey(bracket)) {
				openBrackets.push(bracket);
			} else if (!openBrackets.isEmpty() && map.get(openBrackets.peek()) == bracket) {
				openBrackets.pop();
			} else {
				return false;
			}
		}

		return openBrackets.isEmpty();
	}

}

