package Level2Day02.짝지어제거하기;

import java.util.Stack;

public class Dy {

	public static void main(String[] args) {
		String s = "baabaa";
		System.out.println(solution(s));
	}

	private static int solution(String s) {
        int answer = 0;
        String[] temp = s.split("");
        Stack<String> stack = new Stack<>();
        
        for(String key: temp) {
        	if(!stack.isEmpty() && stack.peek().equals(key)) {
        		stack.pop();
        	}else {
        		stack.push(key);
        	}
        }
        
        if(stack.isEmpty()) {
        	answer = 1;
        }
        
        return answer;
    }

}
