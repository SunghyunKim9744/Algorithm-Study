package KaKaO2018신입.다트게임;

public class Sh {

	public static void main(String[] args) {
		String dartResult = "1S2D*3T";
		
		int answer = solution(dartResult);

	}

	// 2:11
	private static int solution(String dartResult) {
		int answer = 0;
		
		dartResult = dartResult.replace("10", "A");
		
		String[] score = dartResult.replaceAll("[^0-9A]","").split("");
		String[] bonusOp = dartResult.replaceAll("[0-9A]","\\.").substring(1).split("\\.");
		
		int[] scores = new int[3];
		for(int i=0; i<3; i++) {
			int tempScore = score[i].equals("A") ? 10 : Integer.parseInt(score[i]);
			
			String bonus = bonusOp[i].substring(0,1);
			if(bonus.equals("S")) {
				tempScore = tempScore;
			}
			else if(bonus.equals("D")) {
				tempScore *= tempScore;
			}
			else {
				tempScore *= tempScore * tempScore;
			}
			
			if(bonusOp[i].length() == 2) {
				String option = bonusOp[i].substring(1,2);
				if(option.equals("*")) {
					tempScore = tempScore*2;
					if(i>=1) {
						scores[i-1] *=2;
					}
				}
				else {
					tempScore = -tempScore;
				}
			}
			
			scores[i] = tempScore;
			
		}
		
		for(int i : scores)
			answer +=i;
		return answer;
	}

}
