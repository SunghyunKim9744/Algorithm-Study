package 자료구조;

import java.util.Stack;

public class Stack_GY {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();
		stack.push(1); // 값 1 추가
		stack.push(2); // 값 2 추가
		stack.push(3); // 값 3 추가
		stack.pop(); // 가장 위에 있는 값(top)인 3이 삭제된다.
		stack.peek();
		
		Stack<Integer> stack2 = new Stack<>();
		stack2.push(13);
		stack2.push(81);
		stack2.size(); // stack의 크기 출력 : 2
		stack2.empty(); // stack이 비어있는지 확인 : false (비어있으면 true)
		stack.contains(1); // stack에 1이 있는지 확인 : false(있으면 true)
		
	}

}
