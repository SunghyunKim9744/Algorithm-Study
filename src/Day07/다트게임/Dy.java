package Day07.다트게임;

public class Dy {
	public static void main(String[] args) {
		String dartResult = "1D2S#10S";
		System.out.println(solution(dartResult));
	}
//11:31 ~ 12:49
	public static int solution(String dartResult) {
		int answer = 0;
		StringBuilder sb = new StringBuilder();
		dartResult = dartResult.replaceAll("10", "a");
		String[] point = dartResult.replaceAll("[^\\da]", "").split("");
		String[] bonus = dartResult.replaceAll("[^SDT]", "").split("");
		sb.append(dartResult);
		sb.append("@");
		dartResult = sb.toString();
		dartResult = dartResult.replaceAll("[SDT][^*#]", "!");
		dartResult = dartResult.replaceAll("@", "");
		String[] option = dartResult.replaceAll("[^*#!]", "").split("");
		int[] score = new int[3];
		for(int i=0; i<bonus.length; i++) {
			if(!point[i].equals("a")) {
				score[i] += Integer.parseInt(point[i]);
			}else {
				score[i] += 10;
			}
			if(bonus[i].equals("D")) {
				score[i] *= score[i];
			}else if(bonus[i].equals("T")) {
				score[i] *= score[i] * score[i];
			}
			
			if(option[i].equals("#")) {
				score[i] *= -1; 
			}else if(option[i].equals("*")) {
				score[i] *= 2;
				if(i>0) {
					score[i-1] *=2;
				}
			}
		}
		for(int key: score)
			answer += key;
		
		return answer;
	}
}
