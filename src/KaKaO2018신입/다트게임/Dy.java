package KaKaO2018신입.다트게임;

public class Dy {

	public static void main(String[] args) {

		String s = "1D2S#10S";
		
		System.out.println(solution(s));

	}
	
	private static int solution(String dartResult) {
        int answer = 0;
        int[] score = new int[3];
        dartResult = dartResult + " ";
        dartResult = dartResult.replaceAll("10", "!");
        String point = dartResult.replaceAll("[^0-9!]", "");
        String bonus = dartResult.replaceAll("[^SDT]", "");
        String temp = dartResult.replaceAll("[SDT][^*#]", "@");
        String option = temp.replaceAll("[^#@*]", "");
        
        for(int i=0; i<3; i++) {
        	int point2 = 0;
        	if(point.substring(i,i+1).equals("!")) {
        		point2 = 10;
        	}else {
            	point2 = Integer.parseInt(point.substring(i,i+1));
        	}
        	if(bonus.substring(i, i+1).equals("S")) {
        		score[i] = point2;
        	}else if(bonus.substring(i, i+1).equals("D")){
        		score[i] = point2 * point2;
        	}else if(bonus.substring(i, i+1).equals("T")){
        		score[i] = point2 * point2 * point2;
        	}
        	
        	if(option.substring(i, i+1).equals("#")) {
        		score[i] *= -1;
        	}else if(option.substring(i, i+1).equals("*")) {
        		score[i] *= 2;
        		if(i > 0) {
        			score[i-1] *= 2;
        		}
        	}
        }
        for(int key: score) {
        	answer += key;
        }
		return answer;
    }

}
