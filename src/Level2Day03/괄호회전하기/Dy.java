package Level2Day03.괄호회전하기;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Dy {

	public static void main(String[] args) {

		String n = "{{{{{{{";
		System.out.println(solution(n));
	}
	
	public static int solution(String s) {
        int answer = s.length();
        String[] s2 = s.split("");
        Queue<String> queue = new LinkedList<>();
        for(String key: s2) {
        	queue.add(key);
        }
        boolean ok;
        for(int i=0; i<s.length(); i++) {
        	ok = true;
        	Stack<String> stack = new Stack<>();
        	for(String key: queue) {
        		if(key.equals("[") || key.equals("{") || key.equals("(")) {
        			stack.push(key);
        		}else {
        			switch (key) {
					case "]":
						if(!stack.isEmpty() && stack.peek().equals("[")) {
							stack.pop();
						}else {
							ok = false;
						}
						break;
					case "}":
						if(!stack.isEmpty() && stack.peek().equals("{")) {
							stack.pop();
						}else {
							ok = false;
						}
						break;
					case ")":
						if(!stack.isEmpty() && stack.peek().equals("(")) {
							stack.pop();
						}else {
							ok = false;
						}
						break;
					default:
						break;
					}
        		}
        		if(!ok) {
        			answer--;
        			break;
        		}
        	}
        	if(ok && !stack.isEmpty()) {
        		answer--;
        	}
        	queue.add(queue.poll());
        }
        return answer;
    }

}
