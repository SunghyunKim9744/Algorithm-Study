package Level2And3Day2.다음큰숫자;

public class GY {

	public static void main(String[] args) {
		int n1 = 78;
		int n2 = 15;
		
		solution(n1);

	}

	private static int solution(int n) {
		int answer = 0;
		
		String a = Integer.toBinaryString(n);
		
		return answer;
		
	}

}


//public int solution(int n) {
//    int answer = 0;
//    String a = Integer.toBinaryString(n);
//    int count1 = countOne(a);
//    
//    for(int i = n+1; ; i++) {
//    	String a2 = Integer.toBinaryString(i);
//    	int count2 = countOne(a2);
//    	
//    	if(count1 == count2) {
//    		return i;
//    	}
//    }
//}
//public int countOne(String a) {
//	char[] count = a.toCharArray();
//	int countone = 0;
//	for(char c : count) {
//		if(c == '1') countone++;
//	}
//	
//	return countone;
//}