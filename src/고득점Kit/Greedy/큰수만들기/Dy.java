package 고득점Kit.Greedy.큰수만들기;

// 1:17 ~ 
public class Dy {

	public static void main(String[] args) {
		String number1 = "111199", number2 = "1231234", number3 = "4177252841";

		int k1 = 2, k2 = 3, k3 = 4;
		
		String test = "12121712";
		

		System.out.println(solution(number1, k1));
	}
	// 테스트 10 〉	통과 (1548.75ms, 396MB) 8, 12 실패
//	private static String solution(String number, int k) {
//		String answer = "";
//		StringBuilder sb = new StringBuilder();
//		while(k > 0) {
//			for(int i=0; i<9; i++) {
//				String temp = Integer.toString(9-i);
//				if(number.indexOf(temp) != -1 && number.indexOf(temp) <= k) {
//					sb.append(temp);
//					k -= number.indexOf(temp);
//					number = number.substring(number.indexOf(temp)+1);
//					break;
//				}
//			}
//		}
//		sb.append(number);
//		answer = sb.toString();
//        return answer;
//	}
	//테스트 10 〉	통과 (22.53ms, 58.6MB) 8, 12 실패
//	private static String solution(String number, int k) {
//		String answer = "";
//		StringBuilder sb = new StringBuilder();
//		int startNum = 0;
//		while(k > 0) {
//			for(int i=0; i<9; i++) {
//				String temp = Integer.toString(9-i);
//				if(number.indexOf(temp,startNum) != -1 && number.indexOf(temp, startNum) - startNum <= k) {
//					sb.append(temp);
//					k -= (number.indexOf(temp,startNum) - startNum);
//					startNum = number.indexOf(temp, startNum) + 1;
//					break;
//				}
//			}
//		}
//		sb.append(number.substring(startNum));
//		answer = sb.toString();
//        return answer;
//	}
	
	private static String solution(String number, int k) {
		String answer = "";
		StringBuilder sb = new StringBuilder();
		int startNum = 0;
		while(k > 0) {
			for(int i=0; i<9; i++) {
				String num = Integer.toString(9-i);
				String temp = number.substring(startNum, startNum+k);
				if(temp.indexOf(num) != -1 && temp.indexOf(num) <= k) {
					sb.append(num);
					k -= temp.indexOf(num);
					startNum = temp.indexOf(num) + 1;
					System.out.println(temp.indexOf(num));
					break;
				}
			}
		}
		sb.append(number.substring(startNum));
		answer = sb.toString();
        return answer;
	}
	
}
