package Level2And3Day2.다음큰숫자lv2;

// 1:47 ~
public class Dy {

	public static void main(String[] args) {
		int n1 = 78;
		int n2 = 15;
		
		solution(n1);
		solution(n2);
	}
	
	private static int solution(int n) {
		int answer = 0;
		int count = binary(n);
		
		while(true) {
			n++;
			if(count == binary(n)) {
				answer = n;
				break;
			}
		}
		return answer;
		
	}
	
	private static int binary(int n) {
		int answer = 0;
		while(n != 0) {
			if(n % 2 == 1)
				answer++;
			n /= 2;
		}
		return answer;
	}

//	private static int solution(int n) {
//		int answer = 0;
//		StringBuilder sb = new StringBuilder();
//		while(n > 1) {
//			sb.insert(0 , n % 2);
//			n /= 2;
//		}
//		if(n == 1)
//			sb.insert(0, 1);
//		
//		String temp = sb.toString();
//		char[] binaryN = temp.toCharArray();
//		int count = 0;
//		for(char key: binaryN) {
//			if(key == '1')
//				count++;
//		}
//		int count1 = 0;
//		for(int i = 0; i<binaryN.length; i++) {
//			if(binaryN[i] == '1') {
//				count1++;
//			}else {
//				break;
//			}
//		}
//		for(int i = 1; i<binaryN.length; i++) {
//			if(binaryN[i] == '1' && binaryN[i-1] != '1') {
//				binaryN[i] = '0';
//				binaryN[i-1] = '1';
//				for(int j = i+1; j<binaryN.length; j++) {
//					if(j < binaryN.length - count + 1 + count1) {
//						binaryN[j] = '0';
//					}else {
//						binaryN[j] = '1';
//					}
//				}
//				break;
//			}
//		}
//		
//		if(count == count1 && count != binaryN.length) {
//			binaryN[count-1] = '0';
//		}
//		
//		if(count == binaryN.length)
//			binaryN[1] = '0';
//		
//		for(char key: binaryN) {
//			answer *= 2;
//			answer += Character.getNumericValue(key);
//		}
//		
//		if(count == binaryN.length || count == count1)
//			answer = (answer * 2) + 1;
//		
//		if(count == 1)
//			answer*=2;
//		return answer;
//		
//	}

}
