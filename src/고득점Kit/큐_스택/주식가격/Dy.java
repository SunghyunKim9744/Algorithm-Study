package 고득점Kit.큐_스택.주식가격;

import java.util.Stack;

//9:45 ~ 2:51
public class Dy {

	public static void main(String[] args) {
		int[] prices = { 4,5,4,3,2 };
		for(int key: solution(prices)) {
			System.out.println(key);
		}
	}
	//효율성 테스트 5 〉	통과 (76.50ms, 69.2MB)
	public static int[] solution(int[] prices) {
		int[] answer = new int[prices.length];
		for(int i=0; i<prices.length; i++)
			answer[i] = prices.length-1-i;
		
		Stack<String> s =  new Stack<String>();
		
		for(int i=0; i<prices.length; i++) {
			int peekCnt = 0;
			while(!s.empty() && Integer.parseInt(s.peek()) > prices[i]) {
				answer[i-1-peekCnt] = 1 + peekCnt;
				s.pop();
				peekCnt++;
				if(!s.empty() && s.peek().contains("a")) {
					peekCnt += Integer.parseInt(s.peek().substring(1));
					s.pop();
				}
			}
			
			if(s.size()!=0 && peekCnt !=0)
				s.push("a"+peekCnt);
			
			s.push(Integer.toString(prices[i]));
			
		}
        return answer;
	}

}