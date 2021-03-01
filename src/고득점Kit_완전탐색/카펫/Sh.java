package 고득점Kit_완전탐색.카펫;

public class Sh {

	public static void main(String[] args) {
		int brown = 24;
		int yellow = 24;
		
		int[] answer = solution(brown,yellow);
		

	}

	// 12:22 ~ 12:52 
	// (0.03ms, 52.2MB) - > (0.10ms, 52.3MB)
	private static int[] solution(int brown, int yellow) {
		int[] answer = null;
		
		answer = new int[2];
		
		int total = brown+yellow;
		
		for(int i=0; i<Math.sqrt(yellow); i++) {
			if(yellow % (i+1) == 0) {
				int[] temp = new int[2];
				temp[0] = yellow/(i+1)+2;
				temp[1] = i+1+2;
				
				if(total % (temp[0]*temp[1]) == 0) {
					answer = temp;
					break;
				}
			
			}
		}
		
		return answer;
	}

}
