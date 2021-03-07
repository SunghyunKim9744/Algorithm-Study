package 고득점Kit.Greedy.조이스틱;

public class Sh {

	public static void main(String[] args) {
		
		String name1 = "JEROEN",name2 = "BBBAAB";
		
		//System.out.println(solution(name1));
		System.out.println(solution(name2));

	}

	// 4:20 ~ 5:28
	// 반대로 가는 로직 + currentCursor 설정을 구하는데 오래걸림
	private static int solution(String name) {
		int answer = 0;
		
		int len = name.length();
		char[] strs = name.toCharArray();
		int currentCursor = 0;
		for(int i=0; i<strs.length; i++) {
			if(strs[i]!='A') {
				
				
				int alphCnt = 'Z'-'A'+1;
				int up = strs[i]-'A';
				int down = alphCnt+'A'-strs[i];
				
				answer = up > down ? answer+down : answer+up;
				System.out.println(answer);
				
				
			}
		}
		
		int direction1 = 0;
		for(int i=0; i<strs.length; i++) {
			if(strs[i]!='A') {
				int right = i-currentCursor;
				int left = len+currentCursor-i;
				currentCursor = i;
				direction1 = right>left ? direction1+left : direction1+right;
				if(left<=right)
					break;
			}
		}
		
		int direction2 = 1;
		currentCursor = strs.length-1;
		for(int i=strs.length-1; i>=0; i--) {
			if(strs[i]!='A') {
				direction2 += currentCursor-i;
				currentCursor = i; 
			}
		}
		answer = direction1>direction2 ? direction2+answer : direction1+answer;
		
		System.out.println(direction1+" : "+direction2);
		return answer;
	}

}
