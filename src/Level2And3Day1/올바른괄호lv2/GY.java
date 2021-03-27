package Level2And3Day1.올바른괄호lv2;

public class GY {

	public static void main(String[] args) {
		
		String s = "(()())";
		
		System.out.println(solution(s));

	}

	private static boolean solution(String s) {
		boolean answer = true;
		
		int open = 0;
		int close = 0;
		
		for(int i=0; i<s.length(); i++) {
			char temp = s.charAt(i);
			if(temp == '(')
				open++;
			else
				close++;
			if(open<close)
				return false;
		}
		
		if(open != close)
			return false;
		return answer;
		
	}

}
