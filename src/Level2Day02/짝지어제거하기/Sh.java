package Level2Day02.짝지어제거하기;

import java.util.Deque;
import java.util.LinkedList;

public class Sh {

	public static void main(String[] args) {
		String s = "baabaa";
		
		int answer = solution(s);

	}

//	private static int solution(String s) {
//		int answer = -1;
//		
//		String[] alphs = {"aa","bb","cc","dd","ee","ff","gg","hh","ii","jj","kk","ll","mm","nn","oo","pp","qq","rr","ss","tt","uu","vv","ww","xx","yy","zz"};
//		
//		
//		for(int i=0; i<alphs.length; i++) {
//			boolean bool = false;
//			while(s.contains(alphs[i])) {
//				s = s.replace(alphs[i], "");
//				bool = true;
//			}
//			if(bool)
//				i=-1;
//		}
//		
//		System.out.println(s);
//		if(s.length() == 0)
//			answer = 1;
//		else
//			answer = 0;
//		return answer;
//	}
	
	private static int solution(String s) {
		int answer = -1;
		Deque<String> deque = new LinkedList<>();
		String[] temp = s.split("");
		
		for(String str : temp) {
			
			if(deque.isEmpty())
				deque.offerFirst(str);
			else {
				if(str.equals(deque.peekFirst()))
					deque.pollFirst();
				else
					deque.offerFirst(str);
			}
		}
		
		if(deque.isEmpty())
			answer = 1;
		else
			answer = 0;
		return answer;
	}

}
