package KaKaO2020Intern.키패드누르기;

public class Sh {

	public static void main(String[] args) {
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";

		String answer = solution(numbers,hand);
		System.out.println(answer);
	}

	// 2:10
	private static String solution(int[] numbers, String hand) {
		String answer = "";
		StringBuilder strb = new StringBuilder();
		
		int left = 10;
		int right = 12;
		for(int i : numbers) {
			if(i== 1 || i==4 || i==7) {
				left = i;
				strb.append("L");
			}
			else if(i==3 || i==6 || i==9) {
				right = i;
				strb.append("R");
			}
			else {
				if(i==0)
					i = 11;
				int midX = (i-1)/3;
				int midY = (i-1)%3;
				
				int leftX = (left-1)/3;
				int leftY = (left-1)%3;
				
				int rightX = (right-1)/3;
				int rightY = (right-1)%3;
				
				int leftDis = Math.abs(leftX-midX)+Math.abs(leftY-midY);
				int rightDis =  Math.abs(rightX-midX)+Math.abs(rightY-midY);
				
				if(leftDis > rightDis) {
					right = i;
					strb.append("R");
				}
				
				else if(leftDis < rightDis) {
					left = i;
					strb.append("L");
				}
				
				else {
					if(hand.equals("right")) {
						right = i;
						strb.append("R");
					}
					else {
						left = i;
						strb.append("L");
					}
				}
			}
		}
		answer = strb.toString();
		return answer;
	}

}
