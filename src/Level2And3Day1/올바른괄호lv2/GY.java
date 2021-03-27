package Level2And3Day1.올바른괄호lv2;

import java.util.Stack;

public class GY {

	public static void main(String[] args) {

		String s1 = "()()";
		String s2 = "(())()";
		String s3 = ")()(";
		String s4 = "(()(";

		System.out.println(solution(s1));
		System.out.println(solution(s2));
		System.out.println(solution(s3));
		System.out.println(solution(s4));

	}

	// 10 : 20 ~ 12 : 00
	//
	private static boolean solution(String s) {

//		boolean answer = false;
//
//		Stack<String> stack = new Stack<>();
//		String[] arr = s.split("");
//
//		for (String str : arr) {
//
//			if (!stack.isEmpty() && stack.peek().equals(")"))
//				return false;
//
//			if ((!stack.isEmpty() && stack.peek().equals("(")) && str.equals(")")) {
//				stack.pop();
//			} else {
//				stack.push(str);
//			}
//
//		}
//
//		if (stack.isEmpty())
//			return true;
//
//		return answer;

		// ===========================================================================

//		boolean answer = false;
//
//		Stack<Character> stack = new Stack<>();
//
//		for (int i = 0; i < s.length(); i++) {
//
//			char c = s.charAt(i);
//
//			if (!stack.isEmpty() && stack.peek() == ')')
//				return false;
//
//			if ((!stack.isEmpty() && stack.peek() == '(') && c == ')') {
//				stack.pop();
//			} else {
//				stack.push(c);
//			}
//
//		}
//
//		if (stack.isEmpty())
//			return true;
//
//		return answer;

		// ===========================================================================

		//이전풀이 이것만 효율성 통과
		
		boolean answer = true;

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stack.push(s.charAt(i));
			} else {
				if (stack.isEmpty()) {
					return false;
				} else {
					stack.pop();
				}
			}
		}

		if (stack.isEmpty()) {
			answer = true;
		} else {
			answer = false;
		}

		return answer;

	}

}
