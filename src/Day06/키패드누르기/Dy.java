package Day06.키패드누르기;

public class Dy {

	public String solution(int[] numbers, String hand) {
        String answer = "";
        int[][] phone = {{1,2,3},{4,5,6},{7,8,9},{10,0,11}};
        int[] right = {3,0};
        int[] left = {3,2};
        
        for(int i = 0; i<numbers.length; i++) {
        	for(int j=0; j<4; j++) {
        		for(int k = 0; k<3; k++) {
        			if(numbers[i] == phone[j][k]) {
        				if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
        					answer += "L";
        					left[0] = j;
        					left[1] = k;
        				}else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
        					answer += "R";
        					right[0] = j;
        					right[1] = k;
        				}else {
        					int rLength = Math.abs(right[0]-j) + Math.abs(right[1]-k);
        					int lLength = Math.abs(left[0]-j) + Math.abs(left[1]-k);
        					if(rLength > lLength) {
        						answer += "L";
            					left[0] = j;
            					left[1] = k;
        					}else if(rLength < lLength) {
        						answer += "R";
            					right[0] = j;
            					right[1] = k;
        					}else {
        						if(hand.equals("left")) {
        							answer += "L";
                					left[0] = j;
                					left[1] = k;
        						}else {
        							answer += "R";
                					right[0] = j;
                					right[1] = k;
        						}
        					}
        				}
        			}
        		}
        	}
        }
        
        return answer;
    }
}
