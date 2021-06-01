package Level2Day03.괄호회전하기;

import java.util.ArrayDeque;
import java.util.Deque;

public class Sh {

	public static void main(String[] args) {
		String s = "";

		int answer = solution(s);

	}

	private static int solution(String s) {
		int answer = 0;

		for (int i = 0; i < s.length(); i++) {
			String temp = s + s.substring(0, i);
			String str = temp.substring(i);
			if (check(str))
				answer++;
		}
		return answer;
	}

	private static boolean check(String str) {
		Deque<String> deque = new ArrayDeque<>();
        String[] strs = str.split("");
        
        for(String s : strs){
            
            if(s.equals("]") || s.equals("}") || s.equals(")")){
                if(deque.isEmpty())
                    return false;
                if(s.equals("]") && !deque.peekFirst().equals("["))
                    return false;
                else if(s.equals("}") && !deque.peekFirst().equals("{"))
                    return false;
                else if(s.equals(")") && !deque.peekFirst().equals("("))
                    return false;
                deque.pollFirst();
            }
            else{
                deque.offerFirst(s);
            }
        }
        
        if(!deque.isEmpty())
            return false;
        return true;
	}

}
