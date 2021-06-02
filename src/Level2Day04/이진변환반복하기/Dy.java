package Level2Day04.이진변환반복하기;

public class Dy {

	public static void main(String[] args) {

		String s = "110010101001";
		System.out.println(solution(s));
	}
	
	public static int[] solution(String s) {
        int[] answer = new int[2];
        
        while(!s.equals("1")) {
        	String[] num = s.split("");
        	StringBuilder sb = new StringBuilder();
        	int length = 0;
        	for(String key: num) {
        		if(key.equals("0")) {
        			answer[1]++;
        		}else {
        			length++;
        		}
        	}
        	
        	while(length > 1) {
        		sb.insert(0, length % 2);
        		length /= 2;
        	}
        	
        	if(length == 1) {
        		sb.insert(0, 1);
        	}
        	s = sb.toString();
        	answer[0]++;
        }
        
        return answer;
    }

}
