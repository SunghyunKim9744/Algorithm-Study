package KaKaO2020Intern.키패드누르기;

public class Dy {

	public static void main(String[] args) {
		int[] n = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		String h = "left";
		
		System.out.println(solution(n, h));

	}
	
	private static String solution(int[] numbers, String hand) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int[] left = {0,3};
        int[] right = {2,3};
        
        for(int key: numbers) {
        	if(key % 3 == 2 || key == 0) {
        		int[] position = {1, key / 3};
        		if(key == 0)
        			position[1] = 3;
        		int rLength = Math.abs(right[0]-position[0]) + Math.abs(right[1]-position[1]);
        		int lLength = Math.abs(left[0]-position[0]) + Math.abs(left[1]-position[1]);
        		if(rLength > lLength) {
        			left = position;
        			sb.append("L");
        		}else if(rLength < lLength) {
        			right = position;
        			sb.append("R");
        		}else {
        			if(hand.equals("right")) {
        				right = position;
        				sb.append("R");
        			}else {
        				left = position;
        				sb.append("L");
        			}
        		}
        	}else if(key % 3 == 1) {
        		left[0] = 0;
        		left[1] = key / 3;
        		sb.append("L");
        	}else {
        		right[0] = 2;
        		right[1] = key / 3 -1;
        		sb.append("R");
        	}
        }
        answer = sb.toString();
        
        return answer;
    }

}
